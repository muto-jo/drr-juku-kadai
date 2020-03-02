package jig.tutorial.domain.model.days;

import java.time.LocalDate;

import jig.tutorial.domain.model.days.ILendingRule;

/**
 * 子供貸し出し制限
 */
public class ChildRule implements ILendingRule{

    @Override
    public LendingCount lendingLimit(LocalDate lendingDate){
        DelayDays lateDays = DelayDays.calcDelayDays(lendingDate);

        if(lateDays.days() <= 3) return new LendingCount(7);
        if(lateDays.days() <= 7) return new LendingCount(4);
        return new LendingCount(0);
    }
}