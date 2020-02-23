package jig.tutorial.domain.model.days;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/** 遅延日数 **/
public class DelayDays {
    
    public long calcDelayDays(LocalDate lendingDate){
        // 貸出期限の計算
        LocalDate ago14days = lendingDate.plus(Period.ofDays(14));

        return ChronoUnit.DAYS.between(LocalDate.now(), ago14days);
    }
}