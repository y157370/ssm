package top.top234.ssm.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
     * 前置通知
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
    //@Before("execution(public void doSome(String, Integer))")
    public void myBefore() {
        //切面要执行的功能代码
        System.out.println("方法执行前");
    }


    /**
     * 指定通知方法中的参数:joinPoint
     * joinPoint:业务方法,要加入切面功能的业务方法
     * 作用:可以在通知方法中获取方法执行时的信息.例如:方法名称,方法的实参
     * 如果你的切面功能中需要用到方法的信息,就加入joinPoint
     * joinPoint参数的值由框架赋予,且必须是第一个位置的参数
     * joinPoint在所有的通知方法中都可以使用
     */
    //@Before("execution(public void doSome(String, Integer))")
    public void myBefore2(JoinPoint joinPoint) {
        //获取方法的完整定义(方法的签名)
        System.out.println("方法的签名:" + joinPoint.getSignature());
        System.out.println("方法的名称:" + joinPoint.getSignature().getName());

        //获取方法的实参
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    /**
     * 后置通知
     * 定义方法,方法是实现切面功能的
     * 方法定义要求:
     * 1.公共方法 public
     * 2.方法没有返回值 void
     * 3.方法名自定义
     * 4.方法必须有参数,推荐是Object类型,参数名自定义
     *
     * @AfterReturning() :后置通知注解
     *         属性:value,是切入点表达式,表示切面功能执行的位置
     *         returning:自定义的变量,用来表示目标方法的返回值,必须与自定义方法的形参名相同
     *         使用位置:修饰方法
     *         特点:
     *         1.在目标方法之后执行
     *         2.能够获取到目标方法的返回值,可以根据返回值做不同的处理功能
     *         3.可以修改方法的返回值
     */
    //@AfterReturning(returning = "res", value = "execution(* *..*Other(String))")
    public void myAfter(Object res) {
        //切面要执行的功能代码
        System.out.println("方法执行后执行,获取的方法返回值是:" + res);
        //修改方法的返回值
        //String是不可变的,若返回值是可变的,在此处修改返回值对象中的内容,将会改变目标方法的返回值
        res = "new Awesome";
    }

    //@AfterReturning(returning = "stu", value = "execution(* *..*Student())")
    public void myAfter2(JoinPoint joinPoint, Object stu) {
        //切面要执行的功能代码
        System.out.println("方法执行后执行,获取的方法返回值是:" + stu);
        //修改方法的返回值
        //String是不可变的,若返回值是可变的,在此处修改返回值对象中的内容,将会改变目标方法的返回值
        Student student = (Student) stu;
        student.setName("李四");
        student.setAge(23);
        System.out.println(joinPoint.getSignature());
    }


    /**
     * 环绕通知:
     * 可以修改返回值,可以确定方法是否被调用
     * 参数:ProceedingJoinPoint  等同于method 作用:执行目标方法的
     * 返回值:就是目标方法的执行结果,可以被修改
     */
    @Around("execution(* *..*(..))")
    public Object myAround(ProceedingJoinPoint m) throws Throwable {
        //实现环绕通知
        System.out.println("环绕通知:目标方法之前");
        /*
            目标方法的调用:
            等同于method的invoke
         */
        Object proceed = m.proceed();

        System.out.println("环绕通知:目标方法之后");
        //修改目标方法的返回值,可以修改任意类型的返回值
        Student student = new Student();
        student.setName("akk");
        return student;
    }
}
