package lambda;

@FunctionalInterface
public interface GreetingService {
    String sayHello(String name);
    default String sayGoodMorning(String name){
      return "Good Morning ".concat(name);
    }
}
