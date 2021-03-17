package top.top234.ssm.diAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/16 12:25.
 *
 * ********************************
 *
 * @author top234
 *
 *         基于注解方式的依赖注入:
 * @Component: 创建对象的功能, 等同于xml配置文件中的<bean>
 *         属性: value: 对象的名称,也就是bean的id值,value的值是唯一的,创建的对象在整个spring容器中只有一个
 *         使用位置:修饰类
 *
 *
 *         spring中其余用来创建对象的注解:
 * @Repository: 用于持久层创建对象, 访问数据库, 修饰dao实现类
 * @Service: 用于业务层创建对象, 修饰service实现类
 * @Controller: 用于控制层创建对象, 与用户进行交互
 *         以上三个注解的使用语法与@Component相同. 都用于创建对象,但这三个注解还有额外的含义,用来给项目的对象分层
 */
//@Component(value = "myStudent")
//@Component("myStudent")
@Component//在不指定对象名称时,spring会默认提供类名首字母小写的对象名称
public class Student {
    /**
     * @Value:简单类型的属性赋值 属性:value是string类型的,表示简单类型的属性值
     *         使用位置:
     *         1.修饰属性,无需set方法,推荐使用
     *         2.修饰set方法
     */
    @Value(value = "yiwu")
    private String name;

    @Value("24")
    private int age;

    private String addr;

    @Value("USA")
    public void setAddr(String addr) {
        this.addr = addr;
    }


    /**
     * 引用类型的属性赋值之@Autowired:
     *
     * @Autowired: spring框架提供的注解, 实现引用类型属性赋值
     *         spring中通过注解给引用类型赋值,使用的是自动注入原理,支持byName, byType
     * @Autowired默认使用的是byType自动注入
     *
     * byName的使用方式:使用 Qualifier注解指定bean的id
     *  @Qualifier("mySchool")
     *  @Autowired
     *
     * @Autowired注解的属性:
     * required:Boolean类型,默认为true
     * required=true:表示赋值失败时程序报错,并终止执行
     * required=false:表示赋值失败时赋值为null,程序继续执行,不报错
     *
     * 引用类型的属性赋值之@Resource:
     * @Resource是jdk中提供的注解,spring框架提供了对这个注解的功能支持,可以使用它给引用类型额属性赋值
     * 支持 byName ByType ,默认为byName,先使用byName自动注入,若赋值失败会自动再使用byType,当显式指定name属性值,
     * 则只会使用byName注入,不会在byName注入失败时调用byType
     *     @Resource(name = "mySchool")
     *
     */
    @Qualifier("mySchool")
    @Autowired(required = false)
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", school=" + school +
                '}';
    }
}
