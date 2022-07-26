public class Methods {
    int a, b;   // instance variable
    Methods(int a, int b){
        this.a=a;
        this.b=b;
    }

    //method overLoading
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    int addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Methods obj=new Methods(12, 8);

        System.out.println(obj.addition(obj.a, obj.b));
        System.out.println(add(obj.a, obj.b));          // instance vars can be passed to static methods
        System.out.println(add(obj.a, obj.b, 18));
    }
}
/* 
static methods exist as a single copy for a class while instance methods exist as 
multiple copies depending on the number of instances created for that particular
class. 

Static methods can't access instance methods/variables directly while 
instance methods can access static variables and static methods directly.
*/