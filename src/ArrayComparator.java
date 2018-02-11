public class ArrayComparator {

    public boolean compare(int[][] arrayA, int[][] arrayB) {

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {

                if (arrayA[i][j] != arrayB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}