public class InvalidAgeException extends IllegalArgumentException {
  public InvalidAgeException() {
    super("An age cannot be smaller than zero");
  }
}
