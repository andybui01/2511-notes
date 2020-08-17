## Polymorphism

### Method overloading
Compile time polymorphism: Calls to overloading methods are resolved at compile time.

_Also known as static dispatching_

```java
class Math {
    public void add(int a, int b) {
        // print "inside add with int params!"
    }

    public void add(float a, float b) {
        // print "inside add with float params!"
    }
}
```

We use overloading because we have methods that perform the _same functionality_ BUT with _different parameters_. The compiler is able to identify at _compile time_ which method is needed.

This allows us to do nifty things like this:

```java
Math math = new Math();

math.add(1, 2);
math.add(1.0, 2.0);

/**
* inside add with int params!
* inside add with float params!
*/
```

### Method overriding
_Run time polymorphism:_ JVM decides at runtime which method to use.

_Also known as dynamic dispatching_

```java
class Animal {
    public void eat() {
        // print "Animal eats"
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        // print "Dog eats"
    }
}
```

**How does it work?**

Suppose we have the following code snippet:
```java

Animal d2 = new Dog();
d2.eat();

/**
* Executing the above code gives us:
* 
* Dog eats
*
* but why, when d2 is an Animal!!!
*/
```

Turns out JVM is pretty smart! And at runtime it knows that we are upcasting a _Dog_ to an _Animal reference variable_. This allows it to call the `eat()` method within `class Dog`!

More wordy answer: the _Animal reference variable_ points to a `Dog` object in the _heap_, and so at runtime it calls the `eat()` method of whatever object is stored in the heap, which the reference points to.

## What about static method polymorphism?
Recap: `static` methods are methods that are binded to the class and not the object. Which allows you to do things like the following...
```java
class Math {
    public static int add(int a, int b) {
        return a + b;
    }
}

// You're calling the add() method from
// the Math class not an object!!!
Math.add(1,2);
```

### the juice
In short: you can still _overload_ using static methods. But you will be **unable** to override static methods. Why?

Remember how at runtime, for overriding, JVM decides what method to use based on the object in the heap? With static methods, the method is bounded to the class and not the object, so JVM won't be able to call the overiding method because it doesn't exist in the object, in the heap!