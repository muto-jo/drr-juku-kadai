package jig.tutorial.domain.model.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 蔵書の貸出ステータス
 */
public enum BookState {
    在庫中,
    貸出中_期限内,
    貸出中_期限切れ;
}