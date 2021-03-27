package HomeWorks;

import java.util.Objects;

public class Dog {
    private String name="noname";
    private String color="unkonw";
    private double age=0.0;
    public static void info(){
        System.out.println("Dog类描述狗这种动物。");
    }
    public Dog(String name,String color){
        this.name=name;
        this.color=color;
        this.age=0;
    }
    public Dog(String name,String color,double age){
        this(name, color);
        this.age=age;
    }
    public Dog() {
    }
    public void setDog(String name,String color,double age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void show(){
        System.out.println("name："+name);
        System.out.println("color："+color);
        System.out.println("age："+age);
    }
    public void run(){
        System.out.println("我可以跑。");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        if (Double.compare(dog.age, age) == 0 &&
                Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color)){
            System.out.println("是同一只小狗！");
            return true;
        }else {
            System.out.println("不是同一只小狗！");
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}
