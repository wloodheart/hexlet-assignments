package exercise;

// BEGIN
class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area + balconyArea;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public void setBalconyArea(double balconyArea) {
        this.balconyArea = balconyArea;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + area + " метров на " + floor + " этаже";
    }

    @Override
    public int compareTo(Home anotherHome) {
        double anotherArea = anotherHome.getArea();

        if (area > anotherArea) return 1;
        else if (area < anotherArea) return -1;
        else return 0;
    }
}
// END
