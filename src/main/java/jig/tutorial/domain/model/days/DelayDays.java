package jig.tutorial.domain.model.days;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/** 
 * 遅延日数 
 */
public class DelayDays {
// 名前のつけられた式といえど、
// 値を返すものとする
    private long days;
    
    private DelayDays(long days){
        this.days = days;
    }

    public static DelayDays calcDelayDays(LocalDate lendingDate){
        // 貸出期限の計算
        LocalDate ago14days = new CalcLendingLimit().execute(lendingDate); 

        return new DelayDays(ChronoUnit.DAYS.between(LocalDate.now(), ago14days));
    }

    public long days(){
        return days;
    }
}