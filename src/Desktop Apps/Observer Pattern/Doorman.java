import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Doorman extends Thread {
  private final List<ArrivesAtThePartyObserver> observers = new ArrayList<>();

  public void addArrivesAtThePartyObserver(ArrivesAtThePartyObserver observer) {
    observers.add(observer);
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      if (!scanner.nextLine().equals("1")) {
        System.out.println("False alarm");

        continue;
      }

      ArrivesAtTheParty event = new ArrivesAtTheParty(new Date());

      for (ArrivesAtThePartyObserver observer : observers) {
        observer.arrive(event);
      }

      break;
    }
  }
}
