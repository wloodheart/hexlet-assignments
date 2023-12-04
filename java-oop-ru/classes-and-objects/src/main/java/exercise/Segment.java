package exercise;

// BEGIN
class Segment {
    private Point beginPoint;
    private Point endPoint;
    private final Point midPoint = new Point();

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Segment() {
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getMidPoint() {
        midPoint.setX((beginPoint.getX() + endPoint.getX()) / 2);
        midPoint.setY((beginPoint.getY() + endPoint.getY()) / 2);
        return midPoint;
    }
}
// END
