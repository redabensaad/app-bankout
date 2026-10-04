![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-4.x-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-green)
![AssertJ](https://img.shields.io/badge/AssertJ-3.x-blue)

# Bankout • Bank Account Kata in Pure Java

Pure Java implementation of the Bank Account Kata created as part of a technical assessment.

The project demonstrates Test-Driven Development (TDD), Domain-Driven Design (DDD), Clean Architecture principles, financial precision using BigDecimal, and pragmatic engineering decisions without framework dependency.

## 🎯 Exercise Context

The kata focuses on implementing a simple banking service API responsible for:

* Depositing money
* Withdrawing money
* Printing account statements

The solution intentionally excludes persistence, user interfaces, and frameworks in order to focus entirely on business logic and software design.

## 📋 Specifications

* Pure Java implementation
* In-memory account management
* No database
* No web layer
* No dependency injection framework
* Explicit business rules
* Fully testable architecture

### User Stories

| ID | Requirement |
|------|------|
| US1 | Deposit money into an account |
| US2 | Withdraw money from an account |
| US3 | Print account statement with transaction history |

## 🏗️ Architecture

The project follows a lightweight layered architecture:

```text
src/main/java/com/redabensaad/bankout
├── domain/
├── api/
├── statement/
```

### Domain Layer

Contains the core business model:

* Account
* Operation
* Amount
* Domain Exceptions

### API Layer

Provides service orchestration and entry points:

* AccountService
* Clock abstraction

### Statement Layer

Responsible for rendering account statements:

* StatementPrinter
* ConsoleStatementPrinter

## ✅ Testing Strategy

Developed using a strict TDD workflow:

```text
Red → Green → Refactor
```

### Test Coverage

* Deposit operations
* Withdrawal operations
* Statement generation
* Edge cases
* Business rule validation
* Insufficient balance scenarios
* Temporal behavior

### Testing Tools

* JUnit 5
* AssertJ

## 🔄 Architectural Evolution

The project evolved through several refactoring phases to better align with DDD principles.

### Main Improvements

* Introduction of the `Amount` Value Object
* Stronger domain encapsulation
* Improved immutability
* Internalized time management through `Clock`
* Removal of temporal vulnerabilities
* Cleaner Given-When-Then test organization

## 🛠️ Technical Stack

* Java 21
* Maven
* JUnit 5
* AssertJ

## 🚀 Running Tests

```bash
mvn test
```

## 📦 Project Status

**Completed • Technical Assessment Project**

This project was developed as part of a coding assessment to demonstrate software craftsmanship practices, including TDD, DDD, clean architecture, financial domain modeling, and maintainable testing strategies.
