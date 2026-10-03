package com.redabensaad.bankout.statement;

import com.redabensaad.bankout.domain.Operation;
import java.util.List;

public interface StatementPrinter {
    void print(List<Operation> operations);
}