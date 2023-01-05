import javax.naming.InitialContext;

public class Initializer_Block{
    //Instance Initialization Block or Initializer block
    {   
        System.out.println("InitialzerBlock class's object has been created!");
    }
    public static void main(String[] args){ 
        Main obj=new Main();
        Initializer_Block obj2=new Initializer_Block();
    }
}

class Main{
    //Instance Initialization Block or Initializer block
    {   
        System.out.println("It will execute everytime an object will be created of this class i.e Main");
    }
}

/*
    we can use the initializer blocks:
        Constructors
        Methods
        Blocks 
 */