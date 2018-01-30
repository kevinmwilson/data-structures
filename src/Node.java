/**
 *
 * Simple one-directional node class for storing data.
 */
public class Node<T> {

  /**
   * The data that this node will hold
   */
  private T data;

  /**
   * The Node that this node points to.
   */
  private Node<T> next;

  public Node() {}

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return this.data;
  }

  public Node<T> getNext() {
    return this.next;
  }
}
