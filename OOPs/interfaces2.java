
interface Drawable{
    void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("Draw using a compass");
    }
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Draw using a scale");
    }
}


public class interfaces2 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        c1.draw();
        r1.draw();
    }
}
