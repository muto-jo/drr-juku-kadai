package jig.tutorial.domain.model.member;
import java.time.LocalDate;
import jig.tutorial.domain.model.days.*;
/**
 * 会員種別
 */
public enum MemberType {
    ADULT( new AdultRule() ), /** 大人 */
    CHILD( new ChildRule() ); /** 子供 */

    private ILendingRule rule;

    private MemberType(ILendingRule rule){
        this.rule = rule;
    }

    private LendingCount lendingLimit(LocalDate lendingDate){
        return rule.lendingLimit(lendingDate);
    }
}
