package HomeWorks;

public class Line {
    private Point pointA;
    private Point pointB;
    //private double k;
    private String color;
    private double lineWidth;
    //private double lineLenth;

    public Line() {
    }

    public Line(Point pointA, Point pointB, String color, double lineWidth) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.color = color;
        this.lineWidth = lineWidth;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
    }

    public double lineLenth(){
        double lineLenth=(pointA.getX()-pointB.getX())*(pointA.getX()-pointB.getX())+(pointA.getY()-pointB.getY())*(pointA.getY()-pointB.getY());
        double lineLenth2=Math.sqrt(lineLenth);
        return lineLenth2;
    }
    public double k(){
        double k=(pointA.getY()-pointB.getY())/(pointA.getX()-pointB.getX());
        return k;
    }
}
