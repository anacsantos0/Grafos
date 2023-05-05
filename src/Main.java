public class Main {
    public static void main(String[] args) {

        System.out.println("--------------MATRIZ DE ADJACÊNCIA----------");
        MatrizGrafo grafo1 = new MatrizGrafo(6);
        grafo1.addVertice(0,1);
        grafo1.addVertice(0,2);
        grafo1.addVertice(0,3);
        grafo1.addVertice(2,4);
        grafo1.addVertice(5,5);

        grafo1.dfs(0);
        grafo1.bfs(0, 4);
        System.out.println();
        grafo1.bfs(0,5);

        System.out.println("\n--------------LISTA DE ADJACÊNCIA----------------");
        ListaGrafo grafo = new ListaGrafo(5);
        grafo.addEdge(2, 0);
        grafo.addEdge(0, 1);
        grafo.addEdge(0, 2);
        grafo.addEdge(1, 2);
        grafo.addEdge(2, 3);
        grafo.addEdge(4, 4);

        grafo.BFS(0, 3);
        grafo.DFS(2);
        grafo.BFS(1,4);


    }
}