package decorator;

import coffeebar.Drink;

/**
 * @author ZhangHao
 * @date 2019/11/3 10:32
 * @Description： 牛奶调料,扩展自装饰者.
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {

        super(obj);
        super.setDescription("牛奶奶");
        super.setPrice(2.0f);
    }
}
