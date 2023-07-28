package com.ysk.spring.aop.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author ysk
 * @date 2023/7/24 7:02 PM
 */
@EnableAspectJAutoProxy
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.ysk.spring.aop.aspectJ.*.*(..))")
    private void pointCutMethod() {
    }

    /**
     * 环绕通知.
     * 用于定义环绕通知，相当于MethodInterceptor。在使用时需要指定一个value属性，该属性用于指定该通知被植入的切入点。
     *
     * @param pjp pjp
     * @return obj
     * @throws Throwable exception
     */
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-----------------------");
        System.out.println("环绕通知: 进入方法");
        Object o = pjp.proceed();
        System.out.println("环绕通知: 退出方法");
        return o;
    }

    /**
     * 前置通知.
     * 用于定义前置通知，相当于BeforeAdvice。在使用时，通常需要指定一个value属性值，该属性值用于指定一个切入点表达式(可以是已有的切入点，也可以直接定义切入点表达式)。
     */
    @Before("pointCutMethod()")
    public void doBefore() {
        System.out.println("前置通知");
    }


    /**
     * 后置通知.
     * 用于定义后置通知，相当于AfterReturningAdvice。
     * 在使用时可以指定pointcut / value和returning属性，
     * 其中pointcut / value这两个属性的作用一样，都用于指定切入点表达式。
     * returning 可以用于访问返回值
     *
     * @param result return val
     */
    @AfterReturning(pointcut = "pointCutMethod()", returning = "result")
    public void doAfterReturning(String result) {
        System.out.println("后置通知, 返回值: " + result);
    }

    /**
     * 异常通知.
     * 用于定义异常通知来处理程序中未处理的异常，相当于ThrowAdvice。
     * 在使用时可指定pointcut / value和throwing属性。
     * 其中pointcut/value用于指定切入点表达式，
     * 而throwing属性值用于指定-一个形参名来表示Advice方法中可定义与此同名的形参，该形参可用于访问目标方法抛出的异常。
     *
     * @param e exception
     */
    @AfterThrowing(pointcut = "pointCutMethod()", throwing = "e")
    public void doAfterThrowing(Exception e) {
        System.out.println("异常通知, 异常: " + e.getMessage());
    }

    /**
     * 最终通知.
     * 用于定义最终final 通知，不管是否异常，该通知都会执行。使用时需要指定一个value属性，该属性用于指定该通知被植入的切入点。
     */
    @After("pointCutMethod()")
    public void doAfter() {
        System.out.println("最终通知");
    }
}
