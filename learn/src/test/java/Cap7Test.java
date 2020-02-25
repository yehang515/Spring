import com.enjoy.cap6.config.Cap6MainConfig;
import com.enjoy.cap7.config.Cap7MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap7Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);
        System.out.println("IOC 容器创建完成。。。。。");
        app.close();
    }
}
