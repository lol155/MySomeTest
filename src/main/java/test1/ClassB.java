package test1;

/**
 * Created by admin on 2016/5/19.
 */
public class ClassB extends ClassA{
    public ClassB() {
        System.out.println("ClassB created!");
    }
    @Override
    public void method1(){
        System.out.println("ClassB method run!");
    }
}
