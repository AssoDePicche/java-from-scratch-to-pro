public class Track<K, V> {
  private K key;

  private V value;

  public Track(K key, V value) {
    this.key = key;

    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public int hashCode() {
    return key.hashCode();
  }

  public boolean equals(Track<K, V> track) {
    boolean notNull = track != null;

    boolean sameInstance = this == track;

    boolean sameClass = getClass() == track.getClass();

    boolean sameKeys = key.equals(track.getKey());

    return notNull && sameClass && sameInstance && sameKeys;
  }
}
