package OpenEndedLab;

import java.util.Arrays;

public class Part4 {
    Object[] vertex;
    int[][] adjacencyMatrix;
    public Part4(Object[] a){
        vertex = a;
        adjacencyMatrix = new int[a.length][a.length];
    }

    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = 1;
    }

    public void insertEdge(Object a , Object b){
        int x = getIndex(a);
        int y = getIndex(b);
        if(x == -1 || y == -1){
            System.out.println("One of the elements doesn't exist");
            return;
        }
        addEdge(x, y);
    }

    public int getIndex(Object a){
        for(int i = 0; i < vertex.length; i++ ) {
            if (a.equals(vertex[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] s={"Qasimabad","Wadhu Wah Rd","Abdullah Mall Rd","Hyderabad Bypass","Jamshoro","MUET Main Gate"};
        Part4 g=new Part4(s);
        g.insertEdge("Qasimabad","Wadhu Wah Rd");
        g.insertEdge("Qasimabad","Abdullah Mall Rd");
        g.insertEdge("Wadhu Wah Rd","Abdullah Mall Rd");
        g.insertEdge("Abdullah Mall Rd","Hyderabad Bypass");
        g.insertEdge("Hyderabad Bypass","Jamshoro");
        g.insertEdge("Jamshoro","MUET Main Gate");

        for (int i = 0; i < s.length; i++) {
            System.out.println("Row for : " + s[i]);
            System.out.println(Arrays.toString(g.adjacencyMatrix[i]));
        }
    }

}

