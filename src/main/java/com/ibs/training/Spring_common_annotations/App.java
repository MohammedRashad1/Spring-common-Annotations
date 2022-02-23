package com.ibs.training.Spring_common_annotations;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = context.getBean("college", College.class);
        System.out.println(college);
        college.test();
       
        context.close();
        
    }
}
