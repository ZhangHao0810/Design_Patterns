package 代理模式.Proxy;

/**
 * 真实角色（明星艺人）：
 * 真实角色实现类：这里的真实角色中其实只做了一个唱歌的操作，这是真实角色真正的业务逻辑部分
 */
public class RealStar implements Star{
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }
    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }
    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }
    @Override
    public void sing() {
        System.out.println("张学友.sing()");//真实角色的操作：真正的业务逻辑
    }
    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}