package com.tomas.web.utils.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by thomas on 2017/10/30.
 */
@Component
@Aspect
public  class AopLogUtil
{
    @Pointcut(value = "execution(* com.tomas.web.service.impl.UserServiceImpl.*(..))")
    public void userServiceCutPoint(){}

    @Pointcut(value = "execution(* com.tomas.web.service.impl.HomeServiceImpl.*(..))")
    public void homeServiceCutPoint(){}

    @Before(value = "userServiceCutPoint()")
    public void adviseBefore(JoinPoint point)
    {
        System.out.println(Arrays.toString(point.getArgs()));
        System.out.println("前置通知执行");
    }

    @After(value = "userServiceCutPoint()")
    public void adviseAfter(JoinPoint point)
    {
        System.out.println(Arrays.toString(point.getArgs()));
        System.out.println("后置通知执行");
    }

    @Around(value = "homeServiceCutPoint()")
    public void testArroundAdice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(Arrays.toString(proceedingJoinPoint.getArgs()));
        System.out.println("环绕前置通知执行 调用return;");
//        return;
        proceedingJoinPoint.proceed(new Object[]{123,6789});
    }
}
