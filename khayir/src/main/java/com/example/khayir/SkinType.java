package com.example.khayir;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public enum SkinType implements List<Cosmetic> {
    DRY, OILY, NORMAL, COMBINATION, SENSITIVE;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Cosmetic> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Cosmetic cosmetic) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Cosmetic> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Cosmetic> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Cosmetic get(int index) {
        return null;
    }

    @Override
    public Cosmetic set(int index, Cosmetic element) {
        return null;
    }

    @Override
    public void add(int index, Cosmetic element) {

    }

    @Override
    public Cosmetic remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Cosmetic> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Cosmetic> listIterator(int index) {
        return null;
    }

    @Override
    public List<Cosmetic> subList(int fromIndex, int toIndex) {
        return null;
    }
}

