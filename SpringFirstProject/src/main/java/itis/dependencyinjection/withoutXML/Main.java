package itis.dependencyinjection.withoutXML;

import itis.dependencyinjection.withoutXML.HouseAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("itis.dependencyinjection.withoutXML");

//        HouseAction houseAction = context.getBean(HouseAction.class);
//        houseAction.toBuy();

//        HouseAction houseAction2 = context.getBean(HouseAction.class);
//        houseAction2.toBuy();

        Document document = context.getBean(Document.class);
        document.houseAct();
    }
}

//component
//primary
//lazy
//scope
//qualifier
//autowired
//configuration
//bean