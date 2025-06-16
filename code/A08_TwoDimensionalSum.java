import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A08_TwoDimensionalSum {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());

    int[][] X = new int[H + 1][W + 1];

    for (int i = 1; i <= H; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= W; j++) {
        X[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        X[i][j] += X[i - 1][j] + X[i][j - 1] - X[i - 1][j - 1];
      }
    }

    int Q = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < Q; i++) {
      st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      int D = Integer.parseInt(st.nextToken());

      int answer = X[C][D] + X[A - 1][B - 1] - X[A - 1][D] - X[C][B - 1];
      sb.append(answer).append("\n");
    }

    System.out.println(sb);
  }
}