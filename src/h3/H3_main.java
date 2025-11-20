package h3;

public class H3_main {
    public static void main(String[] args){
        int [][] einheiten = new int [2][15];
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
        for (int i = 0; i < einheiten[0].length; i++){
                einheiten[1][i] = 0;
        }
        int input = 6279;

        for (int i = 0; i < einheiten[0].length; i++){
            einheiten[1][i] = input/einheiten[0][i];
            input = input-(einheiten[1][i]*einheiten[0][i]);
        }
        /*einheiten[1][0] = input/50000;
        a = input/50000;
        input = input - (a*50000);

        einheiten[1][1] = input/20000;
        a = input/20000;
        input = input - (a*20000);

        einheiten[1][2] = input/10000;
        a = input/10000;
        input = input - (a*10000);

        einheiten[1][3] = input/5000;
        a = input/5000;
        input = input - (a*5000);

        einheiten[1][4] = input/2000;
        a = input/2000;
        input = input - (a*2000);

        einheiten[1][5] = input/1000;
        a = input/1000;
        input = input - (a*1000);

        einheiten[1][6] = input/500;
        a = input/500;
        input = input - (a*500);

        einheiten[1][7] = input/200;
        a = input/200;
        input = input - (a*200);

        einheiten[1][8] = input/100;
        a = input/100;
        input = input - (a*100);

        einheiten[1][9] = input/50;
        a = input/50;
        input = input - (a*50);

        einheiten[1][10] = input/20;
        a = input/20;
        input = input - (a*20);

        einheiten[1][11] = input/10;
        a = input/10;
        input = input - (a*10);

        einheiten[1][12] = input/5;
        a = input/5;
        input = input - (a*5);

        einheiten[1][13] = input/2;
        a = input/2;
        input = input - (a*2);

        einheiten[1][14] = input/1;
        a = input/1;
        input = input - (a*1);
        */
        for (int i = 0; i < einheiten[0].length; i++){
            System.out.print(einheiten[1][i] + "  ");
        }
    }
}
