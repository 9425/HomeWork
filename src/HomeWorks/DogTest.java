package HomeWorks;

public class DogTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("阿黄", "黄色", 3);
        myDog.show();
        myDog.run();
        Dog myDog2 = new Dog("小白", "白色", 3);
        myDog.equals(myDog2);
        System.out.println("**********************************");
        System.out.println(myDog.hashCode());
        LargeDog myDog3=new LargeDog("小灰","灰色",3,10);
        LargeDog myDog4=new LargeDog("小灰","灰色",3,10);
        myDog3.equals(myDog4);
    }
}
