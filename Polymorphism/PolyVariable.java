class ProgrammingLanguage {
    public void display() {
      System.out.println("I am Programming Language.");
    }
  }
  
  class Java extends ProgrammingLanguage {
    public void display() {
      System.out.println("I am Object-Oriented Programming Language.");
    }
  }
  
  class PolyVariable {
    public static void main(String[] args) {
  
        ProgrammingLanguage pl;
  
        // create object of ProgrammingLanguage
        pl = new ProgrammingLanguage();
        pl.display();
  
        // create object of Java class
        pl = new Java();
        pl.display();
    }
  }