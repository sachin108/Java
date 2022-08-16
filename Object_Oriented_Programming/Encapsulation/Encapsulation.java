package Encapsulation;

class Area {

    int length;
    int breadth;
  
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
  
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
  }

/*
We bundled these fields and methods inside a single class.

Here, the fields and methods can be accessed from other classes as well. Hence, this is not data hiding.
**This is only encapsulation.** 

*/
  
  public class Encapsulation {
    public static void main(String[] args) {
        Area rectangle = new Area(5, 6);
        rectangle.getArea();
    }
  }
