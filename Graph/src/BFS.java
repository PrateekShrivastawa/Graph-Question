import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.get(start).add(end);
            arr.get(end).add(start);
        }
        int[] visited = new int[node + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = 1;
        while (!q.isEmpty()) {
            int val = q.poll();
            System.out.println(val);
            for (int i = 0; i < arr.get(val).size(); i++) {
                if (visited[arr.get(val).get(i)] == 0) {
                    q.add(arr.get(val).get(i));
                    visited[arr.get(val).get(i)] = 1;
                }
            }
        }
    }
}