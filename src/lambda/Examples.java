package lambda;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;

        Function<String, Integer> convertToLength = s -> s.length();
        System.out.println(convertToLength.apply("Merry Christmas"));

        Function<Integer, Integer> adder = x -> {
            x += 2;
            x += 3;
            return x;
        };

        Calculator calculator = new Calculator() {
            @Override
            public int computeOperator(int x, int y) {
                return x + y;
            }
        };
        System.out.println(calculator.computeOperator(2, 3));

        Calculator calculator1 = (x, y) -> x + y;
        Calculator calculator2 = (x, y) -> x - y;

        System.out.println(calculator1.computeOperator(2, 3));
        System.out.println(calculator2.computeOperator(4, 1));


        Function<String, Integer> function = s -> s.length();
        printResultOfLambda((function));

        printResultOfLambda(s -> s.length());
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });

        //FUNCTIONS
        //functiile primesc parametrii, returneaza rezultat
        //"2000" -> 2000
        System.out.println("FUNCTIONS");
        Function<String, Integer> converter = s -> Integer.parseInt(s);
        System.out.println(converter.apply("2000"));

        BiFunction<Integer, Integer, Integer> compute = (x, y) -> x + y;
        System.out.println(compute.apply(7, 7));

        //OPERATORS
        //primesc parametrii, returneaza rezultate de acelasi tip
        System.out.println("OPERATORS");
        IntUnaryOperator square = y -> y * y;
        System.out.println(square.applyAsInt(9));

        BinaryOperator<String> concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.apply("Mos", "Craciun"));

        //PREDICATE
        //primesc parametrii, returneaza boolean
        System.out.println("PREDICATE");
        /*Predicate<Character> isDigit = r -> {
            if (Character.isDigit(r)) {
                return true;
            }
            return false;
        };
        System.out.println(isDigit.test('a'));*/
        Predicate<Character> isDigit = r -> Character.isDigit(r);
        System.out.println(isDigit.test('a'));

        IntPredicate isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        //CONSUMERS
        //primeste parametrii, dar nu returneza nimic
        System.out.println("CONSUMERS");
        Consumer<String> cons = s -> System.out.println(s);
        cons.accept("iarna");

        BiConsumer<String, String> biCons = (s1, s2) -> System.out.println(s1 + s2);
        biCons.accept("Craciun", "Fericit");

        //SUPPLIERS
        //nu primesc parametrii, dar returneaza ceva
        System.out.println("SUPPLIERS");
        Supplier<String> wordSupplier = () ->  "sanie";
        System.out.println(wordSupplier.get());

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());
        //BooleanSupplier booleanSupplier = () -> words.contains("aristocrat");
    }
    public static void printResultOfLambda(Function<String, Integer> lambdaFunction) {
        System.out.println(lambdaFunction.apply("Programarea functionala este frumoasa"));
    }
}
