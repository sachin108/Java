class Polygon {

  // method to render a shape
  public void render() {
    System.out.println("Rendering Polygon...");
  }
}

class Triangle extends Polygon {

}

class Square extends Polygon {

  // renders Square
  public void render() {
    System.out.println("Rendering Square...");
  }
}

class Circle extends Polygon {

  // renders circle
  public void render() {
    System.out.println("Rendering Circle...");
  }
}

public class Main {
  public static void main(String[] args) {
    
    // create an object of Square
    Square s1 = new Square();
    s1.render();    // will render overridden Square class method

    // create an object of Circle
    Circle c1 = new Circle();
    c1.render();    // will render overridden Circle class method

    // create an object of Circle
    Triangle t1 = new Triangle();
    t1.render();    // will render method from Polygon class bcz Triangle class doesn't have any render method
  }
}

/**
 * Polymorphism allows us to create consistent code. 
 * In this example, we can also create different methods: renderSquare() and renderCircle() to render Square and Circle, respectively.
   This will work perfectly. However, for every shape, we need to create different methods. It will make our code inconsistent.
   To solve this, polymorphism in Java allows us to create a single method render() that will behave differently for different shapes.
 */