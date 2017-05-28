public class Solution526 {
  private final boolean[] _taken;

  public Solution526() {
    _taken = new boolean[16];
  }

  public int countArrangement(int N) {
    return countArrangements(N, 1);
  }

  private int countArrangements(int n, int i) {
    if (i == n + 1) {
      return 1;
    }
    int ans = 0;
    for (int j = 1; j <= n; j++) {
      if (((j % i) == 0 || (i % j) == 0) && !_taken[j]) {
        _taken[j] = true;
        ans += countArrangements(n, i + 1);
        _taken[j] = false;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int ans = new Solution526().countArrangement(5);
    System.out.println(ans);
  }
}
