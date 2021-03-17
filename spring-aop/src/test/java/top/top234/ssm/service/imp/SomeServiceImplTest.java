package top.top234.ssm.service.imp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.top234.ssm.service.SomeService;

import static org.junit.Assert.*;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/17 15:09.
 *
 * ********************************
 *
 * @author top234
 */
public class SomeServiceImplTest {
    static ApplicationContext ac;

    @BeforeClass
    public static void beforeClass() {
        String config = "applicationContext.xml";
        ac = new ClassPathXmlApplicationContext(config);
    }

    //前置通知
    @Test
    public void doSome() {
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        //通过代理的对象执行方法,目标方法执行时,增强了功能
        someService.doSome("haha", 25);
    }

    //后置通知
    @Test
    public void doOther() {
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(someService.doOther("alex"));
    }
    //后置通知,并改变方法的返回值
    @Test
    public void doOther2() {
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(someService.toStudent());
    }

    //环绕通知
    @Test
    public void doOther3() {
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(someService.toStudent());
    }
}