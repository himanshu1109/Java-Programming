public class Circle{
    public double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Circle c = new Circle(10);
        double area = c.getArea();
        System.out.println("Area is : " + area);
    }
}
