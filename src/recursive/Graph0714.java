package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * 인접 리스트를 이용한 그래프 최단거리 구하기 (BFS)
 * 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력
 */
public class Graph0714 {

    private static int n, m;
    private static List<ArrayList<Integer>> graph;
    private static int[] ch, dis;

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 정점의 수 : 6
        int m = Integer.parseInt(st.nextToken()); // 간선의 수 : 9

        graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1]; // 방문한 정점 체크
        dis = new int[n+1]; // 최단거리
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
