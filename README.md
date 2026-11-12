![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-4.x-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-green)
![AssertJ](https://img.shields.io/badge/AssertJ-3.x-blue)

# Bankout

Pure Java implementation of the Bank Account Kata focused on software craftsmanship, domain modeling and test-driven development.

> \> [Live Preview](https://redabensaad.github.io/bankout)

---

$ Context

Bankout was developed as part of a technical assessment based on the Bank Account Kata.

The project intentionally avoids frameworks, persistence layers and user interfaces in order to focus exclusively on business logic, domain modeling and code quality.

---

$ What Was Built

> \> Deposit operations<br>
> \> Withdrawal operations<br>
> \> Account statement generation<br>
> \> In-memory account management<br>
> \> Financial calculations using BigDecimal<br>
> \> Business rule validation<br>
> \> Domain-specific exceptions<br>
> \> Statement printing layer<br>
> \> Clock abstraction for time control<br>
> \> Fully testable architecture<br>

---

$ Technical Stack

> \> Java 21<br>
> \> Maven 4<br>
> \> JUnit 5<br>
> \> AssertJ<br>

---

$ Architecture

The project follows a lightweight layered architecture separating domain logic, service orchestration and statement generation.

Business behavior is encapsulated within the domain layer while application services coordinate operations and statement rendering.

The design emphasizes immutability, explicit business rules and framework independence.

---

$ Design Decisions

The implementation evolved through multiple refactoring phases driven by TDD.

Particular attention was given to financial precision, temporal consistency and domain encapsulation through the introduction of dedicated value objects and a clock abstraction.

Additional technical details and rationale are documented in the `technical_choices.md` file.

---

$ Project Status

> \> Completed technical assessment<br>
> \> Live Preview available<br>
> \> Test-Driven Development approach<br>
> \> Framework-independent implementation<br>
> \> Maintained as a software craftsmanship reference project<br>

---

$ Notes

This project showcases pragmatic application of TDD, DDD concepts, clean architecture principles and maintainable testing practices within a small banking domain.

It was designed to demonstrate engineering decisions rather than infrastructure, frameworks or deployment concerns.

---

$ Preview

![Bankout](shot/bankout.png)

---

$ Built

✓ Feb 2024
