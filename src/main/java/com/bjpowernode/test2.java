package com.bjpowernode;


import com.bjpowernode.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class test2 {
        public static void main(String[] args) {
                String conf="applicationContext.xml";
                ApplicationContext applicationContext=new ClassPathXmlApplicationContext(conf);
                //@演示使用容器创建一个系统类的对象
                Date date= (Date) applicationContext.getBean("date1");
                System.out.println(date);
        }

}
