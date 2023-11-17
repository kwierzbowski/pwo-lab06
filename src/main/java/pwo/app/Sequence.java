package pwo.app;

/**
 * Klasa Sequence to klasa główna aplikacji, która obsługuje argumenty wiersza
 * poleceń i uruchamia odpowiednią aplikację sekwencji w zależności od liczby
 * dostarczonych argumentów. Akceptuje 3 lub 4 argumenty i wywołuje odpowiednie
 * metody uruchamiające aplikacje do generowania sekwencji.
 *
 * @author: kwierzbowski
 */
public class Sequence {

    /**
     * Metoda główna aplikacji obsługująca argumenty wiersza poleceń i
     * uruchamiająca odpowiednią aplikację sekwencji.
     *
     * @param args Argumenty wiersza poleceń.
     */
    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}
