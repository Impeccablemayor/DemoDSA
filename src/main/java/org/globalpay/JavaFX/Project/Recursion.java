package org.globalpay.JavaFX.Project;

public class Recursion {
    //let's use recursion to find the factorial of a number
    private static int fact(int i) {
        if (i != 0)
            return i * fact(i - 1);

        return 1;
    }

    static void main() {
        int result  = fact(1);
        System.out.println(result);
    }


}
