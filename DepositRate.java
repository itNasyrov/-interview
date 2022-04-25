import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RateOperations {

    class Payment {
        BigDecimal number;
        // constructors, setters, getters
    }

    class DepositRate {
        BigDecimal minAmount;
        BigDecimal maxAmount;
        BigDecimal rate;
        // constructors, setters, getters
    }

    /* ПРИМЕР 1 */
    List<DepositRate> rates = getRates(); // получили объекты из какого-либо источника
    BigDecimal amount = BigDecimal.valueOf(1000);
    BigDecimal rate = rates
            .filter(r -> (r.getMinAmount().doubleValue() <= amount.doubleValue())
                    && (r.getMaxAmount().doubleValue() > amount.doubleValue()))
            .map(r -> r.getRate())
            .findFirst()
            .orElseGet(() -> BigDecimal.ZERO);
    /* ПРИМЕР 1 КОНЕЦ */


    /* ПРИМЕР 2 */
    List<Payment> payments = list.getPayments()
            .stream()
            .sorted(Comparator.comparing(Payment::getNumber))
            .collect(Collectors.toList());
    /* ПРИМЕР 2 КОНЕЦ */
}

