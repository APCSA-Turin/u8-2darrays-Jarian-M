public class Main {
    public static void main(String[] args) {
        /* String[][] names = {
            {"Abby", "Don", "George", "Kim"}, 
            {"Brian", "Elenor", "Harry", "Lenny"},
            {"Cathy", "Fred", "Jill", "Matt"}
        };
        names[1][2] = "Paul";

        String temp = names[0][0];
        names[0][0] = names[2][3];
        names[2][3] = temp;

        String[] tempRow = names[0];
        names[0] = names[1];
        names[1] = tempRow;

        for(int i = 0; i < names.length; i++) {
            for(int j = 0; j < names[0].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        for(int[] row : arr) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        String [][] arr2 = new String[4][2];
        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";
        for(String[] row : arr2) {
            for(String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        } */

        System.out.println("-------TEST 1-------");
        String[][] w1 = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        System.out.println("--Original:");
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w1);
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("-------TEST 2-------");
        String[][] w2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        System.out.println("--Original:");
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w2);
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------TEST 3-------");
        String[][] w3 = {{"phone", "mouse", "keyboard"}};
        System.out.println("--Original:");
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w3);
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------TEST 4-------");
        String[][] w4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        System.out.println("--Original:");
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w4);
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        System.out.println("-------TEST 5-------");
        String[][] w5 = {{"time"}};
        System.out.println("--Original:");
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w5);
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
    }
}