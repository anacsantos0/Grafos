import java.util.LinkedList;
import java.util.Stack;

public class ListaGrafo {
    private int tamanho;
    private LinkedList<Integer> adj[];

    ListaGrafo(int tamanho){
        this.tamanho = tamanho;
        this.adj = new LinkedList[tamanho];
        for(int i = 0; i < tamanho; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int inicio, int destino) {
        adj[inicio].add(destino);
    }

    public void BFS (int inicio, int destino) {
        boolean[] visited = new boolean[tamanho];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[inicio] = true;
        queue.add(inicio);
        System.out.println("BFS, Caminho de " + inicio + " para " + destino + ": ");
        while(queue.size() != 0) {
            int initial = queue.poll();
            System.out.print(initial + " ");

            for (int current : adj[initial]) {
                if (!visited[current]) {
                    visited[current] = true;
                    queue.add(current);
                }
            }

        }
        System.out.println();
        for(int i=0;i<tamanho;i++){
            if(!visited[i] && (i == destino)){
                System.out.println("\nNão há caminho entre: " + inicio + " " + destino);
                return;
            }
        }
    }

    public void DFS(int inicio){
        boolean[] visited = new boolean[tamanho];
        Stack<Integer> stack = new Stack<>();

        visited[inicio] = true;
        stack.push(inicio);
        System.out.println("DFS a partir de: " + inicio);

        while(!stack.isEmpty()){
            inicio = stack.pop();
            System.out.printf(inicio + " ");
            for(int current : adj[inicio]){
                if(!visited[current]){
                    visited[current] = true;
                    stack.push(current);
                }
            }
        }
        System.out.println();


    }
}
