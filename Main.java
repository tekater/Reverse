import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] twoDimArray = {
                {0, 0, 9, 9},           //j= 0
                {1, 2, 3, 4},           //j= 1
                {5, 6, 7, 8}            //j= 2
        };
        System.out.println("\n" +Arrays.toString(twoDimArray[0]) + "\n" + Arrays.toString(twoDimArray[1]) + "\n" + Arrays.toString(twoDimArray[2]) );
                twoDimArray[0][0] = twoDimArray[0][3];         // []-первая строчка // []-вторая порядок
                twoDimArray[0][2] = twoDimArray[1][0];
                twoDimArray[0][3] = twoDimArray[1][3];
                twoDimArray[1][0] = twoDimArray[0][3];
                twoDimArray[1][3] = twoDimArray[0][2];
                twoDimArray[0][2] = twoDimArray[1][1];
                twoDimArray[0][3] = twoDimArray[1][2];
                twoDimArray[1][1] = twoDimArray[0][3];
                twoDimArray[1][2] = twoDimArray[0][2];
                twoDimArray[0][2] = twoDimArray[2][0];
                twoDimArray[0][3] = twoDimArray[2][3];
                twoDimArray[2][0] = twoDimArray[0][3];
                twoDimArray[2][3] = twoDimArray[0][2];
                twoDimArray[0][2] = twoDimArray[2][1];
                twoDimArray[0][3] = twoDimArray[2][2];
                twoDimArray[2][1] = twoDimArray[0][3];
                twoDimArray[2][2] = twoDimArray[0][2];
                twoDimArray[0][2] = twoDimArray[0][1];
                twoDimArray[0][3] = twoDimArray[0][1];
                twoDimArray[0][1] = twoDimArray[0][0];
        System.out.println("\n" +Arrays.toString(twoDimArray[0]) + "\n" + Arrays.toString(twoDimArray[1]) + "\n" + Arrays.toString(twoDimArray[2]) );
    }
        }

