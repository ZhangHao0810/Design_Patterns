package 享元模式.Flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }

}