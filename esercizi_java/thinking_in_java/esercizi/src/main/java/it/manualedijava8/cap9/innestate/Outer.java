package it.manualedijava8.cap9.innestate;

public class Outer {
    private String messagio = "Nella classe ";
    private String stringOuter= "JAVA";
    private void stampaMessaggio() {
        System.out.println(messagio + "Esterna");
    }

    public void metodoOuter() {
        final int intMetodo=7;
        class InnnerOfMethod {
            public void metodoInner() {
                System.out.println(getClass().getName() + "-"+stringOuter + " " + intMetodo);

            }
        }
        InnnerOfMethod i = new InnnerOfMethod();
        i.metodoInner();
    }

    public class Inner {

        private String messagioInterno = "Nella classe ";
        private void metodo() {
            System.out.println(getClass().getName() + "-"+messagio + "Interna");
        }
        private void chiamaMetodo() {
            stampaMessaggio();
            this.metodo();
            // richiamo metodo outer
            Outer.this.stampaMessaggio();
        }

    }

    interface InnerInterface{}


    public static void main(String[] args) {
        // Come istanziare una classe interna
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        //
        inner.metodo();
        inner.chiamaMetodo();

        outer.stampaMessaggio();
        outer.metodoOuter();

    }

}
