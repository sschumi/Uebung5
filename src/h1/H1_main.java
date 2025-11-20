package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < myArray.length / 2; i++) {
            int j = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = j;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
