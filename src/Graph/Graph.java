package Graph;

public class Graph {

    private int MaxVertex = 5;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[MaxVertex];
        adjacencyMatrix = new int[MaxVertex][MaxVertex];
        for (int i = 0; i < MaxVertex; i++) {
            for (int j = 0; j < MaxVertex; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                }
            }
        }
    }

    public void addVertex(char label) {
        if (countVertex < MaxVertex) {
            vertexList[countVertex] = new Vertex(label);
            countVertex++;
            System.out.println("Data Masuk : " + label);
        }
    }

    public void addEdge(int dataAwal, int dataAkhir, int value) {
        adjacencyMatrix[dataAwal][dataAkhir] = value;
    }

    public void addEdge(char labelAwal, char labelAkhir, int value) {
        int dataAwal = indexVertex(labelAwal);
        int dataAkhir = indexVertex(labelAkhir);
        if (dataAwal != -1 || dataAkhir != -1) {
            addEdge(dataAwal, dataAkhir, value);
            addEdge(dataAkhir, dataAwal, value);
        }else{
            System.out.println("Gagal Membuat Edge");
        }
    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i] != null) {
                if (vertexList[i].label == label) {
                    return i;
                }
            }
        }
        return -1;
    }

//    a terhubung ke b dengan beban 4
// a terhubung ke f dengan beban 5
// b terhubung ke c dengan beban 5
// b terhubung ke e dengan beban 4 
    public void show() {
        for (int i = 0; i < MaxVertex; i++) {
            for (int j = 0; j < MaxVertex; j++) {
                if (adjacencyMatrix[i][j] != 0) {
                    System.out.println("Vertex " + vertexList[i].getLabel()
                            + " terhubung dengan vertex " + vertexList[j].getLabel()
                            + " dengan bobot " + adjacencyMatrix[i][j]);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Graph{" + "MaxVertex=" + MaxVertex
                + ", vertexList=" + vertexList
                + ", adjacencyMatrix=" + adjacencyMatrix
                + ", countVertex=" + countVertex + '}';
    }

    public int getMaxVertex() {
        return MaxVertex;
    }

    public void setMaxVertex(int MaxVertex) {
        this.MaxVertex = MaxVertex;
    }

    public Vertex[] getVertexList() {
        return vertexList;
    }

    public void setVertexList(Vertex[] vertexList) {
        this.vertexList = vertexList;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public int getCountVertex() {
        return countVertex;
    }

    public void setCountVertex(int countVertex) {
        this.countVertex = countVertex;
    }
}
