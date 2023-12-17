package exercise;

// BEGIN
public class App {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(3, 3), 4);
        printSquare(circle);
    }

    public static void printSquare(Circle circle) {
        String square = null;
        try {
            square = String.valueOf(Math.round(circle.getSquare()));
        } catch (NegativeRadiusException e) {
            throw new RuntimeException("Не удалось посчитать площадь");
        }
            System.out.println(square + "\nВычисление окончено");
    }
}
// END
