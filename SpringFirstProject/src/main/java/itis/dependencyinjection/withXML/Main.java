package itis.dependencyinjection.withXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = (Person) context.getBean("person");
        person.getTransport().toMove();
    }
}
