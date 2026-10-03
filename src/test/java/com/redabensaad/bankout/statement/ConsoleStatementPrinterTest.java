package com.redabensaad.bankout.statement;

import com.redabensaad.bankout.api.AccountService;
import com.redabensaad.bankout.api.AccountServiceImpl;
import com.redabensaad.bankout.domain.Account;
import com.redabensaad.bankout.domain.Clock;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDateTime;

class ConsoleStatementPrinterTest {

    @Test
    void run_statement_display() {
        // Given: a separation line for clean terminal reading
        System.out.println("\n=== com.redabensaad.bankout STATEMENT ===");

        // Given: real production-ready implementations wired together
        Clock realClock = LocalDateTime::now;
        Account account = new Account(realClock);
        StatementPrinter consolePrinter = new com.redabensaad.bankout.statement.ConsoleStatementPrinter();
        AccountService com.redabensaad.bankoutService = new AccountServiceImpl(account, consolePrinter);

        // When: a standard customer flow is executed
        com.redabensaad.bankoutService.deposit(new BigDecimal("1000.00"));
        com.redabensaad.bankoutService.deposit(new BigDecimal("300.50"));
        com.redabensaad.bankoutService.withdraw(new BigDecimal("450.00"));

        // Then: it prints the formatted log tables visually in the console
        com.redabensaad.bankoutService.printStatement();

        System.out.println("=== com.redabensaad.bankout KATA ===\n");
    }
}