package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dfs0804 {

    private static int n, m;
    private static int[] pm;

    private static void DFS(int level) {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken()); // 1부터 N까지 번호
        m = Integer.parseInt(st.nextToken()); // M번을 뽑아 일렬로 나열하는 방법

        DFS(0);
    }
}
