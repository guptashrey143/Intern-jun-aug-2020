package SecondTask;

public class LeftRotatingArraybyDPlaces {
    public static int[] leftRotate(int array[], int d) {
        d = d % array.length;
        if (d == 0) {
            return array;
        }

        int[] retArray2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i - d < 0) {
                retArray2[array.length - (d - i)] = array[i];
            } else {
                retArray2[i - d] = array[i];
            }
        }
        return retArray2;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int rotatedArray[] = leftRotate(array, 4);

        System.out.println("\n\nRotated Array \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}
