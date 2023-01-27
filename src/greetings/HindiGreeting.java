package greetings;

import greetings.Greeting;

public class HindiGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Namaste");
    }
}
