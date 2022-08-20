//Thread creation by implementing the Runnable Interface

class Demo implements Runnable{
    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId() +" is running");
        }
        catch(Exception e){
            System.out.println("e.getMessage()");
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            Thread thread=new Thread(new Demo());
            thread.start();
        }        
    }

}

