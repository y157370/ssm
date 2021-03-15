package top.top234.ssm.b01;

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
 */
public class TestStudent {
    @Test
    public void t1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("b01/applicationContext.xml");
        Student student = (Student)ac.getBean("student");
        System.out.println(student);
    }
}
