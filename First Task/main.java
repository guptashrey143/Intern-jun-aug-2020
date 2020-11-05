package FirstTask;


public class main {
    public static void main(String args[]) {
        CalculateMinCostPath f = new CalculateMinCostPath();
        int cost[][] = {{8, 11, 14, 1},
                {13, 2, 7, 12},
                {3, 16, 9, 6},
                {10, 5, 4, 15}};
        System.out.println("minimum cost to reach" +
                " (3, 1) = " + f.minCost(cost, 3, 1));
        System.out.println(cost.length);
        System.out.println(cost[0].length);
    }
}
