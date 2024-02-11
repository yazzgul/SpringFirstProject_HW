package itis.dependencyinjection.withXML;

public class Person {
    private Transport transport;

    public Person(Transport transport) {
        System.out.println("PERSON INIT");
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
}
