import com.enjoy.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Cap6Test {
    Object lock = new Object();
    @Test
    public void test01(){

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        System.out.println("IOC 容器创建完成。。。。。");
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }

    }

    @Test
    public void test02(){
        Thread threadA = new ThreadSleep();
        threadA.setName("ThreadSleep");
        Thread threadB = new ThreadNotSleep();
        threadB.setName("ThreadNotSleep");
        threadA.start();

        try {
            Thread.sleep(1000);
            System.out.println("Main sleep!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String, String> map = new HashMap<String, String>();
        threadB.start();
//        while(true){
//          //  System.out.println("111");
//        }
    }

    private class ThreadSleep extends Thread {

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.print(threadName +" will take the lock\r\n");
            try {
                synchronized (lock){
                    System.out.println(threadName + " take the lock");
                    Thread.sleep(5000);
                    System.out.println("Finish the work"+threadName);
                }

            }catch (Exception e){

            }
        }
    }


    private class ThreadNotSleep extends Thread {
        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.print(threadName +"will take the lock");
            synchronized (lock){
                System.out.println(threadName + "take the lock");

            }
        }
    }


}

