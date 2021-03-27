package KaoShi;

import java.util.Objects;

public class Student {
    private String stuNum;
    private double score;
    private int age;

    public Student(String stuNum, double score, int age) {
        this.stuNum = stuNum;
        this.score = score;
        this.age = age;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
        //return 17*age;
    }

    @Override
    public String toString() {
        return "学号："+getStuNum()+"，"+"分数："+getScore()+","+"年龄："+getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return false;
        }
        Student stu=(Student)obj;
        if (this.stuNum==stu.stuNum&&this.score==stu.score&&this.age==stu.age){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //这样克隆出来的对象就是深克隆对象
        Student student=new Student(this.stuNum,this.score,this.age);
        return student;
    }
}
class Test1{
    public static void main(String[] args) throws CloneNotSupportedException {
        Student xiaoMIng=new Student("03160944",100,23);
        Student xiaoMIng2=new Student("03160944",100,23);
        System.out.println(xiaoMIng.equals(xiaoMIng2));
        System.out.println(xiaoMIng.hashCode());
        System.out.println(xiaoMIng.toString());
        Object a=xiaoMIng.clone();
    }
}
