package com.MyIntegerList;

/**
 * Created by Роберт on 30.11.2016.
 */
public class MassiveList implements MyIntegerList {

    private int numOfElem;
    private int[] mas;
    private int maxSize;

    public MassiveList(int maxSize) {
        this.maxSize = maxSize;
        mas = new int[maxSize];
        numOfElem = 0;
    }

    @Override
    public void insertFirst(int value) {
        if (isEmpty()) {
            mas[numOfElem++] = value;
        } else {

            for (int i = numOfElem - 1; i >= 0; i--) {
                mas[i + 1] = mas[i];
            }
            numOfElem++;
            mas[0] = value;
        }
    }

    public int valueAt(int index) {
        if (index < maxSize) {
            return mas[index];
        }
        else {
            return -1;
        }
    }

    @Override
    public void insertLast(int iData) {
        mas[numOfElem++] = iData;
    }

    @Override
    public boolean delete(int iData) {
        for (int i = 0; i <= numOfElem; i++) {
            if (mas[i] == iData) {
                while (i < numOfElem - 1) {
                    mas[i] = mas[i + 1];
                    i++;
                }
                numOfElem--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayList() {
        for (int i = 0; i < numOfElem; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public boolean isEmpty() {
        return numOfElem == 0;
    }
}
