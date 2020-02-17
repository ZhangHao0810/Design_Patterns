package 状态模式;

public class EatingState extends AntFarmState{
	AntFarmContext afc;
	public EatingState(AntFarmContext afc) {
		this.afc=afc;
	}
	public void invite() {
		System.out.println("邀请别的小鸡");
        //执行相应操作后在环境类中更改所处的状态，邀请了小鸡此时给环境类设置访客状态
		
	}
 
}
