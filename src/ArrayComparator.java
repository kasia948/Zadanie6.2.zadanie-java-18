public class ArrayComparator {
    public void compare (int [][] arrayA, int [][] arrayB ) {
        boolean equalOrNot = true;

        if (arrayA.length == arrayB.length) {
            for (int i = 0; i < arrayA.length; i++)
                for (int j = 0; j < arrayB.length; j++)
                    if (arrayA[i][j] == arrayB[i][j]) {
                        equalOrNot = true;
                    } else {
                        equalOrNot = false;
                    }
        } else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
