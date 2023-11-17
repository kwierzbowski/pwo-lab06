/*
 * Kliknij nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt, aby zmienić tę licencję
 * Kliknij nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java, aby edytować ten szablon
 */
package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa SeqToOutApp to interfejs wiersza poleceń (CLI), który generuje i drukuje sekwencję terminów w terminalu.
 * Rozszerza klasę SeqToFileApp i przesłania metody obsługi argumentów wiersza poleceń oraz zapisywania sekwencji do terminala.
 *
 * @author kwierzbowski
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Sprawdza argumenty wiersza poleceń dla rodzaju sekwencji, indeksu początkowego i indeksu końcowego.
     *
     * @param args Argumenty wiersza poleceń.
     * @return true, jeśli argumenty są poprawne; w przeciwnym razie false.
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }
        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Zapisuje wygenerowane terminy sekwencji do terminala.
     *
     * @return true, jeśli zapisywanie sekwencji zakończy się sukcesem; w przeciwnym razie false.
     */
    @Override
    protected boolean wirteSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));
        return true;
    }

    /**
     * Wykonuje aplikację CLI, drukuje opis, sprawdza i przetwarza argumenty wiersza poleceń,
     * a następnie zapisuje wygenerowaną sekwencję do terminala.
     *
     * @param args Argumenty wiersza poleceń.
     */
    @Override
    public void run(String[] args) {
        System.out.println("Aplikacja CLI dla sekwencji w terminalu");

        if (!getArgs(args)) {
            System.out.println("!Nieprawidłowe argumenty\n"
                    + "Poprawne użycie: seqName from to");
            return;
        }

        wirteSeq();
    }
}
