package Lamda;

public class Example1 {
    private String word;
    private Runnable runnable;
    public Example1(String word) {
        this.word = word;
        runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(this);
            }
        };
    }
    Runnable runnable1 = () -> System.out.println(this);
    @Override
    public String toString() {
        return "Hello " + word;
    }
    public static void main(String[] args) {
        new Thread(new Example1("Tung").runnable).start();
        new Thread(new Example1("Tien").runnable1).start();
    }
}
