import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

  @Test
  public void addNodeToNullListGetDataTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.append(new Node<>(5));

    assertEquals((Integer) 5, list.getHead().getData());
  }

  @Test
  public void toStringTest() {
    LinkedList<String> list = new LinkedList<>(new Node<>("Hello"));
    list.append(new Node<>("how"));
    list.append(new Node<>("are"));
    list.append(new Node<>("you"));

    String expected = "Hello->how->are->you";

    assertEquals(expected, list.toString());
  }
}