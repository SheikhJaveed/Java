class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class EquilateralTriangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        t1.area();
        t1.area(4,6);
        t2.area(6,8);

        Circle c1 = new Circle();
        c1.area(23);

        //java does not have multiple inheritance but it has interfaces
    }
}
