package com.redabensaad.bankout.api;

import java.math.BigDecimal;

public interface AccountService {
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void printStatement();
}