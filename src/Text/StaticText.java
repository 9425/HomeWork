package Text;

public class StaticText {
    private static int nextId=1;
    private int id;

    public StaticText() {
    }

    public StaticText(int id) {
        this.id = id;
    }
    public void setId(){
        this.id=nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        StaticText text1=new StaticText();
        text1.setId();
        System.out.println(text1.getId()+"....");
        StaticText text2=new StaticText();
        text2.setId();
        System.out.println(text2.getId());
        StaticText text3=new StaticText();
        text3.setId();
        System.out.println(text3.getId());

        /*
        * 从以上的测试中可以知道，static是类域，可以直接用类名.的方式直接调用
        * static修饰的成员变量，因此，当我们在某一个对象中修改了static所修饰的
        * 变量，在接下来新创建的对象中，如果新创建使用到static修饰的变量，那么这个变量是
        * 上一个被修改之后的
        *
        *
        * //同时在java中对于参数的赋值：如果是将一个基本类型赋值给另外一个基本类型，
        * 如果所赋值的基本类型发生改变，那么原来的基本类型是不会发生改变的
        *
        * //但是如果赋值的是一个引用的话，此时相当于有两个引用指向一个对象，被赋值的引用发生变化的
        * 话，将会导致原来的引用所指向的对象发生变化，因为他们都指向了同一个对象
        * */
    }
}
