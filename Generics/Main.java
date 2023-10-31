package JavaDSA.Generics;

public class Main {
    public static void main(String[] args) {
        Printer<Integer> num = new Printer<>(100);

        num.print();
    }
}
