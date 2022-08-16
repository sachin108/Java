package Encapsulation;

class Person{
    private int age;

    public void setAge(int age){
        if(age>=0)              // will prevent user to Set -ve age i.e. invalid
            this.age=age;
    }

    public int getAge(){
        return age;
    }

}

public class DataHiding {
    public static void main(String[] args) {
        Person ultron=new Person(); 
        // we can only access public members of Person class
        ultron.setAge(10); 
        System.out.print(ultron.getAge());
    }
}
/**
 * we can use access modifiers (private, protected) to achieve data hiding
 */