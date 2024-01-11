 package homework;

public class Main {

    /*Создать интерфейс Shape, содержащий методы для подсчета площади и периметра фигуры
    и классы прямоугольник и круг, реализующие этот интерфейс.
    В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
    Написать метод, вычисляющий общую площадь фигур нескольких видов.*/
    public static void main(String[] args) {

        Shape circle1 = new Circle(4);
        System.out.println("The area of this figure = "+
                (String.format("%.2f",circle1.calculateFigureArea())));
        circle1.calculateFigurePerimeter();
        System.out.println();

        Shape circle2 = new Circle(6);
        System.out.println("The area of this figure = "+
                (String.format("%.2f",circle2.calculateFigureArea())));
        circle2.calculateFigurePerimeter();
        System.out.println();

        Shape rectangle1 = new Rectangle(2, 10);
        System.out.println("The area of this figure = "+
                (String.format("%.2f",rectangle1.calculateFigureArea())));
        rectangle1.calculateFigurePerimeter();
        System.out.println();

        Shape rectangle2 = new Rectangle(5,5);
        System.out.println("The area of this figure = "+
                (String.format("%.2f",rectangle2.calculateFigureArea())));
        rectangle2.calculateFigurePerimeter();
        System.out.println();

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


