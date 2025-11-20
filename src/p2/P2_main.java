package p2;

public class P2_main {
    public static void main(String[] args){
        int [] numbers = {4,2,3,4,1};
        int max = 0;
        int minIndex = 0;
        max = numbers[0];
        minIndex = 0;
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
                minIndex = i;
            }
        }
    }
}
