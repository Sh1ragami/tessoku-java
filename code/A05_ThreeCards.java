import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A05_ThreeCards {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int total = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        int k = K - i - j;
        if (k > 0 && k <= N) total++;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(total);
    System.out.println(sb);
  }
}