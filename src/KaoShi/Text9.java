package KaoShi;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Text9 {
    public static void main(String[] args) {
        int x=32;
        byte y=127;
        int y1=33;
        char aaa=97;
        int b=32+'A';
        char b1=97;
        /*System.out.println(y);
        System.out.println(aaa);
        System.out.println(b);
        System.out.println(b1);*/
        int a=-21;
        int b2=~(a);
        //System.out.println(b2);
        int a1=5;
        int a2=3;
        //System.out.println(a1^a2);

        int a3=-5;
        //System.out.println(a3^a2);
         a3+=6;
        //System.out.println(a3);

        int a4=2;
        //System.out.println(a4<<2);
        int a5=-2;
        //System.out.println(~(a5));
        //按位与、按位异或将会连同符号位一起进行运算

        int a6=2;
        //System.out.println(a6>>1);

        int a7=1;
       // System.out.println(a7<<10);

        int a8=1;
        int a9=a8&~(1<<10);
        //System.out.println((a9&(1<<6))!=0);
       // boolean a10=a9&(a8<<6)!=0;
        /*
        * 关于byte、char、int的讨论，当值在-128与127之间之，直接将其存储在常量池中，对byte直接进行赋值
        * 对于char:如果将数字赋值给char引用，将会生成对应的char字符，如果将char字符与int或者byte数字进行相加时，char字符将会变成对应的数字进行相加
        * */
        int[] a10={0,1,2,3,4};
        for (int i=a10.length;i>0;i--){
            int i1=i-1;
            System.out.println(a10[i1]);
        }
    }
}
