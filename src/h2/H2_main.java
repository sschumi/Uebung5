package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int n = 0, digits = 1;
        int [] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        digits = 1;
        for (int i = n/10; i > 1; i = i/10){
            digits++;
        }
        for (int i = 8; i >= 8-digits; i--){
            a[i] = n%10;
            n /= 10;
        }
        System.out.println(digits);
        System.out.println(Arrays.toString(a));
    }
}
