package Nested_Class;

class Car{

        String carName, carType;
        Car(String name, String type){
            this.carName=name;
            this.carType=type;
        }

        private String getCarName(){
            return this.carName;
        }

    class Engine{
        String engineType;
        
        // We can access the members of the outer class by using this keyword. 
        void setEngine(){
            if(Car.this.carType.equals("4WD")){
                if(Car.this.carName.equals("Crysler")){
                    this.engineType="Smaller";
                }
                else{
                    this.engineType="Bigger";
                }
            }
            else{
                this.engineType="Bigger";
            }
        }
        /**
         * We are using this keyword to access the carType variable of the outer class. 
         * Instead of using this.carType we have used Car.this.carType.
         * It is because if we had not mentioned the name of the outer class Car, then this 
         * keyword will represent the member inside the inner class.
         * 
         * Although the getCarName() is a private method, we are able to access it from the inner class.
         */

         String getEngineType(){
            return this.engineType;
        }
    }
}

public class Inner2 {
    public static void main(String[] args) {
        Car car1=new Car("Mazda", "8WD");
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine type of 8WD = "+engine.getEngineType());

        Car car2=new Car("Crysler", "4WD");
        Car.Engine engine2 = car2.new Engine();
        engine2.setEngine();
        System.out.println("Engine type of 8WD = "+engine2.getEngineType());

    }
}

