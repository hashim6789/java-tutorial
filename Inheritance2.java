
class Shape{
    int length;
    int height;
    Shape(int length, int height){
        this.length = length;
        this.height = height;
    }
}

class Triangle extends Shape{
    Triangle(int length, int height){
        super(length, height);
    }

    void area(){
        System.out.println((length*height)/2);
    }
}

class EquilateralTraingle extends Triangle{
    EquilateralTraingle(int length){
        super(length, 0);
    }
    void area(){
        System.out.println((Math.sqrt(3)/4)*length*length);
    }
}

public class Inheritance2 {
    /*
     * multy level inheritnce
     */

    public static void main(String[] args) {
        EquilateralTraingle t2 = new EquilateralTraingle(8);
        t2.area();
    }
}
