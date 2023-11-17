package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa TribonacciGenerator to generator sekwencji Tribonacciego, rozszerzający
 * klasę FibonacciGenerator. Inicjalizuje stan generatora, obsługuje resetowanie
 * generatora do stanu początkowego oraz dostarcza kolejne wyrazy sekwencji
 * Tribonacciego.
 *
 * @author: kwierzbowski
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Konstruktor klasy TribonacciGenerator. Inicjalizuje początkowy stan
     * generatora sekwencji Tribonacciego.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Metoda resetująca generator sekwencji Tribonacciego do stanu
     * początkowego.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Metoda dostarczająca kolejny wyraz sekwencji Tribonacciego.
     *
     * @return Kolejny wyraz sekwencji Tribonacciego.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
