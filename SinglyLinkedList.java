public class SinglyLinkedList<T> {
  // Implement a node
  private static class Node<T> {
    private T element;
    private Node<T> next;
    public Node(T e, Node<T> n) {
      element = e;
      next = n;
    }
    public T getElement() {
      return element;
    }
    public Node<T> getNext() {
      return next;
    }
    public void setNext(Node<T> n) {
      next = n;
    }
  }
  // List Implementation
  private Node<T> head = null;
  private Node<T> tail = null;
  private int size = 0;
  public SinglyLinkedList() {};
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public T first() {
    if (isEmpty()) return null;
    return head.getElement();
  }
  public T last() {
    if (isEmpty()) return null;
    return tail.getElement();
  }
  public void display() {
    if (isEmpty()) {
       System.out.println("List is Empty!!");
    } else {
      Node<T> temp = head;
      while (temp != null) {
        System.out.println(temp.getElement() + " Element");
        temp = temp.getNext();
      }
    }
   
  }
  public void addFirst(T e) {
    if (isEmpty()) {
      head = new Node<>(e, null);
    } else {
      head = new Node<>(e, head);
    }
    size++;
  }
  public void addLast(T e) {
    if (isEmpty()) {
      head = new Node<>(e, null);
    } else {
      Node<T> newNode = new Node<>(e, null);
      Node<T> temp = head;
      while(temp.getNext() != null) {
        temp = temp.getNext();
      }
      temp.setNext(newNode);
    }
    size++;
  }

  public T removeFirst() {
    if (isEmpty()) {
      return null;
    } else {
      T answer = head.getElement();
      Node<T> temp = head;
      temp.setNext(null);
      head = head.getNext();
      size--;
      return answer;
    }
  }
  public void removeLast() {
    if (isEmpty()) {
      System.out.println("List is Empty!! remove last method");
    } else {
      Node<T> prevNode = null;
      Node<T> temp = head;
      while(temp.getNext() != null) {
        prevNode = temp;
        temp = temp.getNext();
      }
      if (temp == head) {
        head = null;
      } else {
        prevNode.setNext(null);
      }
      size--;
    }
  }

  public int getLength() {
    if (head == null) {
      return 0;
    } else {
      int count = 0;
      Node<T> temp = head;
      while (temp != null) {
        count += 1;
        temp = temp.getNext();
      }
      return count;
    }
  }

  public void reverseList() {
    if(size <- 1) {

    }
    if (size == 2) {
      tail.setNext(head);
      head = tail;
      tail = head.getNext();
      tail.setNext(null);;
    } else {
      Node <T> current = head;

    }
  }
}
