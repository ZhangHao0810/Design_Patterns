/**
 * @author ZhangHao
 * @date 2019/11/7 9:22
 * @Description： 经典的单例模式. 构造函数私有,杜绝了外界构造本类函数.
 *
 */
public class Singleton  {
    private static Singleton uniqeInstance=null;

    private Singleton(){

    }

    /** 2019/11/7 9:26
     * 保证Singleton类只有一个对象
    */
    public static Singleton getInstance(){
        if (uniqeInstance == null) {
            uniqeInstance=new Singleton();
        }
        return uniqeInstance;
    }
}
