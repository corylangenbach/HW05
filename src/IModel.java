import java.util.List;

public interface IModel {

  /**
   * Adds a shape into the list of shapes, which is kept track of in the abstract shapes class.
   * @param shapeToAdd The shape that the user would like to add into the list of shapes.
   */
  public void addShape(AShape shapeToAdd);

  /**
   * Removes a shape from the list of shapes, which is kept track of in the abstract shapes class.
   * @param shapeToRemove The shape that the user would like to remove from the list of shapes.
   */
  public void removeShape(AShape shapeToRemove);

}
