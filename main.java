public class main {
  public static void main(String[] args) {
    SinglyLinkedList<String> MyList = new SinglyLinkedList<String>();
    MyList.addFirst("Element 1");
    MyList.addFirst("Element 2");
    MyList.addFirst("Element 3");
    MyList.addLast("Element 4");
    MyList.addLast("Element 5");
    MyList.addLast("Element 6");
    MyList.removeLast();
    MyList.removeLast();
    MyList.display();    
    // while(!MyList.isEmpty()) {
    //   MyList.removeFirst();
    // }
    System.out.println(MyList.getLength());
  }
}
