package com.jsp.aopconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.aopconcept.services.Login;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext applicationContext = 
        		new ClassPathXmlApplicationContext("config.xml");
        
        Login login = applicationContext.getBean("login", Login.class);
        login.login();
    }
}
