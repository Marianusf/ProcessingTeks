package TeksIndexing;

public class LinkedListOrderedMain {
    public static void main(String[] args) {
        LinkedListOrdered<String> linkedListSort = new LinkedListOrdered();

        linkedListSort.addSort("lumpia");
        linkedListSort.addSort("semarang");
        linkedListSort.addSort("solo");
        linkedListSort.addSort("rabu");

        System.out.println(linkedListSort.toString());
    }
}
