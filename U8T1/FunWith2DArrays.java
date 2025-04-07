package U8T1;

public class FunWith2DArrays {
    public static int totalElements(int[][] intList) {
        int rows = intList.length;
        int columns = intList[0].length;
        return rows * columns;
    }

    public static void fourCorners(String[][] strList) {
        System.out.println(strList[0][0]);
        System.out.println(strList[0][strList[0].length - 1]);
        System.out.println(strList[strList.length - 1][0]);
        System.out.println(strList[strList.length - 1][strList[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] strList) {
        String[] temp = strList[0];
        strList[0] = strList[strList.length - 1];
        strList[strList.length - 1] = temp;
    }
}
