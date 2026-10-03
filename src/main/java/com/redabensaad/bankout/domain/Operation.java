package com.redabensaad.bankout.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Operation(
        OperationType type,
        LocalDateTime date,
        BigDecimal amount,
        BigDecimal balanceAfterOperation
) {}