package jig.tutorial.domain.model.book;

import java.time.LocalDate;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import jig.tutorial.domain.model.days.CalcLendingLimit;

/**
 * ステータス遷移ルール
 */
public class StateTransitions {
    Map<BookState, Set<BookState>> allowed;

    {
        allowed = new HashMap<>();

        allowed.put(BookState.在庫中, EnumSet.of(BookState.貸出中_期限内));
        allowed.put(BookState.貸出中_期限内, EnumSet.of(BookState.貸出中_期限切れ, BookState.在庫中));
        allowed.put(BookState.貸出中_期限切れ, EnumSet.of(BookState.在庫中));

    }

    boolean canTransit(BookState from, BookState to){
        Set<BookState> allowedStates = allowed.get(from);
        return allowedStates.contains(to);
    }

    BookState lendingLimitTransition(LocalDate lendingDate){
        if (new CalcLendingLimit().execute(lendingDate).isAfter(LocalDate.now())) return BookState.貸出中_期限切れ;
        
        return BookState.貸出中_期限内;
    }
}