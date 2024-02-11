package itis.dependencyinjection.withXML;

import org.springframework.context.annotation.Lazy;

//@Lazy
public class Car implements Transport{
    public Car() {
        System.out.println("CAR INIT");
    }

    @Override
    public void toMove() {
        System.out.println("MOVE BY CAR");
    }
}
