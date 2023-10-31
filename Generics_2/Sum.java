package Generics_2;

public class Sum<T> {
    private T num;

    public Sum(T input) {
        this.num = input;
    }

    public void printer() {
        num.Where();
        System.out.println("Hello" + num);
    }

}
