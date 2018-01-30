/**
 * A singly linked linked list that uses the Node class
 */
public class LinkedList<T> {

  private Node<T> head;
  private Node<T> tail;

  public LinkedList() {}

  public LinkedList(Node<T> head) {
    this.head = head;

    findTail();
  }

  public Node<T> getHead() {
    return this.head;
  }

  public Node<T> getTail() {
    return this.tail;
  }

  /**
   * Iterates through the list to find the tail
   */
  private void findTail() {
    Node<T> iter = this.head;

    while(iter.getNext() != null) {
      iter = iter.getNext();
    }

    this.tail = iter;
  }

  public void append(Node<T> n) {

    // if the list is null, make the appendee the head
    if (this.head == null) {
      this.head = n;
      this.tail = n;
      return;
    }

    tail.setNext(n);
    tail = n;
  }

  public void prepend(Node<T> n) {
    if (this.head == null) {
      this.head = n;
      this.tail = n;
    }

    n.setNext(this.head);
    this.head = n;
  }

  /**
   * Meant to be a simple print function for simple types (integer, string)
   */
  @Override
  public String toString() {
    Node<T> iter = this.head;

    // hardcoded output string capacity for example's sake
    StringBuilder out = new StringBuilder(100);

    while(iter.getNext() != null) {
      out.append(iter).append("->");
      iter = iter.getNext();
    }

    // add the last element of the list whose getNext() is null
    out.append(iter);

    return out.toString();
  }
}
