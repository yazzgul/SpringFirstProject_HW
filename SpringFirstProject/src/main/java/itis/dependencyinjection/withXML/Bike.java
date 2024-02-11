package itis.dependencyinjection.withXML;

import org.springframework.context.annotation.Lazy;

//@Lazy
public class Bike implements Transport{
    public Bike() {
        System.out.println("BIKE INIT");
    }

    @Override
    public void toMove() {
        System.out.println("MOVE BY BIKE");
    }
}
