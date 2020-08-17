## Design smells
### What is a design smell?

Design smells are **symptom of poor design** and is often caused by a violation of **good design principles**. This usually means there are structures in the software that suggest **refactoring**.

**Rigidity:**
Software being too difficult to make simple changes too, because it causes a chain reaction amongst its dependent modules.

**Fragility:**
Software often breaks in many places when a single change is made.

**Immobility:**
Design is hard to reuse. Typically, a segment of code could be useful in another system, but the steps to remove the logic and untangle it from the existing code is too much of a trek.

**Viscosity:**
Measurement of how easy it is to add design-preserving code to a system. We consider a code base to be high viscosity if it's easier to add "hacks" than it is to add code that preserves the system's design.

**Opacity:**
The tendency of a module to be difficult to understand.

**Needless complexity:**
Code contains constructs that are NOT currently useful. Occurs when developer is ahead of the requirements.

**Needless repetition:**
Design contains repeated code that could be unified under a single abstraction (like a function).

## Good design
If there's bad design then of course there's good design!

Good software should have *loose coupling* and *high cohesion*. This is to ensure that software entities are:
* Extensible
* Reusable
* Maintainable
* Understandable
* Testable

### Coupling
Coupling is defined as the *interdependence* between componenets or classes. 

High coupling usually occurs when component A relies heavily on the internal workings of component B and vice versa.

**We should aim for a loosely coupled system**, it is impossible to have zero-coupled classes/components because that means they don't interact with each other.

### Cohesion
Cohesion is the degree to which modules of code work together as a *functional unit*.

Highly cohesive modules are MUCH easier to maintain, less frequently changed and have higher reusability.

## In comes: *design principles*
Simply put: design principles are methods of coding that allow us to rewrite *smelly code* into *good code*.

### Example: SOLID
* **S**ingle responibility principle: a class should only have a single responsibility.
* **O**pen-closed principle: software entities should be open for *extension* and closed for *modification*.
* **L**iskov substitution principle: objects in a program should be replacable with instances of their **subtypes** without altering the correctness of that program.
* **I**nterface segregation principle: many client-specific interfaces are better than a single general purpose interface.
* **D**ependency inversion principle: one should depend on *abstractions* and not *concretions*.

### When to use?
The main takeaway is that *design principles help eliminate design smells*. You should not apply design principles when there are no smells. Applying these principles in a uniform fashion leads to needless complexity - which should be avoided!

### Law of Demeter (Principle of least knowledge)
When applying the Law of Demeter (LOD), classes should know about and interact with as few classes as possible.

This leads to **loosely coupled** systems, which is *good design*.

Methods within an object should only invoke methods of:
* The object itself
* The object passed in as a parameter to the method
* Objects instantiated within the method
* Any component objects
* **And not of objects returns by another method**