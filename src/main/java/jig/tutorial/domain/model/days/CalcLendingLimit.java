package jig.tutorial.domain.model.days;

import java.time.LocalDate;
import java.time.Period;

/**
 * 貸出期限の計算
 */
public class CalcLendingLimit {
    public LocalDate execute(LocalDate lendingDate){
        return lendingDate.plus(Period.ofDays(14));
    }
}