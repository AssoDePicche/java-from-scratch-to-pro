import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Solution {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Alexandre", "Bruno", "Daniel", "Jessica");

    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
