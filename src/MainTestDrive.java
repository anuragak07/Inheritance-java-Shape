public class MainTestDrive {
    public static void main(String Args[]) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Area of rectangle is");
        rectangle.calculateArea();
        System.out.println("Perimeter of rectangle is");
        rectangle.calculatePerimeter();
        System.out.println("---------------------");
        Square square = new Square(4);
        System.out.println("Area of square is");
        square.calculateArea();
        System.out.println("Perimeter of square is");
        square.calculatePerimeter();
    }
}
