package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa FibonacciGenerator to generator sekwencji Fibonacciego, rozszerzający klasę Generator.
 * Inicjalizuje stan generatora, obsługuje resetowanie generatora do stanu początkowego oraz dostarcza kolejne wyrazy sekwencji Fibonacciego.
 *
 * @author: kwierzbowski
 */
public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor klasy FibonacciGenerator. Inicjalizuje początkowy stan generatora.
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Metoda resetująca generator do stanu początkowego.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Metoda dostarczająca kolejny wyraz sekwencji Fibonacciego.
     *
     * @return Kolejny wyraz sekwencji Fibonacciego.
     */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
