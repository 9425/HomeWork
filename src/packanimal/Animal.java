package packanimal;

public class Animal {
    private String name;
    private String color;
    private double weight;
    static int count=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal() {
        count++;
    }

    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        count++;
    }
    public int getCountAnimal(){
        System.out.println("您已经创建的类的个数为："+count);
        int a=10;
        return a;
    }

}
