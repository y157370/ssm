package top.top234.ssm.diAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/16 15:08.
 *
 * ********************************
 *
 * @author top234
 *
 *
 *         spring基于注解的配置方式
 */
public class TestStudent {
    @Test
    public void t1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("diAnnotation/applicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
