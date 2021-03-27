package HomeWorks;

import java.util.Random;

public class DrinkMan {
    private double huiJiaSteps;
    private double huiJiaDistance;

    public double getDistance() {
        return huiJiaDistance;
    }
    public void setDistance(double huiJiaDistance) {
        this.huiJiaDistance = huiJiaDistance;
    }

    public double getHuiJiaSteps() {
        return huiJiaSteps;
    }

    public void setHuiJiaSteps(int huiJiaSteps) {
        this.huiJiaSteps = huiJiaSteps;
    }

    public DrinkMan() {
    }

    public DrinkMan(int huiJiaSteps, double huiJiaDistance) {
        this.huiJiaSteps = huiJiaSteps;
        this.huiJiaDistance = huiJiaDistance;
    }

    public void goHome(){
        double huiJiaDistance=this.getDistance();
        double moveDistanceX=0;
        double moveDistanceY=0;
        double steps=0;
        double huiJiaEffience;
        while (moveDistanceX<huiJiaDistance){
            //生成醉汉每一步所走的距离
            int n=0;
            double distance=(Math.random()*(n+1));
            //生成醉汉所走的方位
            double angel=(Math.random()*(n+360));//醉汉移动是的角度
            double angelHuDu=Math.toRadians(angel);//醉汉所在方位的弧度
            double angelSin=Math.sin(angelHuDu);//醉汉所在方位的正弦值
            double angelCos=Math.cos(angelHuDu);//醉汉所在方位的余弦值
            moveDistanceX=moveDistanceX+distance*angelSin;//醉汉每走一步向前或向后移动的距离
            moveDistanceY=moveDistanceY+distance*angelCos;//醉汉每走一步向左或向右移动的距离
            steps++;
        }
        huiJiaEffience=this.getHuiJiaSteps()/steps;
        //return huiJiaEffience;
        System.out.println("醉汉回家所需步数："+steps);
       System.out.println("醉汉回家效率："+huiJiaEffience*100+"%");
    }
}
