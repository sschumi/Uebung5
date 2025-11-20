package h2;

public class H2_main {
    public static void main(String[] args) {
        int n = 48889, digits = 1;
        int b = n;
        int [] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = n/10; i > 1; i = i/10){
            digits++;
        }
        int c = 0;
        System.out.println(digits);
    }
}
