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
}
