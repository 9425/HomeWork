package KaoShi;

import java.util.Arrays;
import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    private String name;
    private String color;
    private int weight;
    public Dog(){

    }
    public Dog(String name,String color,int weight){
        this.name=name;
        this.color=color;
        this.weight=weight;
    }
    public String toString(){
        return "狗狗名字是："+name+","+"颜色是："+color+","+"重量为："+weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int compareTo(Dog dog){
        return this.weight-dog.weight;
    }

    public static void main(String[] args) {
        Dog xiaoHuang=new Dog("小黄","黄色",10);
        Dog xiaoHei=new Dog("小黑","黑色",13);
        Dog xiaoBai=new Dog("小白","白色",12);
        Dog[] dogs={xiaoHuang,xiaoHei,xiaoBai};

        /*Arrays.sort(dogs);*///这是实现了comparable，然后直接调用sort进行排序
        /*Arrays.sort(dogs,new WeightComparator());这是实现了Comaparator,然后直接传入比较器进行排序
        for (Dog dog:dogs){
            System.out.println(dog);
        }*/
        /*Arrays.sort(dogs,new Comparator<Dog>(){//这里是使用了匿名内部类，将匿名内部类作为参数传入进行比较
            public int compare(Dog dog1,Dog dog2){
                return dog2.weight-dog1.weight;
            }
        });*/


        //这里是使用了lambda表达式进行排序操作，lambda表达式可以被当作实现了某个接口的对象，然后将此对象作为参数进行传入
        Arrays.sort(dogs,(Dog dog1,Dog dog2)->{return dog1.weight-dog2.weight;});
        for (Dog dog:dogs){
            System.out.println(dog);
        }
    }
}
class WeightComparator implements Comparator<Dog>{
    public int compare(Dog dog1,Dog dog2){
        return dog1.getWeight()-dog2.getWeight();
    }
}
