package FirstTask;

public class Indices {
    private int x ;
    private int y;
    public Indices(){
        x= 0;
        y = 0;
    }
    public Indices(int a, int b){
        x= a;
        y = b;
    }

    public boolean indiceCheck(int x, int y){
        if(this.x == x && this.y == y){
            return true;
        }
        return false;
    }


}
