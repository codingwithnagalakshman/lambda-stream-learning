import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaStreamLearning1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "ab", "abc", "abcd", "abcded");

        // String with max length
        System.out.println(stringList.stream().max(Comparator.comparing(String::length)).get());

        //String with min length
        System.out.println(stringList.stream().min(Comparator.comparing(String::length)).get());

        // max length
        System.out.println(stringList.stream().map(String::length).max(Integer::compareTo).get());

        //min length
        System.out.println(stringList.stream().map(String::length).min(Integer::compareTo).get());

        List<String> stringList1 = Arrays.asList("Spring", "SpringBoot","React", "Java", "JavaScript", "Angular");

        //Starts with J
        stringList1.stream().filter( string -> string.startsWith("J")).forEach(System.out::println);
    }
}
