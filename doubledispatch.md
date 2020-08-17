## Double dispatching - wtf?

Please read my notes on polymorphism or this won't make sense.

Check this code snippet and what happens when I run it:

```java
class Vet {
    public void feed(Dog dog) {
        // print "feed a dog"
    }

    public void feed(Labrador lab) {
        // print "feed a lab"
    }
}

class Dog {
    // Dog stuff
}

class Labrador extends Dog {
    // Lab stuff
}

Vet vet = new vet();

Dog teddy = new Dog();
Dog puffy = new Labrador();

vet.feed(teddy);
vet.feed(puffy);

/**
* This prints:
* feed a dog - this makes sense
* feed a dog - this doesn't make sense!
*/
```

But why? Aren't you passing in puffy the `labrador` and not puffy the `dog`?

Well yes, but no.

Remember how in `polymorphism.md` we discussed how overloading was done at _compile time_ and overriding was done at _run time_? It plays a huge role in how the code will execute when we combine overloading with overriding!

**Overloading** methods are dealt at compile time, so when the compiler interprets `vet.feed(puffy)` JVM has not had a chance to do it's magic and say "Hey! puffy is a Labrador and not a Dog!". That is to say: at compile time, puffy is still a `Dog` and so the method that will be called is `feed(Dog dog)`.

Shit.

### The solution

We can jig the code around so that the `Dog`s have to ask Vets to be fed!

```java
class Dog {
    // Dog stuff
    public void ask(Vet vet) {
        vet.feed(this);
    }
}

class Labrador extends Dog {
    // Lab stuff
    @Override
    public void ask(Vet vet) {
        vet.feed(this);
    }
}

Vet vet = new vet();

Dog teddy = new Dog();
Dog puffy = new Labrador();


teddy.ask(vet);
puffy.ask(vet);

/**
* This prints:
* feed a dog - this makes sense
* feed a lab - this ALSO makes sense
*/
```

**Why this works:**

Through _run time polymorphism/method overriding_, the call each `Dog` makes to `ask()` is resolved by the JVM with their correct types (teddy to `Dog.ask()` and puffy to `Labrador.ask()`).

Within, the `Dog` objects, each `Dog` will then be able to get the `Vet` to feed them by calling `Vet(this)`. `this` will have already been resolved to the correct type during compile time, allowing the `Vet` to feed both teddy and puffy.