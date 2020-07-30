package Task2;

public class Reverse {
        static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        public static void main(String[] args) {
            print(array);
            reverse(array);
            print(array);

        }

        static void reverse(int[] a) {
            int[] temp = new int[a.length];
            int tmp = a.length - 1;
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[tmp];
                tmp--;
            }
            for (int i = 0; i < a.length; i++) {
                a[i] = temp[i];
            }
        }

        static void print(int[] ar) {
            for (int i = 0; i < ar.length; i++) {
                System.out.printf("%d  ", ar[i]);

            }
            System.out.println();
        }
    }

