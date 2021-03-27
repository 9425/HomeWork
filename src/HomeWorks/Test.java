package HomeWorks;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        /*
        for (int i=0;i<5;i++){
            int n=0;
            double num=(Math.random()*(n+360));
            double b=Math.toRadians(num);
            //double radians = Math.toRadians(degrees);
            double a=Math.sin(b);
            System.out.println(num);//角度
            System.out.println(b);//弧度
            System.out.println(a);//余弦值
            //System.out.println(Math.cos(3.1415926));
            System.out.println("------------------");
        }
        */
        DrinkMan drinkMan=new DrinkMan(17,20);
        //double efficiency=drinkMan.goHome();
        //System.out.println(efficiency*100+"%");
        drinkMan.goHome();
    }
}
