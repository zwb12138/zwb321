package com.bjpowernode;


import com.bjpowernode.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test4 {
        public static void main(String[] args) {
                //@第一个spring文件,通过spring创建对象
                String conf="applicationContext.xml";
                ApplicationContext applicationContext=new ClassPathXmlApplicationContext(conf);
                Student student= (Student) applicationContext.getBean("student1");
                student.method1();
                
        }

}
