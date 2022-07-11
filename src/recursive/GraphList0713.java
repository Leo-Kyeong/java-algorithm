package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 인접 리스트 이용
 */
public class GraphList0713 {

    // 1번 정점에서 n번 정점으로 가는 모든 경로의 가지 수(result)를 출력
    private static int n, m, result = 0;
    private static ArrayList<ArrayList<Integer>> graph;
    private static int[] check;

    public static void DFS(int v) {
        if (v == n) result++;
        else {
            for(int nv : graph.get(v)) { // nv는 v번째 ArrayList 값
                if (check[nv] == 0) { // nv번 정점을 방문 하였는가?
                    check[nv] = 1; // 방문 노드 체크
                    DFS(nv); // 재귀 호출
                    check[nv] = 0; // 방문 노드 체크 취소 (백트래킹)
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st1.nextToken()); // 정점의 수 : 5
        m = Integer.parseInt(st1.nextToken()); // 간선의 수 : 9

        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++){ // 정점의 수 + 1 만큼 ArrayList<Integer> 생성, 0번 인덱스 사용 X
            graph.add(new ArrayList<Integer>());
        }

        check = new int[n+1];

        for(int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b =Integer.parseInt(st2.nextToken());
            graph.get(a).add(b); // 1 : 2,3,4
        }
        check[1] = 1; // 1번 방문 노드 체크
        DFS(1); // 1번 노드부터 출발
        System.out.println(result);
    }
}
