public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String from, to;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    LInkedList(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }
    
    public static void main(String[] args) throws Exception {

        // create an object of Graph class
        int noVertices = 21;
        int noEdges = 21;
        LInkedList myGraph = new LInkedList(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].from = "Seth";
        myGraph.edge[0].to = "Luna";


        // Edge 2
        myGraph.edge[1].from = "Seth";
        myGraph.edge[1].to = "Jaji";

        // Edge 3
        myGraph.edge[2].from = "Seth";
        myGraph.edge[2].to = "Kenny";

        // Edge 4
        myGraph.edge[3].from = "Seth";
        myGraph.edge[3].to = "Joshua";
        
        // Edge 5
        myGraph.edge[4].from = "Seth";
        myGraph.edge[4].to = "Jessica";
        
        // Edge 6
        myGraph.edge[5].from = "Seth";
        myGraph.edge[5].to = "Sevi";
        
        // Edge 7
        myGraph.edge[6].from = "Seth";      
        myGraph.edge[6].to = "Ryan";
        
        // Edge 8
        myGraph.edge[7].from = "Seth";
        myGraph.edge[7].to = "Alexa";
        
        // Edge 9
        myGraph.edge[8].from = "Seth";
        myGraph.edge[8].to = "Carlos";
        
        // Edge 10
        myGraph.edge[9].from = "Seth";
        myGraph.edge[9].to = "CB";

        myGraph.edge[10].from = "Seth";
        myGraph.edge[10].to = "Carlos";
        
      
        myGraph.edge[11].from = "Cb";
        myGraph.edge[11].to = "J-rhyz";
       
        myGraph.edge[12].from = "Cb";
        myGraph.edge[12].to = "Allen";

        myGraph.edge[13].from = "Cb";
        myGraph.edge[13].to = "Carlos";
        
     
        myGraph.edge[14].from = "Carlos";
        myGraph.edge[14].to = "Cb";
        
        myGraph.edge[15].from = "jaji";
        myGraph.edge[15].to = "Luna";
        
        myGraph.edge[16].from = "Luna";
        myGraph.edge[16].to = "Jessica";
        
        myGraph.edge[17].from = "Sevi";
        myGraph.edge[17].to = "Ryan";
       
        myGraph.edge[18].from = "Sevi";
        myGraph.edge[18].to = "Jasfer";
        
        myGraph.edge[19].from = "Ryan";
        myGraph.edge[19].to = "Jasfer";
       
        myGraph.edge[20].from = "Ryan";
        myGraph.edge[20].to = "Sevi";
        
        
        
        
   
   
   
        
        
        System.out.println("Seth's Network of friends");

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(i+1 + ") " + myGraph.edge[i].from + " - " + myGraph.edge[i].to);
        }

    }
} 
