package it.books.thinkinginjava.esercizi.appendice.a.pag671;

import java.util.Arrays;
import java.util.List;

public class Alias2 {
    int i;
    Alias2(int ii) {
        i=ii;
    }
    static void f(Alias2 reference) {
        reference.i++;
    }
    private static void sortArray() {
        String[] a= {"a", "b", "j", "e"};
        List<String> b = Arrays.asList(a);
        System.out.println(b);
        Object[] c = b.toArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.binarySearch(c,"e"));

        Long[] d= {1L, 2L, 3L, 7L, 5L};
        List<Long> e = Arrays.asList(d);
        System.out.println(e);
        Object[] f = e.toArray();
        Arrays.sort(f);
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.binarySearch(f,7L));



    }


    public static void main(String[] args) {
        Alias2 x = new Alias2(7);
        System.out.println("x: " + x.i);
        System.out.println("Calling f(x)");
        f(x);
        System.out.println("x: "+ x.i);

        sortArray();
    }
}
