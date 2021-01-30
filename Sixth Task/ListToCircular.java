package SixthTask;

public class ListToCircular {
    public static void main(String[] args) {
        List l = new List();

        for (int i = 0; i < 7; i++) {
            l.insert(i);
        }

        l.displayList();
        l.delete();
        l.delete();
        l.displayList();
        l.singleLLToCircularLL();


        for (int i = 7; i < 14; i++) {
            l.insert(i);
        }

        l.displayList();
        l.delete();
        l.delete();
        l.displayList();
        l.circularLLtoSinglyLL();
        l.displayList();

    }
}
