# Technical Choices • Bankout

This document explains the engineering decisions made during the implementation of the Bank Account Kata.

---

$ Pure Java

The objective of the exercise was to focus on business logic and software design rather than infrastructure.

The project intentionally avoids web frameworks, persistence layers and dependency injection containers.

> \> No database<br>
> \> No web layer<br>
> \> No framework dependency<br>
> \> No infrastructure concerns<br>

---

$ Architecture

The application is organized around a lightweight layered architecture separating domain logic, application orchestration and statement generation.

```text
src/main/java/com/redabensaad/bankout
├── domain/
├── api/
└── statement/
```

The goal is to keep business rules independent from presentation and infrastructure concerns.

---

$ Engineering Principles

> \> Test-Driven Development<br>
> \> Financial precision using BigDecimal<br>
> \> Immutability by default<br>
> \> Explicit business exceptions<br>
> \> Dependency inversion through abstractions<br>

Every feature was introduced through a failing test before implementation and refined through iterative refactoring.

---

$ Financial Precision

All monetary values rely on BigDecimal.

Floating-point types were intentionally avoided to prevent rounding issues and preserve deterministic financial calculations.

---

$ Time Management

Time-dependent behavior is isolated through a dedicated Clock abstraction.

This design improves testability and eliminates dependencies on the system clock.

---

$ Deliberately Excluded

The following concerns were intentionally left outside the scope of the exercise.

> \> User interface<br>
> \> Database persistence<br>
> \> REST APIs<br>
> \> Dependency injection frameworks<br>
> \> Repository pattern<br>
> \> Builder pattern<br>

The purpose of the kata is to evaluate design quality and business logic implementation rather than application infrastructure.

---

$ Testing Strategy

Tests validate both domain behavior and application orchestration.

> \> Deposit operations<br>
> \> Withdrawal operations<br>
> \> Statement generation<br>
> \> Amount validation<br>
> \> Balance management<br>
> \> Business rule enforcement<br>

JUnit and AssertJ are used to keep tests expressive and maintainable.

---

$ Future Enhancements

Potential extensions beyond the scope of the exercise.

> \> Thread-safe account operations<br>
> \> Database persistence<br>
> \> REST API exposure<br>
> \> Internationalization<br>
> \> Multi-account support<br>
> \> Event sourcing<br>
