package jig.tutorial.domain.model.days;

import java.time.LocalDate;

import jig.tutorial.domain.model.days.LendingCount;

/**
 * 貸出制限インターフェース
 */
public interface ILendingRule{
    public LendingCount lendingLimit(LocalDate lendingDate);
}