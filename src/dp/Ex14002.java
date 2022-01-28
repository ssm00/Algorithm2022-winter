package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex14002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		int[] d = new int[n];
		int[] v = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = 1;
			v[0] = -1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
					v[i] = j;
				}
			}
		}
		int max = 1;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, d[i]);
		}
		bw.write(String.valueOf(max) + "\n");
		bw.flush();

		Stack<Integer> st = new Stack<Integer>();
		for (int i = n - 1; i >= 0; i--) {
			if (d[i] == max) {
				st.push(arr[i]);
				max--;
			}
		}
		while (!st.isEmpty()) {
			bw.write(String.valueOf(st.pop()) + " ");
		}

		bw.close();
	}

}
