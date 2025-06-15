import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A07_EventAttendance {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int D = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());

    int[] acm = new int[D + 2];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int L = Integer.parseInt(st.nextToken());
      int R = Integer.parseInt(st.nextToken());

      acm[L]++;
      acm[R + 1]--;
    }

    for (int i = 1; i <= D; i++) {
      acm[i] += acm[i - 1];
    }
    
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= D; i++) {
      sb.append(acm[i]).append("\n");
    }

    System.out.println(sb);
  }
}