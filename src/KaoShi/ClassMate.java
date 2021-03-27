package KaoShi;

import java.lang.reflect.Array;
import java.util.*;

public class ClassMate {
    private int age;
    private String name;
    private int score;

    public ClassMate(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public ClassMate() {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ClassMate{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassMate classMate = (ClassMate) o;
        return age == classMate.age &&
                score == classMate.score &&
                this.name.equals(classMate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, score);
    }
}
class AgeCompator implements Comparator<ClassMate>{
    @Override
    public int compare(ClassMate o1, ClassMate o2) {
        return o1.getAge()-o2.getAge();
    }
}
class ScoreCompator implements Comparator<ClassMate>{
    @Override
    public int compare(ClassMate o1, ClassMate o2) {
        return o1.getScore()-o2.getScore();
    }
}
class Test3{
    public static void main(String[] args) {
        ClassMate yanghui=new ClassMate(23,"yanghui",88);
        ClassMate yanganjiao=new ClassMate(21,"yanganjiao",98);
        ClassMate yangshirou=new ClassMate(21,"yanganjiao",98);
        List<ClassMate> list=new ArrayList<>();
        list.add(yanghui);
        list.add(yanganjiao);
        list.add(yangshirou);
        ScoreCompator scoreCompator=new ScoreCompator();
        AgeCompator ageCompator=new AgeCompator();
        //Collections.sort(list,ageCompator);
        Collections.sort(list,scoreCompator);
        System.out.println(list);
        for (Object a:list){
            System.out.println(a);
        }
        System.out.println(yanghui.equals(yanganjiao));
        System.out.println(yanganjiao.equals(yangshirou));
    }
}
