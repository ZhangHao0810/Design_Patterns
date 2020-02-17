package 策略模式;

public class NormalStrategy implements Strategy {

	@Override
	public double regulation(double money) {
		
		System.out.println("正常收费: " +money);
		return money;
	}

	
}
