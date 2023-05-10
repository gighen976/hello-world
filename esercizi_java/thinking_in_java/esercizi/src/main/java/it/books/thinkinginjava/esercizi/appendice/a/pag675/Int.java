package it.books.thinkinginjava.esercizi.appendice.a.pag675;

public class Int implements Cloneable{
    private int i;
    public Int(int ii) {
        i=ii;
    }
    public void increment() {
        i++;
    }
    public String toString() {
        return Integer.toString(i);
    }

    @Override
    public Int clone() {
        try {
            Int clone = (Int) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
