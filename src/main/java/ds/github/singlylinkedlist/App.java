package ds.github.singlylinkedlist;

public class App {

    public static void main(String args[]){
        SinglyLinkedLIst myList = new SinglyLinkedLIst();
        myList.insertFirst(100);
        myList.insertFirst(90);
        myList.insertFirst(80);
        myList.insertFirst(12);

        myList.displayList();
    }
}
