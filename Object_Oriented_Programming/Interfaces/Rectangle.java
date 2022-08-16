package Interfaces;
public class Rectangle implements Polygon {

    int l, b;

    Rectangle(){

    }

    Rectangle(int l, int b){
        this.l=l;
        this.b=b;
        System.out.println(Polygon.type);
    }

    public void getArea(int len, int bre){
        System.out.println("AREA = "+len*bre);
    }

    public void getType(){
        System.out.println("IT IS A RECTANGLE...");
    }

    public static void main(String[] args) {
        Rectangle obj=new Rectangle(13, 15);
        obj.getArea(obj.l, obj.b);
        obj.getType();
    }
}
