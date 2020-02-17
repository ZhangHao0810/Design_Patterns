package 外观模式.Facade;

public class Facade
{
    private SubSystem01 obj1=new SubSystem01();
    private SubSystem02 obj2=new SubSystem02();

    public void method()
    {
        obj1.method1();
        obj2.method2();

    }
}