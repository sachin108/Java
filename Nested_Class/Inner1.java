package Nested_Class;

class CPU{  //outer class

    double price;

    CPU(){

    }

    CPU(double price){
        this.price=price;
    }


    class Processor{ //inner class
        
        int number_of_cores;
        String manufacturer;
        
        double getCache(){
            return 4.3;
        }
    }

    class RAM{ //inner class
        
        double memory;
        String manufactures;
        
        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class Inner1 {
    public static void main(String[] args) {
        //object of class CPU
        CPU dell=new CPU(55644);

        //object of inner class Processor using outer class CPU
        CPU.Processor amd = dell.new Processor();

        //object of inner class RAM using outer class CPU
        CPU.RAM ram = dell.new RAM();

        System.out.println("PRICE = "+dell.price);
        System.out.println(amd.getCache());
        System.out.println(ram.getClockSpeed());
    }
}
