package Lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

interface Hello {
     String sayHello(String name, String com);
}

public class LambdaExpression {
    static void printResulf(Integer s){
        System.out.println(s);
    }
    private static List<Integer> list;
    static {
        list= new ArrayList<>();
        list.add(54);
        list.add(22);
        list.add(82);
        list.add(8);

    }

    public static void main(String[] args) {

        Function<Integer ,Integer> function = (s) -> s*10;
        Consumer<Integer> con = s -> {
            Integer a = s + 100;
            System.out.println(a);
        };
        StreamSupport.stream(list.spliterator(),true).map(function).parallel().forEach(con);
    }

//    public static void main(String[] args) {
//        Hello s = (name, com) -> "hello "+name +"abd"+com;
//        System.out.println(s.sayHello("asa","ajs"));
//    }

}
