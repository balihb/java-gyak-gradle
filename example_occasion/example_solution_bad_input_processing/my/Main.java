package my;

public class Main {
    public static void main(String[] args) {
        if(args[0].split(" ").length != 3) throw new RuntimeException("Bad");
    }
}
