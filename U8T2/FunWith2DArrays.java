package U8T2;

public class FunWith2DArrays {
    public static double average(int[][] nums) {
        double total = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                total += nums[i][j];
                counter++;
            }
        }
        return total / counter;
    }

    public static int edgeSum(int[][] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length - 1) {
                for (int j = 0; j < nums[i].length; j++) {
                    total += nums[i][j];
                }
            } else {
                total += nums[i][0];
                total += nums[i][nums[i].length - 1];
            }
        }
        return total;
    }

    public static int[] indexFound(String[][] strList, String target) {
        int[] rowAndColumn = {-1, -1};
        for (int i = 0; i < strList[0].length; i++) {
            for (int j = 0; j < strList.length; j++) {
                if (strList[j][i].equals(target)) {
                    rowAndColumn[0] = j;
                    rowAndColumn[1] = i;
                    return rowAndColumn;
                }
            }
        }
        return rowAndColumn;
    }

    public static int[][] split(int[][] nums, int row, int column) {
        int[][] newNums = new int[row + 1][column + 1];
        if (row >= nums.length || column >= nums[0].length) {
            return new int[0][0];
        }
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < column + 1; j++) {
                newNums[i][j] = nums[i][j];
            }
        }
        return newNums;
    }

    public static int[][] invert(int[][] nums) {
        int[][] newNums = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                newNums[i][j] = nums[j][i];
            }
        }
        return newNums;
    }
}
