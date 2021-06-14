package com.onebill.spring.springannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung obj = context.getBean(Samsung.class);
        obj.config();
    }
}
