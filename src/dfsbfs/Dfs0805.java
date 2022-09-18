package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Dfs0805 {
	private static Integer[] moneyType;
	private static int n, m, result = Integer.MAX_VALUE;

	private static void DFS(int level, int sum) {
		if (level >= result) return;
		if (sum > m) return;
		if (sum == m) {
			result = Math.min(result, level);
		} else {
			for (int i = 0; i < n; i++) {
				DFS(level + 1, sum + moneyType[i]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		moneyType = new Integer[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			moneyType[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(moneyType, Collections.reverseOrder()); // 내림차순, 높은 금액부터 탐색 (효율 증가)
		m = Integer.parseInt(br.readLine());
		DFS(0, 0);
		System.out.println(result);
	}
}
