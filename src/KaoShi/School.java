package KaoShi;

public class School implements Cloneable{
    private String schoolName;
    private int stuNums;
    private Student2 stu;

    public School() {
    }

    public School(String schoolName, int stuNums, Student2 stu) {
        this.schoolName = schoolName;
        this.stuNums = stuNums;
        this.stu = stu;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStuNums() {
        return stuNums;
    }

    public void setStuNums(int stuNums) {
        this.stuNums = stuNums;
    }

    public Student2 getStu() {
        return stu;
    }

    public void setStu(Student2 stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", stuNums=" + stuNums +
                ", stu=" + stu +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        School school=this;
        return school;
        //自动产生的克隆方法
        //return (School)super.clone();//此处已经将返回的类型进行了强制类型转换了,但是这里显示将其进行强制转换是多余的操作，是不必要的
    }
}


class Student2{
    private String name;
    private int age;
    private String sex;

    public Student2() {
    }

    public Student2(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

class test4{
    public static void main(String[] args) throws CloneNotSupportedException {
        School s1=new School();
        s1.setSchoolName("实验小学");
        s1.setStuNums(100);
        Student2 stu1=new Student2("zhangsan",20,"男");
        s1.setStu(stu1);
        System.out.println(s1);
        Object s2=s1.clone();
        System.out.println(s2);
        School s3=(School)s2;
        s3.getStu().setName("杨晖");
        s3.setSchoolName("希望小学");
        s3.setStuNums(200);
        //此处经过测试，如果只是重写方法而不改写，将仅仅实现浅克隆
        System.out.println(s3);
        System.out.println(s1);
    }
}


class School2 implements Cloneable{
    private String schoolName;
    private int stuNums;
    private Student3 stu;

    public School2() {
    }

    public School2(String schoolName, int stuNums, Student3 stu) {
        this.schoolName = schoolName;
        this.stuNums = stuNums;
        this.stu = stu;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStuNums() {
        return stuNums;
    }

    public void setStuNums(int stuNums) {
        this.stuNums = stuNums;
    }

    public Student3 getStu() {
        return stu;
    }

    public void setStu(Student3 stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", stuNums=" + stuNums +
                ", stu=" + stu +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student3 student3=new Student3(this.stu.getName(),this.stu.getAge(),this.stu.getSex());
        String schoolName=this.schoolName;
        int stuNums=this.stuNums;

        School2 school2=new School2(schoolName,stuNums,student3);
        return school2;
        /*School2 s=null;
        s=(School2) super.clone();
        s.stu=(Student3) stu.clone();
        return (School2)super.clone();*/
    }
}

//implements Cloneable
class Student3 {
    //要实现深克隆，需要将Student也进行实现Cloneable接口
    private String name;
    private int age;
    private String sex;

    public Student3() {
    }

    public Student3(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

   /* @Override
    protected Object clone() throws CloneNotSupportedException {
        Student3 s=null;
        s=(Student3)super.clone();
        return s;
    }*/
}

class Test5{
    public static void main(String[] args) throws CloneNotSupportedException {
        School2 s1=new School2();
        s1.setSchoolName("实验小学");
        s1.setStuNums(100);
        Student3 stu1=new Student3("yanghui",30,"男");
        s1.setStu(stu1);
        System.out.println(s1);
        School2 s2=(School2) s1.clone();
        System.out.println(s2);
        //s2.getStu().setName("杨安姣");
        s2.setSchoolName("希望小学");
        s2.setStuNums(200);
        s2.getStu().setName("安姣");
        System.out.println(s2);
        System.out.println(s1);

    }
}