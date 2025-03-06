public class FunWith2DArrays {
    public static int totalElements(int[][] temp) {
        int count = 0;
        for(int[] num : temp) {
            for(int num1 : num) {
                count++;
            }
        }
        return count;
    }
    
    public static void fourCorners(String[][] temp) {
        System.out.println(temp[0][0]);
        System.out.println(temp[0][temp[0].length - 1]);
        System.out.println(temp[temp.length - 1][0]);
        System.out.println(temp[temp.length - 1][temp[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] temp) {
        String[] tempArray = temp[0];
        temp[0] = temp[temp.length - 1];
        temp[temp.length - 1] = tempArray;
    }

    public static double average(int[][] temp) {
        int sum = 0;
        int count = 0;
        for(int[] nums : temp) {
            for(int num : nums) {
                sum += num;
                count ++;
            }
        }
        return (double) sum / count;
    }

    public static int edgeSum(int[][] temp) {
        int sum = 0;
        for(int i = 0; i < temp.length; i++) {
            for(int j = 0; j < temp[0].length; j++) {
                if(i == 0 || i == temp.length - 1) {
                    sum += temp[i][j];
                } else if(j == 0 || j == temp[0].length - 1) {
                    sum += temp[i][j];
                }
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] temp, String str) {
        int[] ind = {-1, -1};
        String[][] col = new String[temp[0].length][temp.length];
        for (int row = 0; row < temp.length; row++) {
            for (int col1 = 0; col1 < temp[0].length; col1++) {
                col[col1][row] = temp[row][col1]; 
            }
        }
        for(int i = 0; i < temp[0].length; i++) {
            for(int j = 0; j < temp.length; j++) {
                if(col[i][j].equals(str)) {
                    ind[0] = j;
                    ind[1] = i;
                    return ind;
                }
            }
        }
        return ind;
    }

    public static int[][] split(int[][] temp, int row, int col) {
        if(row >= temp.length || col >= temp[0].length) {
            return new int[0][0];
        }
        int[][] split = new int[row + 1][col + 1];
        for(int i = 0; i <= row; i++) {
            for(int j = 0; j <= col; j++) {
                split[i][j] = temp[i][j];
            }
        }
        return split;
    }

    public static int[][] invert(int[][] temp) {
        int[][] colMajor = new int[temp[0].length][temp.length];
        for (int row = 0; row < temp.length; row++) {
            for (int col = 0; col < temp[0].length; col++) {
                colMajor[col][row] = temp[row][col]; 
            }
        }
        return colMajor;
    }
}
