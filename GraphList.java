import java.util.ArrayList;

public class GraphList {
    private ArrayList<ArrayList<Integer>> adjacencyList;
    private int numVertices;

    public GraphList(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void printGraph() {
        System.out.println("Adjacency List:");

        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphList graph = new GraphList(9);

        // A=0, B=1, C=2, D=3, E=4, F=5, G=6, J=7, K=8

        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 7); // A-J

        graph.addEdge(1, 2); // B-C
        graph.addEdge(1, 3); // B-D

        graph.addEdge(2, 4); // C-E
        graph.addEdge(2, 5); // C-F

        graph.addEdge(3, 4); // D-E

        graph.addEdge(4, 6); // E-G
        graph.addEdge(4, 7); // E-J

        graph.addEdge(5, 6); // F-G

        graph.addEdge(7, 8); // J-K

        graph.printGraph();
    }
}