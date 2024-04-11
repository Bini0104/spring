package com.ohgiraffers.common;

public interface Account {

    /* 잔액 조회 */
    String getBalance();
    boolean deposit(int money);
    boolean withDraw(int money);
}
