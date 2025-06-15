import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A06_HowManyGuests {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int Q = Integer.parseInt(st.nextToken());

    int[] A = new int[N + 1];
    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
      A[i] += A[i - 1];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      st = new StringTokenizer(br.readLine());
      int L = Integer.parseInt(st.nextToken());
      int R = Integer.parseInt(st.nextToken());
      
      sb.append(A[R] - A[L-1]);
      sb.append("\n");
    }
    System.out.println(sb);
  }
}