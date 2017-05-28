import java.util.Arrays;


public class Solution338 {
  public int[] countBits(int num) {
    int[] ans = new int[num + 1];
    int pow = 0;
    for (int i = 1; i <= num; i++) {
      if (i == (1 << (pow + 1))) {
        pow++;
      }
      int delta = i - (1 << pow);
      ans[i] = 1 + ans[delta];
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] ans = new Solution338().countBits(100);
    System.out.println(Arrays.toString(ans));
  }
}
