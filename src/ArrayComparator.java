public class ArrayComparator {

    public boolean compare(int[][] arrayA, int[][] arrayB) {
        boolean equalOrNot = true;

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i][j] == arrayB[i][j]) {
                    equalOrNot = true;
                } else {
                    equalOrNot = false;
                }
            }
        }
        return equalOrNot;
    }
}