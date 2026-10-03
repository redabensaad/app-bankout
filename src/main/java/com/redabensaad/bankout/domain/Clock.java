package com.redabensaad.bankout.domain;

import java.time.LocalDateTime;

public interface Clock {
    LocalDateTime now();
}