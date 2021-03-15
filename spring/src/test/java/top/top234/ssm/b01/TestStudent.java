package top.top234.ssm.b01;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/15 18:55.
 *
 * ********************************
 *
 * @author top234
 */
public class TestStudent {
    private static ApplicationContext ac;

    @BeforeClass
    public static void beforeClass() {
        ac = new ClassPathXmlApplicationContext("b01/applicationContext.xml");
    }

    @Test
    public void t1() {
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }


    @Test
    public void t2() {
        Student student2 = (Student) ac.getBean("student2");
        System.out.println(student2);
    }
}
