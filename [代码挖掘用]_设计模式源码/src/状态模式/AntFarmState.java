package 状态模式;

public abstract class AntFarmState {
    //写这两个方法就是为了子类完成相应操作中重写
	public void  invite(){
		System.out.println("已有访客，请勿重复邀请");
	}
	public void expel(){
		System.out.println("当前没有访客");
	}
}
