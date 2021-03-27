package KaoShi;

import java.util.Arrays;
import java.util.Comparator;

public class Cat implements Comparator<Cat> {
    private int weight;
    private String name;
    private String color;

    public Cat() {
    }

    public Cat(int weight, String name, String color) {
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

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

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight>o2.weight){
        return 1;}
        if (o1.weight<o2.weight){
            return -1;
        }
        return 0;
    }
    public String toString(){
        return "名字："+name+","+"颜色："+color+","+"重量："+weight;
    }

    public static void main(String[] args) {
        Cat xiaoHuang=new Cat(3,"小黄","黄色");
        Cat xiaoBai=new Cat(2,"小白","白色");
        Cat xiaoHei=new Cat(5,"小黑","黑色");
        Cat[] cats={xiaoHuang,xiaoBai,xiaoHei};
        Arrays.sort(cats,(Cat cat1,Cat cat2)->{return cat1.weight-cat2.weight;});
        for (Cat cat:cats){
            System.out.println(cat);
        }
        System.out.println();
    }
}
