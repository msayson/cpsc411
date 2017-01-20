# cpsc411
### UBC CPSC 411: Introduction to Compiler Construction

##### ae: trivial arithmetic expression language.

Supported expressions: Num, Add, Sub

```java
/**
 * Arithmetic expressions
 */
public abstract class AE {
    // Returns the value produced by evaluating the expression
    public abstract Value interp();
}
```

##### abe: trivial arithmetic/boolean expression language

Supported expressions: Num, Add, Sub, True, False, If

```java
/**
 * Arithmetic and boolean expressions
 */
public abstract class ABE {
    // Returns the value produced by evaluating the expression
    public abstract Value interp();
    // Returns the type of the expression
    public abstract Type typeOf();
}
```

##### abevisitor: abe modified to use the visitor pattern for interpreting and type checking

Supported expressions: Num, Add, Sub, True, False, If

```java
/**
 * Arithmetic and boolean expressions
 */
public abstract class ABE {
    // Returns the value produced by evaluating the expression
    public abstract Value interp();
    // Returns the type of the expression
    public abstract Type typeOf();
    // Returns the result of running the expression through a given visitor
    public abstract <T> T accept(Visitor<T> visitor);
}
```

#### Disclaimer

These expression languages were written for educational purposes as part of an undergraduate course on compiler construction, and are not intended for general use.

As such, they are extremely simple, build on one another, and at times, conform to unusual practises for compatibility with in-class hand-in requirements.
