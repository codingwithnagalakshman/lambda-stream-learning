package lambda;

public class LambdaLearning1 {

    public static void main(String[] args) {
        GreetingService greetingService = new GreetingService() {
            @Override
            public String sayHello(String name) {
                return "Hello.. ".concat(name);
            }
        };

        System.out.println(greetingService.sayHello("Nagalakshman"));

        GreetingService gc = "Hello.... "::concat;

        System.out.println(gc.sayHello("Coding with Nagalakshman"));

        System.out.println(gc.sayGoodMorning("Nagalakshman"));

        GreetingService gc1 = null;

        test(String::toUpperCase);
    }

    private static void test(GreetingService gc){
        String greet = gc.sayHello("Nagalakshman");
        System.out.println(greet);
    }
}
