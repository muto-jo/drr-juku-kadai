package jig.tutorial.domain.model.days;

import jig.tutorial.domain.model.days.ILendingRule;

/**
 * 子供貸し出し制限
 */
public class ChildRule implements ILendingRule{

    @Override
    public LendingCount lessThree() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LendingCount lessSeven() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LendingCount other() {
        // TODO Auto-generated method stub
        return null;
    }

}