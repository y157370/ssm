package top.top234.ssm;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.top234.ssm.service.SomeService;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/15 17:08.
 *
 * ********************************
 *
 * @author top234
 *
 *         关于spring容器的使用:
 *
 *         ApplicationContext接口的实现类:
 *         1.ClassPathXmlApplicationContext:从类路径中加载spring的配置文件
 *         2.FileSystemXmlApplicationContext:从本机磁盘中加载spring的配置文件
 */
public class TestSomeServiceImpl {
    /**
     * 使用spring容器创建并获取对象
     */
    @Test
    public void t1() {
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建spring容器,ApplicationContext
        //ApplicationContext表示spring的容器,通过容器就可以获取对象了
        //ClassPathXmlApplicationContext:从类路径中加载spring的配置文件
        //spring容器默认创建对象的时机:在创建容器时会创建配置文件中所有的对象
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //3.从容器中获取对象  参数为配置文件中bean的id  返回值为Object类型
        Object someService = context.getBean("someService");
        //使用对象
        SomeService service = (SomeService) someService;
        service.doSome();
    }

    /**
     * 获取spring容器中java对象的信息,ApplicationContext 中方法的使用
     */
    @Test
    public void t2() {
        //创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //1.获取容器中对象的数量
        int beanDefinitionCount = ac.getBeanDefinitionCount();
        System.out.println("有对象:" + beanDefinitionCount + "个");
        //1.获取容器中每个对象的名称
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
