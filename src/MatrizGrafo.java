import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MatrizGrafo {
    private boolean matriz[][];
    private int numVertices;

    public MatrizGrafo(int numVertices){
        this.numVertices = numVertices;
        this.matriz = new boolean[numVertices][numVertices];
    }

    public void addVertice(int i, int j){
        matriz[i][j] = true;
        matriz[j][i] = true;
    }

    public void bfs(int inicio, int fim) {
        boolean[] visited = new boolean[matriz.length];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[inicio] = true;
        queue.offer(inicio);
        System.out.println("BFS, Caminho de " + inicio + " para " + fim + ": ");
        while(!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");
            if(current == fim){
                return;
            }
            for(int i = 0;i<matriz.length;i++){
                if(matriz[current][i] && !visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                }
            }

        }
        System.out.println();
        for(int i = 0; i<visited.length;i++){
            if(!visited[i] && (i == fim)){
                System.out.println("\nNão há caminho entre os vértices");
                return;
            }
        }

    }

    public void dfs(int inicio){
        boolean[] visited = new boolean[matriz.length];
        Stack<Integer> stack = new Stack<>();

        visited[inicio] = true;
        stack.push(inicio);

        System.out.println("DFS a partir de: " + inicio);

        while(!stack.isEmpty()){
            int current  = stack.pop();
            System.out.print(current + " ");

            for(int i=0;i<matriz.length;i++){
                if(matriz[current][i] && !visited[i]){
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
        System.out.println();

    }

}

