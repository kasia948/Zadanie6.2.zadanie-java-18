public class ArrayTest {
    public static void main(String[] args) {
        int[][] tablica1 = new int[2][2];
        tablica1[0][0] = 1;
        tablica1[0][1] = 1;
        tablica1[1][0] = 1;
        tablica1[1][1] = 1;

        int[][] tablica2 = new int[2][2];
        tablica2[0][0] = 1;
        tablica2[0][1] = 1;
        tablica2[1][0] = 1;
        tablica2[1][1] = 1;

        ArrayComparator porownanie = new ArrayComparator();
        System.out.println(porownanie.compare(tablica1, tablica2));
    }
}