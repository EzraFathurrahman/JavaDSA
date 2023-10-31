package JavaDSA.Generics;

public class Printer<T> {

    T input;

    public Printer(T input) {
        this.input = input;
    }

    public void print() {
        System.out.println(input);
    }

}
