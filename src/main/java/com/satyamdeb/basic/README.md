# 1. DRY: Don't Repeat Yourself
This principle states that every piece of knowledge must have a single, unambiguous, representation within a system. 
In simple terms, avoid duplication of logic or code. Repeating code makes the system hard to maintain and error-prone. 
If a change is required, you might forget to update all occurrences.

## Why?
1. Easier Maintenance
    - Change once, reflect everywhere
    - Avoid hunting duplicate logic across the codebase
2. Fewer Bugs
    - Duplication leads to missed updates
    - DRY ensures fixes are applied globally
3. Better Readability
    - Cleaner code with less noise
    - Easier to understand intent
4. Single Source of Truth
    - One implementation → consistent behavior everywhere


## Bad Design
```JAVA
class Main {
    public static void main(String[] args) {
        int length1 = 10, width1 = 5;
        int area1 = length1 * width1;
        System.out.println("Area1: " + area1);

        int length2 = 8, width2 = 4;
        int area2 = length2 * width2;
        System.out.println("Area2: " + area2);
    }
}
```
## Good Design
```java
class AreaCalculator {
    public static int calculateArea(int length, int width) {
        return length * width;
    }
}

class Main {
    public static void main(String[] args) {
        int area1 = AreaCalculator.calculateArea(10, 5);
        int area2 = AreaCalculator.calculateArea(8, 4);

        System.out.println("Area1: " + area1);
        System.out.println("Area2: " + area2);
    }
}
```
## When Not to Use the DRY Principle?
1. Premature Abstraction (Coincidental Similarity)
    - Two pieces of code look similar today but may evolve differently. 
    - Forcing a shared abstraction can backfire when requirements diverge.
2. Sacrificing Readability
    - If extracting repeated code makes the code less readable, prefer clarity over DRYness.


# 2. KISS: Keep It Simple, Stupid
This principle states that simplicity should be a key goal in design and unnecessary complexity should be avoided. 
In simple terms, use the simplest possible solution that works. Avoid clever code, avoid overengineering.

## Why?
1. Improved readability
2. Easier debugging
3. Better maintainability
4. Faster development

# 3. YAGNI: You Aren't Gonna Need It
This principle states "**Always implement things when you actually need them, never when you just foresee that you 
need them.**" In simple terms, don't add functionality until it's necessary. Avoid building features that you think you
might need in the future. This principle helps to keep the codebase clean and reduces unnecessary complexity.

## Why?
1. Simplified codebase is easier to understand and maintain
2. Faster development
3. Reduce wastage of efforts in development and later in refactoring/removing the feature if it becomes useless in the 
4. future.