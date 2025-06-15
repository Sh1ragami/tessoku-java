import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A04_BinaryRepresentation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();
    for (int i = 9; i >= 0; i--) {
      sb.append((N / (1 << i) ) & 1);
    }

    System.out.println(sb);
  }
}