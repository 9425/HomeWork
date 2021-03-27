package KaoShi;

import org.omg.CORBA.PRIVATE_MEMBER;

public class FanXingMethod {

    public FanXingMethod() {
    }

    //此处是泛型方法的定义，对于方法的定义首先先给方法加上泛型修饰符，
    //然后才能将泛型符号当作已知的符号进行处理
    public static <T> void print(T[] shuZu){
        for (int i=0;i<shuZu.length;i++){
            System.out.print(" "+shuZu[i]);
        }
    }


    //泛型方法的使用和类是否为泛型无关，java中静态的非静态的方法均可以定义为
    //泛型方法，但是经过下列测试，泛型方法一般用于容器类，无法进行直接处理
    public <T,U>void jiafa(T jiaShu,U beiJiaShu){
        //泛型类型的确定置于返回值类型前面
        Integer a=(Integer) jiaShu;
        Integer b=(Integer)beiJiaShu;
        /*System.out.println(jiaShu);
        System.out.println(beiJiaShu);*/
        //泛型只能使用引用类型，对于基本类型无法进行转换和使用，因此前面
        //使用int进行转换时会发生错误
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        String[] a={"a","b","c","d","e"};
        Character[] b={'1','2','3','4','5'};
        Integer[] c={1,2,3,4,5};
        FanXingMethod.print(a);
    }
}

class Test6{
    public static void main(String[] args) {
        FanXingMethod fanXingMethod=new FanXingMethod();
        int a=1;
        int b=2;
        fanXingMethod.jiafa(a,b);
        //int[] aaa=new int[2];
        //aaa[0]=1;
        //使用new创建一维数组

        //int[][] a1=new int[2][3];
        //使用new创建二维数组

    }
}

class FanXingLei<T1,T2>{
   //和方法一样，要私用泛型，必须提前声明好所要使用的泛型

    /*
    * 关于泛型类中字母的相关意义：
    *      T：Type表示类型
    *      K V：分别代表链值中的key value
    *      E：代表Element
    *      使用时注意确定类型
    *      注意：
    *           泛型只能使用引用类型
    *           泛型声明时字母不能使用静态属性/方法
    * */
    private T1 javaScroe;
    private T2 oracleScroe;
    public FanXingLei(){

    }
    public FanXingLei(T1 javaScroe,T2 oracleScroe){
        this.javaScroe=javaScroe;
        this.oracleScroe=oracleScroe;
    }

    public void setJavaScore(T1 javaScroe){
        this.javaScroe=javaScroe;
    }
    public void setOracleScroe(T2 oracleScroe){
        this.oracleScroe=oracleScroe;
    }
    public T1 getJavaScroe(){
        return javaScroe;
    }
    public T2 getOracleScroe(){
        return oracleScroe;
    }

    public String toString(){
        return "javaScore："+this.getJavaScroe()+","+"oracleScore："+this.getOracleScroe();
    }
    public boolean equals(Object o1){
        if (this==o1){
            return true;
        }
        if (o1==null){
            return false;
        }
        if (getClass()!=o1.getClass()){
            return false;
        }
        FanXingLei fanXingLei=(FanXingLei)o1;
        /*if (javaScroe.equals(((FanXingLei) o1).javaScroe)&&oracleScroe==((FanXingLei) o1).oracleScroe){
            return true;
        }*/
        if (javaScroe.equals(fanXingLei.javaScroe)&&oracleScroe==fanXingLei.oracleScroe){return true;}
        return false;
    }

    public static void main(String[] args) {
        FanXingLei<String,Integer> fanXingLei=new FanXingLei<>();
        fanXingLei.setJavaScore("优秀");
        fanXingLei.setOracleScroe(100);
        System.out.println(fanXingLei);
        FanXingLei<String,Integer> fanXingLei1=new FanXingLei<>("优秀",98);
        System.out.println(fanXingLei1);
        System.out.println(fanXingLei.equals(fanXingLei1));
    }
}