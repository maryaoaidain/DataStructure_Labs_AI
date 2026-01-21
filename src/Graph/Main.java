package Graph;

public class Main {
    public static void main(String[] args)
    {
        AdjacencyList adjList = new AdjacencyList( 3);
        adjList.addedges(1,2);
        adjList.addedges(0,2);
        adjList.addedges(0,1);
        adjList.display();

    }}
