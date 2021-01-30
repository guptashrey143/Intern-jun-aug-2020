package FifthTask;
/// A function to convert a given list to array
public class ConvertingListToArray {
    public static void main(String[] args) {
        List l = new List();
        for (int i = 0; i < 5; i++) {
            l.insert(i* 10);
        }
        int[] array = l.listToArray();

        for (int j : array) {
            System.out.print("| " + j + " |");
        }
    }
}
