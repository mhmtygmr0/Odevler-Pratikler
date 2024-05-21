package week4.ListeSinifiOdevi;

import java.util.Arrays;

public class MyList<T> {

    private T[] arrList;
    private int capacity = 10;


    public MyList() {
        this.arrList = (T[]) new Object[capacity];
    }


    public int size() {
        int count = 0;
        for (T i : arrList) {
            if (i != null) {
                count++;
            }
        }
        return count;
    }


    public void add(T arrayElement) {

        if (this.size() == this.getCapacity()) {
            int newCapacity = this.getCapacity() * 2;
            T[] newArrList = (T[]) new Object[newCapacity];
            for (int i = 0; i < this.size(); i++) {
                newArrList[i] = arrList[i];
            }
            this.setCapacity(newCapacity);
            this.arrList = newArrList;
        }

        if (this.size() < this.getCapacity()) {
            for (int i = 0; i < arrList.length; i++) {
                if (arrList[i] == null) {
                    arrList[i] = arrayElement;
                    break;
                }
            }
        }

    }


    public void remove(int index) {
        arrList[index] = null;

        for (int i = index + 1; i < arrList.length; i++) {
            arrList[i - 1] = arrList[i];
        }
    }


    public T get(int index) {
        return this.arrList[index];
    }


    public void set(int index, T newElement) {
        arrList[index] = newElement;
    }


    @Override
    public String toString() {
        T[] newArrList = (T[]) new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            newArrList[i] = arrList[i];
        }
        return Arrays.toString(newArrList);
    }


    public boolean isEmpty() {
        int count = 0;
        for (int i = 0; i < this.getCapacity(); i++) {
            if (arrList[i] != null) {
                count++;
            }
        }

        return count > 0;
    }


    public int lastIndexOf(T data) {
        int a = -1;
        for (int i = 0; i < this.getCapacity(); i++) {
            if (arrList[i] == data) {
                a = i;
            }
        }
        return a;
    }


    public int indexOf(T data) {
        int a = -1;
        for (int i = this.getCapacity() - 1; i > -1; i--) {
            if (arrList[i] == data) {
                a = i;
            }
        }
        return a;
    }


    public T[] toArray() {
        T[] newArray = (T[]) new Object[this.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrList[i];
        }
        return newArray;
    }


    public MyList<T> sublist(int start, int finish) {
        MyList<T> subList = new MyList<>();

        for (int i = start; i <= finish; i++) {
            subList.add(this.get(i));
        }

        return subList;
    }


    public boolean contains(T data) {
        int count = 0;
        for (int i = 0; i < this.getCapacity(); i++) {
            if (arrList[i] == data) {
                count++;
            }
        }
        return count > 0;
    }


    public void clear() {
        for (int i = 0; i < this.getCapacity(); i++) {
            arrList[i] = null;
        }
    }


    public int getCapacity() {
        return this.capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}