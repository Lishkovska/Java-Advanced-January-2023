package stackAndQueueLesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowsingHistory01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stackUrl = new ArrayDeque<>();
        String currentUrl = null;

        while (!input.equals("Home")){
          if (input.equals("back")){
              if(stackUrl.isEmpty()) {
                  System.out.println("no previous URLs");
                  input = scanner.nextLine();
                  continue;
              } else {
                  currentUrl = stackUrl.pop();
              }
          } else  {
              if (currentUrl != null) {
                  stackUrl.push(currentUrl);
              }
              currentUrl = input;
          }
            System.out.println(currentUrl);
          input = scanner.nextLine();
        }
    }
}
