import org.junit.Test;
import test1.ClassC;

/**
 * Created by admin on 2016/5/19.
 */
public class Test1 {
    @Test
    public void _测试创建子类构造怎么走(){
        ClassC classC = new ClassC();
        classC.method1();
    }
}
