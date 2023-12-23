
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

public class Inheritance1 {
    /*
     * single level inheritance
     */

    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 4);
        t1.area();
    }
}
