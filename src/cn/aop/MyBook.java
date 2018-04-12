package cn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Sheng on 2018/4/12.
 */

@Aspect
public class MyBook {

    //在方法上面使用注解完成增强

    @Before(value = "execution(* cn.aop.Book.*(..))")
    public void before1(){
        System.out.println("before............");
    }
}
