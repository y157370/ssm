package top.top234.ssm.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Don't forget to be awesome!
 *
 * Created by LEARNING on 2021/3/17 12:12.
 *
 * ********************************
 *
 * @author top234
 * @Aspect:是aspectJ中的注解,用来表示当前类是切面类 切面类:是用来给业务方法增加功能的类,在这个类中有切面的功能代码
 *         使用位置:修饰类
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 定义方法,方法是实现切面功能的
     * 方法定义要求:
     * 1.公共方法 public
     * 2.方法没有返回值 void
     * 3.方法名自定义
     * 4.方法可以有参数,也可以没有,如果有参数,参数不是自定义的,有几个值可选择
     *
     * @Before() :前置通知注解
     *         属性:value,是切入点表达式,表示切面功能执行的位置
     *         使用位置:修饰方法
     *         特点:
     *         1.在目标方法之前执行
     *         2.不会改变目标方法的执行结果
     *         3.不会影响目标方法的执行
     */
    @Before("execution(public void doSome(String, Integer))")
    public void myBefore() {
        //切面要执行的功能代码
        System.out.println("方法执行前");
    }
}
