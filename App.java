package com.epam.SpringDemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.epam.SpringDemo1")
public class App 
{
    public static void main( String[] args )
    {
        //Student stu=new Student();
        //stu.display();
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(App.class);
    	Student s=context.getBean(Student.class);
    	s.display();
    	context.close();
    }
}
