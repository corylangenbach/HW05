public interface IShape {

  /**
   * Completes the desired move to move a shape from its current x and y coordinates to the
   * new desired x and y coordinates of the user.
   * @param xPrev The x coordinate of the shape's prior position.
   * @param yPrev The y coordinate of the shape's prior position.
   * @param x The x coordinate of the shape's new position.
   * @param y The y coordinate of the shape's new position.
   * @param canTeleport True if the shape can teleport, false if the shape's starting and ending
   *                    points must line up.
   * @throws IllegalArgumentException if the shape tries to teleport but is not allowed to.
   */
  void move(int xPrev, int yPrev, int x, int y, boolean canTeleport)
      throws IllegalArgumentException;

  /**
   * Changes the color of the given shape from its current color to the color that the user
   * would like the shape to now be.
   * @param color The color, in string form, that the user would like the shape to now be.
   */
  void changeColor(String color);

  /**
   * Changes the dimension of the shape to the dimensions specified by the user.
   * @param w The width of the new shape.
   * @param h The height of the new shape.
   */
  void changeDimension(int w, int h);

  /**
   * Returns a list of all of the commands that have been given by the user so far. This should
   * include each shape that is in the scene, including its position, dimensions, and color at
   * each increment of ticks (designated by the user) throughout the animation.
   * @return a string containing the full list of all detailed commands from the user.
   */
  String getAllCommands();

}
