package itis.dependencyinjection.withoutXML;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component
@Qualifier(value = "cottage")
public class Cottage implements HouseAction {
    public Cottage() {
        System.out.println("COTTAGE INIT");
    }
    @Override
    public void toBuy() {
        System.out.println("Buy a cottage");
    }
}
