package HomeWorks;

import java.util.Objects;

public class LargeDog extends Dog{
    private double weight;
    public static void info()
    {
        System.out.println("LargeDog类描述巨型犬。");
    }
    public LargeDog(int weight)
    {
        this.weight=weight;
    }
    public LargeDog(String name, String color, double age,double weight)
    {
        super(name,color,age);
        this.weight=weight;
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("weight"+weight);
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            System.out.println("是同一只狗");
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            System.out.println("不是同一只狗");
            return false;
        }
        if (!super.equals(o)) {
            System.out.println("不是同一只狗");
            return false;
        }
        LargeDog largeDog = (LargeDog) o;
        if (Double.compare(largeDog.weight, weight) == 0){
            System.out.println("是同一只狗");
            return true;
        }else {
            System.out.println("不是同一只狗");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
