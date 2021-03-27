package KaoShi;

public enum Colors {
    RED("红色",600),GREEN("绿色",540),BLUE("蓝色",450);
    private String name;
    private int waveLength;
    Colors(String name,int waveLength){
        this.name=name;
        this.waveLength=waveLength;
    }

    public String getName(){
        return name;
    }
    public int getWaveLength(){
        return waveLength;
    }

    @Override
    public String toString(){
        return "名称："+getName()+","+"波长："+getWaveLength();
    }
    /*Colors(String name, int waveLength) {
        this.name = name;
        this.waveLength = waveLength;
    }*/
}
class Test{
    public static void main(String[] args) {
        Colors blue=Colors.BLUE;//这里面的对象相当于类域
        System.out.println(blue.name());
        System.out.println(blue.getName());
        System.out.println(blue.toString());
        System.out.println(blue.ordinal());
    }
}
