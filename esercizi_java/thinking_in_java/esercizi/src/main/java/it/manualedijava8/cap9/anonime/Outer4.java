package it.manualedijava8.cap9.anonime;

public class Outer4 {
    private String messaggio = "Nella classe ";
    ClasseEsistente ce = new ClasseEsistente() {
        @Override
        public void metodo() {
            System.out.println(getClass().getName() + "-" + messaggio + "anonima");
        }


    };

    private void print() {
        System.out.println(getClass().getName());
        ce.metodo();
    }

    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        outer4.print();
    }
}


