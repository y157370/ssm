package top.top234.ssm.service.imp;

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

    @Test
    public void doSome() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        //通过代理的对象执行方法,目标方法执行时,增强了功能
        someService.doSome("haha",25);

    }
}