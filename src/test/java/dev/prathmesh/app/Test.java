package dev.prathmesh.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appC.xml");
        Employee emp = (Employee) context.getBean("forEmp");
        emp.show();
    }

}

