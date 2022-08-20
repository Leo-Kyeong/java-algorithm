package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dfs0804 {
	private static int n, m;
	private static int[] pm;

	private static void DFS(int level) {
		if (level == m) {
			for (int x : pm) System.out.print(x + " ");
			System.out.print("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			pm[level] = i;
			DFS(level + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken()); // 1부터 N까지 번호
		m = Integer.parseInt(st.nextToken()); // M번을 뽑아 일렬로 나열하는 방법
		pm = new int[m];
		DFS(0);
	}
}
