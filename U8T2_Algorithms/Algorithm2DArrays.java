import java.util.ArrayList;

public class Algorithm2DArrays {
    
    /** Return the sum of all elements of arr that are in the one particular row, 
     *  specified by the row parameter
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row
     
     */
    public static int sumForRow(int[][] arr, int row) {
    /* implement this method */ 
        int sum = 0;
        for(int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }

    public static int sumForColumn(int[][] arr, int col) { /* implement this method */ 
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    
    }

    public static int replaceEvensWithZero(int[][] arr) { /* implement this method */ 
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) { /* implement this method */ 
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = 0; i < wordChart.length; i++) {
            for(int j = 0; j < wordChart[0].length; j++) {
                if(wordChart[i][j].length() == len) {
                    temp.add(wordChart[i][j]);
                }
            }
        }
        return temp;
    }

    public static double classAverage(Student[][] seatingChart) { /* implement this method */ 
        int sum = 0;
        int count = 0;
        for(int i = 0; i < seatingChart.length; i++) {
            for(int j = 0; j < seatingChart[0].length; j++) {
                sum += seatingChart[i][j].getGrade();
                count++;
            }
        }
        double avg = (double) sum / count;
        return avg;
    }

}  