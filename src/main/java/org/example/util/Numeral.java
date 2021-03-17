package org.example.util;

import java.util.Objects;

public class Numeral implements Comparable<Numeral>{
    private int index;
    private int count;

    public Numeral() {
    }

    public Numeral(int index, int count) {
        this.index = index;
        this.count = count;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" + index + ", " + count + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numeral numeral = (Numeral) o;
        return index == numeral.index && count == numeral.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, count);
    }

    @Override
    public int compareTo(Numeral o) {
        if (this.getCount() > o.getCount()) {
            return -1;
        } else if (this.getCount() < o.getCount()) {
            return 1;
        } else {
            return Integer.compare(this.getIndex(), o.getIndex());
        }
    }
}
