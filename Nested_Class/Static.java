package Nested_Class;

class MotherBoard{
    static class USB{
        int usb2=2;
        int usb3=1;
        
        int getPorts(){
            return usb2+usb3;
        }
    }
}

public class Static {
    public static void main(String[] args) {
        MotherBoard.USB usb_Object=new MotherBoard.USB();
        //we don't need object of outer class to craete object of static nested class

        System.out.println(usb_Object.getPorts());
    }
}
