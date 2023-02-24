public class Solution {
  public static void main(String[] args) {
    Playlist<Integer, String> playlist = new Playlist<>();

    playlist.add(1, "King Kunta");

    playlist.add(2, "Alright");

    playlist.add(3, "i");

    playlist.add(4, "HUMBLE.");

    playlist.add(5, "DNA.");

    playlist.stream().forEach(x -> System.out.println("#" + x.getKey() + " - " + x.getValue()));
  }
}
