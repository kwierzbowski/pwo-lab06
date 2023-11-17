package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa LucasGenerator to generator sekwencji Lucasa, rozszerzający klasę
 * FibonacciGenerator. Inicjalizuje stan generatora, obsługuje resetowanie
 * generatora do stanu początkowego oraz dostarcza kolejne wyrazy sekwencji
 * Lucasa.
 *
 * @author: kwierzbowski
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy LucasGenerator. Inicjalizuje początkowy stan generatora
     * sekwencji Lucasa.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Metoda resetująca generator sekwencji Lucasa do stanu początkowego.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Metoda dostarczająca kolejny wyraz sekwencji Lucasa.
     *
     * @return Kolejny wyraz sekwencji Lucasa.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
