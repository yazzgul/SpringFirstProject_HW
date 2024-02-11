package itis.dependencyinjection.withXML;

import org.springframework.context.annotation.Lazy;

//@Lazy
public class Bus implements Transport{
    public Bus() {
        System.out.println("BUS INIT");
    }

    @Override
    public void toMove() {
        System.out.println("MOVE BY BUS");
    }
}
