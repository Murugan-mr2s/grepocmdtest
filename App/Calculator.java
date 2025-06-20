package app;

public class Calculator {

    public Calculator() {

    }

    public int add(int... a) {

        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }

}
