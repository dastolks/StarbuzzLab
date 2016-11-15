package lab.exercise;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();
        
        
        Shape circle2 = new Circle();
        System.out.println("\nCircle with red border");
        circle2 = new RedShapeDecorator(circle2);
        circle2.draw();
        
        Shape rectangle2 = new Rectangle();
        System.out.println("\nRectangle with red border");
        rectangle2 = new RedShapeDecorator(rectangle2);
        rectangle2.draw(); 

        // do output for decorated shapes here...
        
    }
}
