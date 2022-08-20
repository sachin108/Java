// Thread creation by extending the Thread class

class Demo extends Thread{

    // overrided from Thread Class
    @Override
    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId() +" is running");
        }
        catch(Exception e){
            System.out.println("e.getMessage()");
        }
    }
}

class UsingThread {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            Demo thread=new Demo();
            thread.start();
            //  Start() invokes the run() method on the Thread object
        }        
    }
}