public class toStringX {
    public static void main(String[] args) {
        Name x=new Name("Arya", "Stark");
        System.out.print(x);    //it will print HashCode of object if we won't override toString accrding to our need
    }
}

class Name{
    String fName, lName;
    Name(){
        
    }
    Name(String f, String l){
        fName=f;
        lName=l;
    }

    @Override
    public String toString(){
        return fName+" "+lName;
    }

}