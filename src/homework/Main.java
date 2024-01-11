 package homework;

public class Main {
    public static void main(String[] args) {

        Shape circle1 = new Circle(4);

        Shape circle2 = new Circle(6);

        Shape rectangle1 = new Rectangle(2, 10);

        Shape rectangle2 = new Rectangle(5,5);

        Shape [] shapes = {circle1, circle2,rectangle1,rectangle2};

       System.out.println("Aggregated Area of all this figures = "
               +(String.format("%.2f",aggregateArea(shapes))));
    }
    public static double aggregateArea (Shape[]shapes){

        double result = 0;
        for (Shape shape : shapes){
            result+= shape.calculateFigureArea();
        }
        return result;
    }}


