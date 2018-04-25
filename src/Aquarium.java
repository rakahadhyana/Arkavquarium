/**
 * This class implements the aquarium of the ArkavQuarium
 * it inherits Interface.
 * @author Funtastic4
 * @version 1.0
 */
class Aquarium {
  private static final int size = 100;

  /**
   * Aquarium class ctor.
   */
  public Aquarium() {

  }

  /**
   * This returns the current size of the Aquarium.
   * @return this aquarium's size
   */
  public static int getSize() {
    return size;
  }

  /**
   * Function to calculate size*percent.
   * @param percent : desire percent
   * @return
   */
  private static double getPercentSize(int percent) {
    return (getSize() * percent / 100);
  }

  /**
   * Function to calculate size - size*percent.
   * @param percent : desire percent
   * @return
   */
  public static double getBorder(int percent) {
    return (getSize() - getPercentSize(percent));
  }
}
