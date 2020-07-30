package Task1;

public class Array {
        static int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        public static void main(String[] args) {
            print(array);
            toLeft(array);
            print(array);
        }

        static void toLeft(int[][] a) {
            int[][] temp = new int[a.length][];
            for (int i = 0; i < a.length; i++) {
                temp[i] = new int[a[i].length];
                temp[i][a.length - 1] = 0;
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j == a[i].length - 1) {
                        a[i][j] = temp[i][j];
                        continue;
                    }
                    temp[i][j] = a[i][j + 1];
                    a[i][j] = temp[i][j];
                }
            }
        }

        static void print(int[][] ar) {
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.printf("%d ", ar[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

