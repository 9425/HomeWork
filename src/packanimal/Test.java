package packanimal;

import HomeWorks.Line;
import HomeWorks.Point;

public class Test {
    public static void main(String[] args) {
        /*Animal cat=new Animal("猫","白色",1.5);
        String color=cat.getColor();
        System.out.println("动物颜色为："+color);
        Animal dog=new Animal();
        cat.getCountAnimal();
        System.out.println(Math.sqrt(1.14141));*/

        /*Point pointA=new Point(1,2);
        Point pointB=new Point(2,4);
        Line line=new Line(pointA,pointB,"黑色",0.5);
        System.out.println(line.getColor());
        System.out.println(line.getLineWidth());
        System.out.println(line.lineLenth());
        System.out.println(line.k());*/

        /*Point yuanXin=new Point(1,2);
        Shape s1=new Circle("黑色",yuanXin,3);
        //System.out.println("面积："+s1.getArea());
        //System.out.println("周长："+s1.getPerimeter());
        s1.getArea();
        s1.getPerimeter();
        System.out.println(s1.getColor());
        s1.move(1,2);
        System.out.println(s1.toString());*/

       /* Point A=new Point(0,0);
        Point B=new Point(0,1);
        Point C=new Point(1,0);
        Shape s2=new Triangle("红的",A,B,C);
        s2.getPerimeter();
        s2.getArea();
        //double l1=Math.sqrt((A.getX()-B.getX())*(A.getX()-B.getX())+(A.getY()-B.getY())*(A.getY()-B.getY()));
       // System.out.println( l1);
        //s2.getArea();
        s2.move(1,1);
        System.out.println( s2.toString());*/
        System.out.println(Math.abs(-3));

        Point leftUp=new Point(0,1);
        Point rightLow=new Point(1,0);
        Shape rectangle=new Rectangle(leftUp,rightLow);
        /*rectangle.getPerimeter();
        rectangle.getArea();*/
        rectangle.move(1,1);
        //rectangle.toString();
    }
}
