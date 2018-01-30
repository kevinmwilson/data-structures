/**
 * A singly linked linked list that uses the Node class
 */
public class LinkedList<T> {

  private Node<T> head;

  public LinkedList() {}

  public LinkedList(Node<T> head) {
    this.head = head;
  }

  public Node<T> getHead() {
    return this.head;
  }

  public void setHead(Node<T> other) {
    this.head = other;
  }

  public void append(Node<T> n) {

    // an iterator to scan the list
    Node<T> iter = this.head;

    while(iter.getNext() != null) {
      iter = iter.getNext();
    }

    // iter is now the tail
    iter.setNext(n);
  }

  @Override
  public String toString() {
    Node<T> iter = this.head;

    // hardcoded output string capacity for example's sake
    StringBuilder out = new StringBuilder(100);

    while(iter.getNext() != null) {
      out.append(iter).append("->");
      iter = iter.getNext();
    }

    out.append(iter);

    return out.toString();
  }
}
