import java.util.List;

/**
 * This class will work with the controller. The controller will call methods in this class
 * based on information the user has given to the controller, and this class will make the
 * change to the model that the user has requested. This class will work closely with the shapes
 * interface to be able to successfully do what the user wants.
 */
public class Command {

  List<String> commands;
  int startTick;
  int endTick;
  boolean canTeleport;

  //constructor
  Command(List<String> commands, int startTick, int endTick) {
    this.commands = commands;
    this.startTick = startTick;
    this.endTick = endTick;
  }

  /**
   * Completes the desired move to move a shape from its current x and y coordinates to the
   * new desired x and y coordinates of the user.
   * @param xPrev The x coordinate of the shape's prior position.
   * @param yPrev The y coordinate of the shape's prior position.
   * @param x The x coordinate of the shape's new position.
   * @param y The y coordinate of the shape's new position.
   * @param shape The shape that the user would like to move.
   * @param canTeleport True if the shape can teleport, false if the shape's starting and ending
   *                    points must line up.
   * @throws IllegalArgumentException if the shape tries to teleport but is not allowed to.
   */
  void move(int xPrev, int yPrev, int x, int y, IShape shape, boolean canTeleport)
      throws IllegalArgumentException {
    //call method in the AShape class on the specific shape the user is referring too
    shape.move(xPrev, yPrev, x, y, canTeleport);
    //add the move to the accumulating string of commands
    //this.commands.add("motion " + shape.getName() +  startTick + xPrev + yPrev + )


  }

  /**
   * Changes the color of the given shape from its current color to the color that the user
   * would like the shape to now be.
   * @param color The color, in string form, that the user would like the shape to now be.
   * @param shape The shape that the user would like to move.
   */
  void changeColor(String color, IShape shape) {
    //will call to a method in the abstract shape class
    //add the change to the accumulating string of commands
  }

  /**
   * Changes the dimension of the shape to the dimensions specified by the user.
   * @param w The width of the new shape.
   * @param h The height of the new shape.
   * @param shape The shape that the user would like to move.
   */
  void changeDimension(int w, int h, IShape shape) {
    //will call to a method in the abstract shape class
    //add the change to the accumulating string of commands
  }

  /**
   * Adds a shape into the list of shapes, which is kept track of in the abstract shapes class.
   * @param shapeToAdd The shape that the user would like to add into the list of shapes.
   */
  void addShape(AShape shapeToAdd) {
    //will call to a method in the abstract shape class
    //add the change to the accumulating string of commands
  }

  /**
   * Removes a shape from the list of shapes, which is kept track of in the abstract shapes class.
   * @param shapeToRemove The shape that the user would like to remove from the list of shapes.
   */
  void removeShape(AShape shapeToRemove) {
    //will call to a method in the abstract shape class
    //add the change to the accumulating string of commands
  }

  /**
   * Returns a list of all of the commands that have been given by the user so far. This should
   * include each shape that is in the scene, including its position, dimensions, and color at
   * each increment of ticks (designated by the user) throughout the animation.
   * @return a string containing the full list of all detailed commands from the user.
   */
  String getAllCommands() {
    //will call to a method in the abstract shape class
    return "";
  }



}
