import java.util.ArrayList;

public class Zeckendorf {

  private static final int[] fibs = {13, 8, 5, 3, 2, 1};

  public static void main(String[] args) {
    for (int i = 0; i <= 15; i++) {
      if (i == 0) {
        System.out.print("0");

      } else {
        System.out.println(gen(i));
      }
    }
  }

  public static String gen(int num) {
    ArrayList<Integer> zeros = new ArrayList<>();
    int sum = 0;
    for (int fib : fibs) {
      if (sum + fib >= num) {
        zeros.add(0);
      } else {
        zeros.add(1);
        sum = sum + fib;
      }
    }
    return makeString(zeros);
  }

  public static String makeString(ArrayList<Integer> zeros) {
    String n = "";
    boolean firstOne = false;
    for (int i: zeros) {
      if (i != 0) {
        n = n + i;
        firstOne = true;
      } else {
        if (firstOne) {
          n = n + i;
        }
      }
    }
    return n;
  }
}