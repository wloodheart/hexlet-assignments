package exercise;

// BEGIN
public record Circle(Point point, int radius) {

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }

        return radius * radius * Math.PI;
    }
}
// END
