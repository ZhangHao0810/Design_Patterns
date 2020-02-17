package 策略模式;

public class Context {

	private Strategy strategy;
	
	public Context (String type,double money){
		
		Strategy normalStrategy = new NormalStrategy();
        strategy = normalStrategy;
        strategy.regulation(money);
		
	}
}
