package jig.tutorial.domain.model.days;

import java.time.LocalDate;
import jig.tutorial.domain.model.days.DelayDays;
import jig.tutorial.domain.model.days.ILendingRule;

public class AdultRule implements ILendingRule{

    public LendingCount rule(LocalDate lendingDate){
        DelayDays logic = new DelayDays();

        if(logic.calcDelayDays(lendingDate) <= 3) return new LendingCount(5);
        if(logic.calcDelayDays(lendingDate) <= 7) return new LendingCount(0);
        return new LendingCount(0);
    }

    @Override
    public LendingCount lessThree() {
        // TODO Auto-generated method stub
        return new LendingCount(5);
    }

    @Override
    public LendingCount lessSeven() {
        // TODO Auto-generated method stub
        return new LendingCount(0);
    }

    @Override
    public LendingCount other() {
        // TODO Auto-generated method stub
        return new LendingCount(0);
    }

}