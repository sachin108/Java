import javax.naming.InitialContext;

public class Initializer_Block{
    //Initializer block
    {   
        System.out.println("InitialzerBlock class's object has been created!");
    }
    public static void main(String[] args){ 
        Main obj=new Main();
        Initializer_Block obj2=new Initializer_Block();
    }
}

class Main{
    //Initializer block
    {   
        System.out.println("It will execute everytime an object will be created of this class i.e Main");
    }
}