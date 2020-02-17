package 状态模式;

public class AntFarmContext {
	AntFarmState state;//持有一个具体状态的实例，不一定是哪种状态
 
	public AntFarmState getState() {
		return state;
	}
 
	public void setState(AntFarmState state) {
		this.state = state;
	}
	
	public void invite(){
		state.invite();//委托给具体状态类运行
	}
	public void expel(){
		state.expel();
	}
}
