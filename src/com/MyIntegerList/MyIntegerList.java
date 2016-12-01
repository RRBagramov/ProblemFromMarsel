package com.MyIntegerList;

/**
 * Created by Роберт on 30.11.2016.
 */
public interface MyIntegerList {

    void insertFirst(int value);


    void insertLast(int value);

    boolean delete(int value);

    void displayList();

    boolean isEmpty();

}
