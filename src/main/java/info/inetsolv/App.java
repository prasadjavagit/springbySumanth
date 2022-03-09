package info.inetsolv;

import info.inetsolv.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
