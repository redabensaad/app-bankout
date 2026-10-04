# Technical Choices • Bankout

This document explains the design decisions made during the implementation of the Bank Account Kata.

## 🏗️ Design Choice: Pure Java

The exercise explicitly targets simplicity.

Adding frameworks such as Spring Boot would introduce unnecessary complexity because the project has:

* No persistence layer
* No web layer
* No complex dependency graph
* No infrastructure concerns

Using plain Java demonstrates mastery of core language features and object-oriented design without relying on external frameworks.

## ⚙️ Layered Architecture

```text
src/main/java/com/redabensaad/bankout
├── domain/
│ ├── Account
│ ├── Amount
│ ├── Operation
│ └── Exceptions
├── api/
│ ├── AccountService
│ └── Clock
└── statement/
├── StatementPrinter
└── ConsoleStatementPrinter
```

| Layer | Responsibility |
|---------|---------|
| Domain | Business rules and financial logic |
| API | Application orchestration |
| Statement | Formatting and output concerns |

This separation follows the Single Responsibility Principle and keeps the core domain independent from infrastructure concerns.

## ✅ Engineering Principles

### Test-Driven Development

Every behavior is introduced through a failing test before implementation.

```text
Red → Green → Refactor
```

### Financial Accuracy

All monetary values use:

```java
BigDecimal
```

instead of floating-point types.

This prevents rounding errors and ensures deterministic calculations.

### Immutability

Operations are immutable records.

Once created, a transaction cannot be modified, which guarantees statement consistency and auditability.

### Explicit Domain Exceptions

Business failures are modeled using dedicated exceptions rather than primitive return values.

Example:

```java
InsufficientBalanceException
```

### Dependency Inversion

Rendering logic is exposed through the `StatementPrinter` abstraction, allowing business services to remain independent from output implementations.

## 🚫 Deliberately Excluded

The following concerns were intentionally left out of scope:

* User Interface
* Database Persistence
* REST API
* Dependency Injection Frameworks
* Repository Pattern
* Factory Pattern
* Builder Pattern

These elements would increase complexity without contributing to the objectives of the exercise.

## 🧪 Testing Strategy

### Unit Tests

Validate domain behavior:

* Deposits
* Withdrawals
* Amount validation
* Balance management

### Integration Tests

Validate orchestration and statement generation.

### Assertion Framework

AssertJ is used to improve readability and expressiveness of assertions.

## 🔐 Security Considerations

Dependencies are maintained at current versions to mitigate known vulnerabilities and ensure long-term maintainability.

## 🔮 Future Enhancements

Potential extensions beyond the scope of the kata:

* Thread-safe account operations
* Database persistence
* REST API exposure
* Internationalization
* Multi-account support
* Event sourcing

