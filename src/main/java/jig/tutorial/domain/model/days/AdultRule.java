package jig.tutorial.domain.model.days;

import java.time.LocalDate;

import jig.tutorial.domain.model.days.ILendingRule;

/**
 * 大人貸し出し制限
 */
public class AdultRule implements ILendingRule{

    @Override
    public LendingCount lendingLimit(LocalDate lendingDate){
        
        DelayDays lateDays = DelayDays.calcDelayDays(lendingDate);

        if(lateDays.days() <= 3) return new LendingCount(5);
        if(lateDays.days() <= 7) return new LendingCount(0);
        return new LendingCount(0);
    }
}