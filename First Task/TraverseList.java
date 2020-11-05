package FirstTask;

import java.util.ArrayList;  //Wrapper class for ArrayLists

public class TraverseList {
    private ArrayList<Indices> list = new ArrayList<>();  //Custom ArrayList with Indices class

    public void add(int x, int y) {       //The function to add a new index to the list
        Indices t = new Indices(x, y);
        list.add(t);
    }

    public boolean listSearch(int x, int y) {    //To check if an index already belongs in the ArrayList or not
        if(list.isEmpty()){
            return false;
        }
        for (Indices para :
                list) {
            if (para.indiceCheck(x, y)) {
                return true;
            }
        }
        return false;
    }
    public void delete (int x, int y){    //To remove an index we will no longer want in the List
        int index = 0;
        for (Indices para :
                list) {
            if (para.indiceCheck(x, y)) {
                break;
            }
            index++;
        }
        list.remove(index);
    }
}

