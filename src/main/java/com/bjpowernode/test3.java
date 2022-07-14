package com.bjpowernode;


import com.bjpowernode.domain.Student;
import com.bjpowernode.domain.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class test3 {
        public static void main(String[] args) {
                String conf="applicationContext.xml";
                ApplicationContext applicationContext=new ClassPathXmlApplicationContext(conf);
                //@演示基于xml的set注入自定义对象并且赋值
                Student student= (Student) applicationContext.getBean("student3");
                System.out.println(student);
                //@演示基于xml的set注入创建非自定义对象并且赋值
                Date date= (Date) applicationContext.getBean("date2");
                System.out.println(date);
                //@演示基于xml的set注入（属性有引用类型）
                Teacher teacher= (Teacher) applicationContext.getBean("teacher1");
                System.out.println(teacher);
                //@演示基于xml的构造注入
                Teacher teacher2= (Teacher) applicationContext.getBean("teacher2");
                System.out.println(teacher2);

        }

}
