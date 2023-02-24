import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Playlist<K extends Number, V> {
  private final Set<Track<K, V>> items = new LinkedHashSet<>();

  public void add(K key, V value) {
    if (key == null) {
      return;
    }

    Track<K, V> track = new Track<>(key, value);

    if (items.contains(track)) {
      items.remove(track);
    }

    items.add(track);
  }

  public V get(K key) {
    if (key == null) {
      return null;
    }

    Optional<Track<K, V>> track = items.stream().filter(item -> key.equals(item.getKey())).findFirst();

    return track.isPresent() ? track.get().getValue() : null;
  }

  public Stream<Track<K, V>> stream() {
    return items.stream();
  }
}
