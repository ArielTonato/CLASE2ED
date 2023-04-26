public class LinkedDoubleList {
    Node first;
    int size;

    public LinkedDoubleList() {
        this.first = null;
        this.size = 0;
    }

    public boolean insert(Object data) {
        if (this.first == null) {
            try {
                this.first = new Node(data);
                this.size++;
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        Node lastOne = this.first;
        while (lastOne.next != null) {
            lastOne = lastOne.next;
        }
        try {
            lastOne.next = new Node(lastOne, data);
            this.size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertBegin(Object data) {
        if (this.first == null) {
            try {
                this.first = new Node(data);
                this.size++;
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        try {
            this.first = new Node(null, data, this.first);
            this.first.next.prev = this.first;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean insertPosition(Object data, int position) {
        if (this.first == null) {
            try {
                this.first = new Node(data);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        if (position == 0) {
            return insertBegin(data);
        }

        if (position > this.size) {
            return false;
        }
        if (position == this.size) {
            return insert(data);
        }
        Node currentNode = this.first;
        int currentPosition = 0;
        while (currentPosition < position - 1) {
            currentNode = currentNode.next;
            currentPosition++;
        }
        try {
            currentNode.next = new Node(currentNode, data, currentNode.next);
            this.size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(int position) {
        if (this.first == null) {
            return false;
        }

        if (position == 0) {
            this.first = this.first.next;
            this.first.prev = null;
            size--;
            return true;
        }

        if (position > this.size) {
            return false;
        }

        Node currentNode = this.first;
        int currentPosition = 0;
        while (currentPosition < position-1){
            currentNode = currentNode.next;
            currentPosition++;
        }
        currentNode.next = currentNode.next.next;

        return true;

    }

    public void printList() {
        Node currentNode = this.first;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
