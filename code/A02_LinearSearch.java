import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A02_LinearSearch {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean found = false;
		for (int a : A) {
			if (a == X) {
				found = true;
				break;
			}
		}

    StringBuilder sb = new StringBuilder();
		if (found) sb.append("Yes");
		else sb.append("No");
    System.out.println(sb);
	}
}
		
		