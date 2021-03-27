package KaoShi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {
    //duiComparator进行测试
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "年龄："+age+"，"+"名字："+name;
    }

    @Override
    public int compareTo(Person o) {
        /*if (this.age==o.age){
            return 0;
        }
        if (this.age>o.age){
            return 1;
        }
        if (this.age<o.age){
            return -1;
        }*/
        //return this.age-o.age;
        //return this.name.compareTo(o.name);
        return Integer.compare(this.age,o.age);
    }
}
class Test2{
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Person zhangSan=new Person(23,"zhangSan");
        Person liSi=new Person(20,"liSi");
        Person wangWu=new Person(21,"wangWu");
        Person zhaoLiu=new Person(28,"zhaoLiu");
        list.add(zhangSan);
        list.add(liSi);
        list.add(wangWu);
        list.add(zhaoLiu);
        Collections.sort(list);
        for (Object a:list){
            System.out.println(a);
        }
    }
}
