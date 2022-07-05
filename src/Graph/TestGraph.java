package Graph;
public class TestGraph {

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex('a');
        g.addVertex('b');
        g.addVertex('c');
        g.addVertex('e');
        g.addVertex('f');
        
//        a, b, c, e, f
//        0, 1, 2, 3, 4
        
        g.addEdge('a', 'b', 4);
        g.addEdge('b', 'c', 5);
        g.addEdge('c', 'f', 3);
        g.addEdge('b', 'e', 4);
        g.addEdge('f', 'e', 10);
        g.addEdge('a', 'f', 5);


        System.out.println("");
        g.show();
        System.out.println("");
        System.out.println(g.toString());
    }

}
