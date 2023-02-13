public class Battle {
  private Pokemon p1, p2;

  public Battle(Pokemon p1, Pokemon p2) {
    this.p1 = p1;

    this.p2 = p2;
  }

  public static void main(String[] args) {
    new Battle(new Squirtle(), new Charmander()).start();
  }

  public void start() {
    Pokemon winner = getWinner(), looser = getLooser();

    System.out.println(looser.getName() + " fainted...\n");

    System.out.println(winner.getName() + " won!");
  }

  public Pokemon getWinner() {
    return p1.attacksToWinAgainst(p2) < p2.attacksToWinAgainst(p2) ? p1 : p2;
  }

  public Pokemon getLooser() {
    return p1.attacksToWinAgainst(p2) > p2.attacksToWinAgainst(p2) ? p1 : p2;
  }
}
