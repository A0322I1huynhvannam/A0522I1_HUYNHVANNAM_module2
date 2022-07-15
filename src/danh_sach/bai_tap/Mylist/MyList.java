package danh_sach.bai_tap.Mylist.Mylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    // phương thức tăng kích thước của ArrayList.
    public void ensureCapacity(int initialCapacity) {
        if (initialCapacity >= 0) {
            int newSize = this.elements.length + initialCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khởi tạo thành công với kích thước sau khi tăng thêm là: " + elements.length);
        } else {
            throw new IndexOutOfBoundsException("Initial capacity: " + initialCapacity);
        }
    }

    public int size() {
        return size;
    }

    public int length() {
        return elements.length;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void add(int index, E e) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index : " + index);
        } else if (elements.length == index) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            elements[index] = e;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Error index: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements;
    }

    public MyList<E> clone() {
        MyList<E> newArrayList = new MyList<>();
        newArrayList.size = size;
        newArrayList.elements = Arrays.copyOf(elements, size);
        return newArrayList;
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }
}


