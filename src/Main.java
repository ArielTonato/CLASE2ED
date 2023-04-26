public class Main {
    public static void main(String[] args) {
        LinkedDoubleList lista = new LinkedDoubleList();

        lista.insert("Mary");
        lista.insert("Johan");
        lista.insert("juanjo");
        lista.delete(1);
        lista.printList();
    }
}
