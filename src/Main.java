public class Main {
    public static void main(String[] args) {
        LinkedDoubleList lista = new LinkedDoubleList();
        lista.insert("juanjo");
        lista.insert("Mary");
        lista.insert("Johan");
        lista.printList();
        System.out.println(lista.getData(2));
    }
}
