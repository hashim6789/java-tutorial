
class Shape{
    int length;
    int height;

    Shape(int length, int height){
        this.length = length;
        this.height = height;
    }
}

class Triangle extends Shape{
    Triangle(int length, int height) {
        super(length, height);
    }

    void area (){
        System.out.println(0.5 * this.length * this.height);
    }

}

class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        super(length, breadth);
    }

    void area(){
        System.out.println(this.length * this.height);
    }
}

public class Inheritance3 {
    /*
     * heirarchical inheritance
     */

    public static void main(String[] args) {
        Triangle t3 = new Triangle(5, 4);
        Rectangle r1 = new Rectangle(5, 4);
        t3.area();
        r1.area();
        
    }
}
