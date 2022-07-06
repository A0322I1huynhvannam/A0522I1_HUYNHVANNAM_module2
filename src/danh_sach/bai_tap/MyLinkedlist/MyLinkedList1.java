package danh_sach.bai_tap;

public class MyLinkedList1<E> {
    public class Node {
        private Node next;
        private Object data;

        public Node(E data) {
        }

        public Node(Node next, Object data) {
            this.next = next;
            this.data = data;
        }
    }

    private int size;
    private Node head, tail;

    public MyLinkedList1() {
        size = 0;
        head = tail = null;
    }

    // phương thức tạo Node mới
    public Node newNode(E data) {
        Node node = new Node(data);
        return node;
    }

    public int size() {
        return size;
    }

    // phương thức trả về giá trị của Node.
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Error index: " + index);
        }
        Node p = head;
        for (int i = 0; i < index; i++)
            p = p.next;
        return (E) p.data;
    }

    public void set(E e, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Error index: " + index);
        else {
            Node p = head;
            for (int i = 0; i < index; i++)
                p = p.next;
            p.data = e;
        }
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        if (size == 0)
            head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // phương thức thêm giá trị mới vào cuối danh sách.
    public void addLast(E e) {
        Node newNode = newNode(e);
        if (size == 0)
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // phương thức xóa Node đầu tiên trong danh sách.
    public void removeFirst() {
        if (size == 0) {
            head = tail = null;
            return;
        }
        Node p = head;
        head = head.next;
        size--;
    }

    // phương thức xóa Node cuối trong danh sách.
    public void removeLast() {
        if (size == 1) {
            head = tail = null;
            return;
        }
        Node p = head;
        while (p.next != tail)
            p = p.next;
        p.next = null;
        tail = p;
        size--;
    }

    // phương thức xóa Node tại vị trí index trong danh sách.
    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Error index: " + index);
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node p = head;
        for (int i = 0; i < index - 1; i++)
            p = p.next;
        p.next = p.next.next;
        size--;
    }

    public boolean contains(E e) {
        Node p = head;
        while (p != null) {
            if (p.data.equals(e))
                return true;
            p = p.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node p = head;
        for (int i = 0; i < size; i++) {
            if (p.data == e)
                return i;
            p = p.next;
        }
        return -1;
    }

    // phương thức thêm giá trị mới vào bất kỹ chỗ nào trong danh sách.
    public void add(E e, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Error index: " + index);
        if (index == 0) {
            addFirst(e);
            return;
        }
        if (index == size) {
            addLast(e);
            return;
        }

        Node p = head, r = head;
        Node newNode = new Node(e);
        for (int i = 0; i < index - 1; i++) {
            r = r.next;
        }
        newNode.next = r.next;
        r.next = newNode;
        size++;
    }

    // phương thức xóa 1 Node khi biết giá trị trong danh sách.
    public E removeElement(E info) {
        Node current = head, previous = null;
        while (current != null) {
            if (current.data.equals(info)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return (E) current.data;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    // phương thức loại bỏ Node trùng
    public void removeDuplicates() {
        Node p = head, i = null, temp = null;
        if (p == null)
            return;
        while (p != null) {
            temp = p;
            i = p.next;
            while (i != null) {
                if (p.data.equals(i.data)) {
                    temp.next = i.next;
                } else {
                    temp = i;
                }
                i = i.next;
            }
            p = p.next;
        }
    }

    // phương thức in ra giá trị Node kề cuối trong danh sách.
    public E nearLast() {
        Node p = head;
        while (p.next != tail) {
            p = p.next;
        }
        return (E) p.data;
    }

    // phương thức đảo 2 Node đầu.
    public void exchange2firstNode() {
        Node p = head.next;
        head.next = p.next;
        p.next = head;
        head = p;
        p = head.next;
    }

    // phương thức đảo 2 Node cuối.
    public void exchange2lastNode() {
        Node p = head;
        while (p.next.next != tail)
            p = p.next;
        tail.next = p.next;
        p.next.next = null;
        p.next = tail;
        tail = tail.next;
    }

    public String toString() {
        String s = "";
        Node p = head;
        while (p != null) {
            s = s + p.data + " ";
            p = p.next;
        }
        return s;
    }

    // phương thức đảo danh sách.
    public void reverse() {
        Node current = head;
        Node previous = null, next = null;
        tail = head;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
}
