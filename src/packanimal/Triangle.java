package packanimal;

import HomeWorks.Point;

import java.text.DecimalFormat;
import java.util.Objects;

public class Triangle extends Shape {
    private Point A;
    private Point B;
    private Point C;
    public Triangle() {
        super();
    }

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Triangle(String color, Point a, Point b, Point c) {
        super(color);
        A = a;
        B = b;
        C = c;
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
        double l1=Math.sqrt((A.getX()-B.getX())*(A.getX()-B.getX())+(A.getY()-B.getY())*(A.getY()-B.getY()));
        double l2=Math.sqrt((C.getX()-B.getX())*(C.getX()-B.getX())+(C.getY()-B.getY())*(C.getY()-B.getY()));
        double l3=Math.sqrt((C.getX()-A.getX())*(C.getX()-A.getX())+(C.getY()-A.getY())*(C.getY()-A.getY()));
        System.out.println("三角形周长："+df.format(l1+l2+l3));
        return l1+l2+l3;
    }

    @Override
    public double getArea() {
        //S=√[p(p-a)(p-b)(p-c)]
        double l1=Math.sqrt((A.getX()-B.getX())*(A.getX()-B.getX())+(A.getY()-B.getY())*(A.getY()-B.getY()));
        double l2=Math.sqrt((C.getX()-B.getX())*(C.getX()-B.getX())+(C.getY()-B.getY())*(C.getY()-B.getY()));
        double l3=Math.sqrt((C.getX()-A.getX())*(C.getX()-A.getX())+(C.getY()-A.getY())*(C.getY()-A.getY()));
        double p=(l1+l2+l3)/2;
        double s=Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
        DecimalFormat df=new DecimalFormat("0.0000");
        System.out.println("三角形面积："+df.format(s));
        return s;
    }

    @Override
    public void move(int x, int y) {
        this.A.setX(this.A.getX()+x);
        this.A.setY(this.A.getY()+y);
        this.B.setX(this.B.getX()+x);
        this.B.setY(this.B.getY()+y);
        this.C.setX(this.C.getX()+x);
        this.C.setY(this.C.getY()+y);
        System.out.println("A点新坐标："+"("+this.A.getX()+","+this.A.getY()+")");
        System.out.println("B点新坐标："+"("+this.B.getX()+","+this.B.getY()+")");
        System.out.println("C点新坐标："+"("+this.C.getX()+","+this.C.getY()+")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(A, triangle.A) &&
                Objects.equals(B, triangle.B) &&
                Objects.equals(C, triangle.C);
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, C);
    }

    @Override
    public String toString() {
        return "三角形各点坐标为：" +
                "A点：" +"("+A.getX()+","+A.getY()+")"+
                ", B点：" +"("+ B.getX()+","+B.getY()+")"+
                ", C点：" + "("+C.getX()+","+C.getY()+")"
                ;
    }
}
