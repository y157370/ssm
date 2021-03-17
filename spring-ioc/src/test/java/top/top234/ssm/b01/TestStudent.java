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
 *
 * spring基于xml文件的配置方式
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

    @Test
    public void t3() {
        Student student3 = (Student) ac.getBean("student3");
        System.out.println(student3);
    }

    @Test
    public void t4() {
        Student student4 = (Student) ac.getBean("student4");
        System.out.println(student4);
    }

    @Test
    public void t5() {
        Student student5 = (Student) ac.getBean("student5");
        System.out.println(student5 );
    }

    @Test
    public void t6() {
        Student student = (Student) ac.getBean("student6");
        System.out.println(student);
    }
}
