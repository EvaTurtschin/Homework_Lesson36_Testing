package homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Shape circle1 = new Circle(5.06);
    Shape circle2 = new Circle(2.43);
    Shape rectangle1 = new Rectangle(7, 4);
    Shape rectangle2 = new Rectangle(2,3);
    double resultExpected = circle1.calculateFigureArea()+ circle2.calculateFigureArea()+
            rectangle1.calculateFigureArea() + rectangle2.calculateFigureArea();
    Shape [] shapes = {circle1, circle2, rectangle1, rectangle2};
    @Test
    public void testAggregateArea() {
        assertEquals(resultExpected, Main.aggregateArea(shapes));
    }
}