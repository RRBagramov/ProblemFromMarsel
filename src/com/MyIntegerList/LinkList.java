package com.MyIntegerList;

import java.util.List;

/**
 * Created by Роберт on 30.11.2016.
 */
public class LinkList implements MyIntegerList {

    class Link {
        public int iData;
        public Link next;

        Link(int value) {
            iData = value;
        }

        public void displayLink() {
            System.out.print(iData + " ");
        }

    }

    private Link first;
    public LinkList() {
        first = null;
    }

    @Override
    public void insertFirst(int value) {
        Link newLink = new Link(value);
        newLink.next = first;
        first = newLink;
    }

    public Link getFirst() {
        return first;
    }

    @Override
    public void insertLast(int value) {
        Link newLink = new Link(value);
        if (isEmpty()) {
            first = newLink;
        } else {
            Link current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newLink;
        }
    }

    @Override
    public boolean delete(int key) {
        Link current = first;
        Link previous = first;
        if (!isEmpty()) {
            while (current != null && current.iData != key) {
                previous = current;
                current = current.next;
            }
            if (current.iData == key) {
                previous.next = current.next;
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
    @Override
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
