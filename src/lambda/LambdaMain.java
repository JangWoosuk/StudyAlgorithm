package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {
    public static void main(String[] args){

        LambdaInterface f = (a, b) ->  {return a > b ? a:b;};


        LambdaInterface f2 = new LambdaInterface() {
            @Override
            public int max(int a, int b) {
                return a>b?a:b;
            }
        };


        LambdaInterface2 f3 = (LambdaInterface2 ff) -> {System.out.println("hello");};
        f3.paramFunctional(f3);

        LambdaInterface f4 = (LambdaInterface) (x,y) -> x>y?x:y;
        System.out.println(f4.max(1000,500));


        System.out.println(f.max(30,50));

        Supplier<String> s = () -> "jordan";
        System.out.println(s.get());
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(System.out::println).accept("jordan dunk");
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("this length is 17"));
        Predicate<String> predicate = (str) -> str.equals("Hello World");
        System.out.println(predicate.test("Hello Worl"));

        Function<String,Integer> a = (String ss) -> Integer.parseInt(ss);
        Function<String,Integer> b = Integer::parseInt;
        System.out.println(b.apply("13"));



    }
}
