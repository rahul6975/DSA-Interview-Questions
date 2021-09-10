/*
  We have to repair the roads to connect the cities again. There is a fixed cost to repair a particular road.
     Find out the minimum cost to connect all the cities by repairing roads.
     Input is in matrix(city) form, if city[i][j] = 0 then there is not any road between city i and city j, if city[i][j] = a > 0 then the cost to rebuild the path between city i and city j is a.
     Print out the minimum cost to connect all the cities.
     It is sure that all the cities were connected before the roads were damaged.


     Input : {{0, 1, 2, 3, 4},
             {1, 0, 5, 0, 7},
             {2, 5, 0, 6, 0},
            {3, 0, 6, 0, 0},
            {4, 7, 0, 0, 0}};
     Output : 10
 */


public class MinimumCostToConnectCites {
    static int minnode(int n, int keyval[],
                       boolean mstset[]) {
        int mini = Integer.MAX_VALUE;
        int mini_index = 0;
        for (int i = 0; i < n; i++) {
            if (mstset[i] == false &&
                    keyval[i] < mini) {
                mini = keyval[i];
                mini_index = i;
            }
        }
        return mini_index;
    }

    static void findcost(int n, int city[][]) {
        int parent[] = new int[n];

        int keyval[] = new int[n];
        boolean mstset[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            keyval[i] = Integer.MAX_VALUE;
            mstset[i] = false;
        }
        parent[0] = -1;
        keyval[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = minnode(n, keyval, mstset);
            mstset[u] = true;
            for (int v = 0; v < n; v++) {
                if (city[u][v] > 0 &&
                        mstset[v] == false &&
                        city[u][v] < keyval[v]) {
                    keyval[v] = city[u][v];
                    parent[v] = u;
                }
            }
        }
        int cost = 0;
        for (int i = 1; i < n; i++)
            cost += city[parent[i]][i];

        System.out.println(cost);
    }

    public static void main(String args[]) {

        // Input 1
        int n1 = 5;
        int city1[][] = {{0, 1, 2, 3, 4},
                {1, 0, 5, 0, 7},
                {2, 5, 0, 6, 0},
                {3, 0, 6, 0, 0},
                {4, 7, 0, 0, 0}};

        findcost(n1, city1);

    }
}
