package h3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
        int[][] einheiten = new int[2][15];
        einheiten[0][0] = 50000;
        einheiten[0][1] = 20000;
        einheiten[0][2] = 10000;
        einheiten[0][3] = 5000;
        einheiten[0][4] = 2000;
        einheiten[0][5] = 1000;
        einheiten[0][6] = 500;
        einheiten[0][7] = 200;
        einheiten[0][8] = 100;
        einheiten[0][9] = 50;
        einheiten[0][10] = 20;
        einheiten[0][11] = 10;
        einheiten[0][12] = 5;
        einheiten[0][13] = 2;
        einheiten[0][14] = 1;
        for (int i = 0; i < einheiten[0].length; i++) {
            einheiten[1][i] = 0;
        }

        int input = 6279;
        int a = input;

        for (int i = 0; i < einheiten[0].length; i++) {
            einheiten[1][i] = a / einheiten[0][i];
            a -= (einheiten[1][i] * einheiten[0][i]);
        }

        for (int i = 0; i < einheiten[1].length; i++) {
            System.out.print(einheiten[1][i] + " ");
        }

    }
}
