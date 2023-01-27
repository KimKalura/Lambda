package greetings;

import greetings.EnglishGreeting;
import greetings.Greeting;
import greetings.HindiGreeting;

public class WellWisher {
    public static void main(String[] args) {
        Greeting hindiGreeting = new HindiGreeting();
        wish(hindiGreeting);

        Greeting englishGreeting = new EnglishGreeting();
        wish(englishGreeting);

        wish(() -> {
            System.out.println("Ni hao");
        });
    }

    public static void wish(Greeting greeting) {
        greeting.sayHello();
    }
}
