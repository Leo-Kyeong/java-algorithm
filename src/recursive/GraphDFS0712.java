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
        if(v == n) result++; // 1번 노드에서 n번 노드에 도달하면 경로의 가지 수 1 증가
        else {
            for(int i = 0; i <= n; i++) { // n번 반복
                // 이동할 수 있는 정점을 찾고
                // 해당 정점이 방문하지 않았던 정점인지 확인
                if(graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1; // 방문 노드 체크
                    DFS(i); // 재귀 호출
                    check[i] = 0; // 방문 노드 체크 취소 (백트래킹)
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st1.nextToken()); // 정점의 수 : 5
        m = Integer.parseInt(st1.nextToken()); // 간선의 수 : 9

        // 인덱스는 1부터 시작
        graph = new int[n+1][n+1];
        check = new int[n+1];

        for(int i = 0; i < m; i++) { // m줄에 걸쳐 연결 정보 입력
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b =Integer.parseInt(st2.nextToken());
            graph[a][b] = 1;
        }
        check[1] = 1; // 1번 방문 노드 체크
        DFS(1);
        System.out.println(result);
    }
}
