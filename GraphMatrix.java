public class GraphMatrix {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(9);

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