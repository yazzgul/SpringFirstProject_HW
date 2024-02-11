package itis.dependencyinjection.withoutXML;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Lazy
@Primary
@Component
@Scope(value = "prototype")
@Qualifier(value = "flat")
public class Flat implements HouseAction {
    public Flat() {
        System.out.println("FLAT INIT");
    }

    @Override
    public void toBuy() {
        System.out.println("Buy a flat");
    }
}
