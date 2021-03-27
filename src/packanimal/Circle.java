package packanimal;

import HomeWorks.Point;

import java.text.DecimalFormat;
import java.util.Objects;

public class Circle extends Shape {
    private Point yuanXin;
    private double radius;

    public Circle() {
    }

    public Circle(Point yuanXin, double radius) {
        this.yuanXin = yuanXin;
        this.radius = radius;
    }

    public Circle(String color, Point yuanXin, double radius) {
        super(color);
        this.yuanXin = yuanXin;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getPerimeter() {
        DecimalFormat df=new DecimalFormat("0.0000");
        double zhouChang=2*Math.PI*radius;
        df.format(zhouChang);
        System.out.println("圆周长:"+df.format(zhouChang));
        return zhouChang;
    }

    @Override
    public double getArea() {
        DecimalFormat df=new DecimalFormat("0.0000");
        System.out.println("圆面积："+df.format(Math.PI*(radius*radius)));
        return Math.PI*(radius*radius);
    }

    @Override
    public void move(int x, int y) {
        double x0=this.yuanXin.getX()+x;
        double y0=this.yuanXin.getY()+y;
        this.yuanXin.setX(x0);
        this.yuanXin.setY(y0);
        System.out.println("新的坐标为："+"("+this.yuanXin.getX()+","+this.yuanXin.getY()+")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(yuanXin, circle.yuanXin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yuanXin, radius);
    }

    @Override
    public String toString() {
        return
                "圆心:" +"("+yuanXin.getX()+","+yuanXin.getY()+")"+
                ", 半径:" + radius
                ;
    }
}
