package com.MyIntegerList;

/**
 * Created by Роберт on 01.12.2016.
 */
public class MyLinkTest {
    public static void main(String[] args) {
        MassiveList arr = new MassiveList(5);
        for(int i=0;i<5;i++) {
            arr.insertLast(i * i);
        }
        arr.displayList();

        System.out.println();

        arr.delete(4);
        arr.displayList();

        System.out.println();

        arr.insertFirst(4);
        arr.displayList();

        System.out.println("\n");

        LinkList list = new LinkList();
        for(int i=0;i<5;i++) {
            list.insertLast(i * i);
        }
        list.displayList();

        System.out.println();

        list.delete(4);
        list.displayList();

        System.out.println();

        list.insertFirst(4);
        list.displayList();

    }

}
