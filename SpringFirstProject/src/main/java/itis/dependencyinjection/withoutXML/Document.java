package itis.dependencyinjection.withoutXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Document {
    @Autowired
    private HouseAction house;

    public Document() {
        System.out.println("DOCUMENT INIT");
    }
//    public Document(@Qualifier(value = "cottage") HouseAction house) {
//        this.house = house;
//        System.out.println("DOCUMENT INIT");
//    }
    void houseAct() {
        house.toBuy();
    }
}
