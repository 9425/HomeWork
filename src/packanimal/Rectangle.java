package packanimal;

import HomeWorks.Point;

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Objects;

public class Rectangle extends Shape {
    private Point leftUp;
    private Point rightLow;
    /*private Point leftLow;
    private Point rightUp;*/
    public Rectangle() {
        super();
    }

    public Rectangle(Point leftUp, Point rightLow) {
        this.leftUp = leftUp;
        this.rightLow = rightLow;
    }

    public Rectangle(String color, Point leftUp, Point rightLow) {
        super(color);
        this.leftUp = leftUp;
        this.rightLow = rightLow;
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
        double width=Math.abs(leftUp.getX()-rightLow.getX());
        double height=Math.abs(leftUp.getY()-rightLow.getY());
        System.out.println("正方形周长："+df.format(2*(width+height)));
        return 2*(width+height);
    }

    @Override
    public double getArea() {
        DecimalFormat df=new DecimalFormat("0.0000");
        double width=Math.abs(leftUp.getX()-rightLow.getX());
        double height=Math.abs(leftUp.getY()-rightLow.getY());
        System.out.println("正方形面积："+df.format(width*height));
        return width*height;
    }

    @Override
    public void move(int x, int y) {
        Point leftLow=new Point(0,0);
        Point rightUp=new Point(0,0);

        leftLow.setX(leftUp.getX());
        leftLow.setY(rightLow.getY());
        rightUp.setX(rightLow.getX());
        rightUp.setY(leftUp.getY());
        //System.out.println(rightUp.getX()+","+rightUp.getY());

        leftUp.setX(leftUp.getX()+x);
        leftUp.setY(leftUp.getY()+y);

        leftLow.setX(leftLow.getX()+x);
        leftLow.setY(leftLow.getY()+y);

        rightUp.setX(rightUp.getX()+x);
        rightUp.setY(rightUp.getY()+y);

        rightLow.setX(rightLow.getX()+x);
        rightLow.setY(rightLow.getY()+y);
        System.out.println("移动后正方形新坐标为："
                +"左上："+"("+leftUp.getX()+","+leftUp.getY()+") "
                +"左下："+"("+leftLow.getX()+","+leftLow.getY()+") "
                +"右上："+"("+rightUp.getX()+","+rightUp.getY()+") "
                +"右下："+"("+rightLow.getX()+","+rightLow.getY()+")"
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(leftUp, rectangle.leftUp) &&
                Objects.equals(rightLow, rectangle.rightLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftUp, rightLow);
    }

    @Override
    public String toString() {
        System.out.println("矩形：" +
                "左上：" +"("+leftUp.getX()+","+leftUp.getY()+")"+
                ", 右下：" +"("+rightLow.getX()+","+rightLow.getY()+")");
        return "矩形：" +
                "左上：" +"("+leftUp.getX()+","+leftUp.getY()+")"+
                ", 右下：" +"("+rightLow.getX()+","+rightLow.getY()+")";
    }
}
