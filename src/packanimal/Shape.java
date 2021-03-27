package packanimal;

public abstract class Shape {
    private String color;
    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getPerimeter();//计算周长
    public abstract double getArea();//计算面积
    public abstract void move(int x,int y);//将图形分别移动x和距离
}
