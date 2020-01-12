package app;

public class App {
    public static void main(String[] args) throws Exception {
    
        LinkedList list = new LinkedList();
        list.insertData(23);
        list.insertData(10);
        list.insertData(67);
        list.insertAtStart(50);
        list.insertAtAnyLocation(1, 100);
    
        list.show();

    }
    
}