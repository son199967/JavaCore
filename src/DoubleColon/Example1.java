package DoubleColon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args)
    {

        // Get the stream
        Stream<String> stream
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");

        // Print the stream
        // using double colon operator
        stream.forEach(System.out::println);
    }
}
// Java code to show use of double colon operator
// for static methods


class GFG {
    public GFG(String a) {
        System.out.println(a);
    }

    public GFG() {
    }

    // static function to be called
    static void someFunction(String s)
    {
        System.out.println(s);
    }
    //static start before start class

    void someFunctionNonStatic(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args)
    {

        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // call the static method
        // using double colon operator
//        list.forEach(GFG::someFunction);
//        list.forEach((new GFG())::someFunctionNonStatic);
        list.forEach(GFG::new);
    }
}
