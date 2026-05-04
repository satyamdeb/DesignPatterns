# Single Responsibility Principle (SRP)

A class should have **only one reason to change**, meaning it should have **one clearly defined responsibility**.

## Benefits of SRP
1. **High Maintainability**
   - Changes are isolated to one class, reducing unintended side effects.
2. **Better Testability**
   - Smaller, focused classes are easy to unit test with minimal mocking.
3. **Low Coupling**
   - Separation of responsibilities reduces dependencies between components.
4. **Improved Readability**
   - Code is easier to understand due to clear, single-purpose classes.
5. **Safer Refactoring & Scalability**
   - Independent components can evolve or extend without breaking others.

### SRP improves maintainability, testability, and decoupling, making systems easier to scale and modify safely.


## Example

### Bad Design
```JAVA
class UserService {
    void saveUser(User user) {
        // save to DB
    }

    void sendWelcomeEmail(User user) {
        // email logic
    }
}
```
#### Problems:
 - DB change → class changes
 - Email logic change → same class changes
 - Mixed responsibilities → harder to test




### Good Design
```java
class UserService {
    void saveUser(User user) {
        // save to DB
    }
}

class EmailService {
    void sendWelcomeEmail(User user) {
        // email logic
    }
}
```

#### Now:
 - Each class has one responsibility
 - Changes are isolated
 - Easier mocking in tests