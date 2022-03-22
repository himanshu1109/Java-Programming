public class Circle {
    private double radius;
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of circle = " + c.getArea());
        Circle cir = new Circle(5);
        System.out.println("Area of another circle = " + cir.getArea());
    }
}
