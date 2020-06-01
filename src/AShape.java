import java.util.List;

public class AShape implements IShape {

  String name;
  int x;
  int y;
  int width;
  int height;
  int rColor;
  int gColor;
  int bColor;

  //constructor
  protected AShape(String name, int x, int y, int width, int height,
      int rColor, int gColor, int bColor) {
    this.name = name;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.rColor = rColor;
    this.gColor = gColor;
    this.bColor = bColor;
  }


  @Override
  public void move(int xPrev, int yPrev, int x, int y, boolean canTeleport)
      throws IllegalArgumentException{
    //throw an illegal argument exception if shape tries to teleport but isn't allowed
    if (!canTeleport && (xPrev != x || yPrev != y)) {
      throw new IllegalArgumentException("The shape cannot teleport unless it is explicitly"
          + "told that it can.");
    }
    //otherwise change the x and y of the shape to reflect the new given values.
    this.x = x;
    this.y = y;

  }

  @Override
  public void changeColor(String color) {

  }

  @Override
  public void changeDimension(int w, int h) {

  }

  @Override
  public String getAllCommands() {
    return null;
  }
}
