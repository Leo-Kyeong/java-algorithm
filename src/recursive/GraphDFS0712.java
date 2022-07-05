package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GraphDFS0712 {

    // 1번 정점에서 n번 정점으로 가는 모든 경로의 가지 수(result)를 출력
    private static int n, m, result = 0;
    private static int[][] graph;
    private static int[] check;

    public static void DFS(int v) {
        if(v == n) result++;
        else {
            for(int i = 0; i <= n; i++) {
                // 갈 수 있는 정점을 찾고
                // 방문하지 않은 정점을 찾는다.
                if(graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1; // 방문 체크
                    DFS(i);
                    check[i] = 0; // 방문 체크 취소 (백트래킹)
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st1.nextToken()); // 정점의 수
        m = Integer.parseInt(st1.nextToken()); // 간선의 수

        // 인덱스는 1부터 시작
        graph = new int[n+1][n+1];
        check = new int[n+1];

        for(int i = 0; i < m; i++) { // m줄에 걸쳐 연결 정보 입력
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b =Integer.parseInt(st2.nextToken());
            graph[a][b]=1;
        }
        check[1] = 1; // 1번 node 체크
        DFS(1);
        System.out.println(result);
    }
}
