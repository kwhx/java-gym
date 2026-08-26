```text
[ ] I can define a class with appropriate instance fields.
[ ] I can create objects using new and understand what that operation does conceptually.
[ ] I can distinguish a class (a blueprint/type) from an object (a runtime instance of that blueprint).
[ ] I can define and directly access instance fields on an object.
[ ] I can distinguish instance variables (fields) from local variables, including their different default-value and initialization rules.
[ ] I understand what a reference variable is, and that it is not the same thing as the object it refers to.
[ ] I can create multiple independent objects from the same class and keep their state straight without confusing them.
[ ] I can trace what happens when one reference variable is assigned to another (aliasing) versus when a new object is created.
[ ] I can reason correctly about object identity (==) versus objects that merely share identical field values.
[ ] I understand aliasing: multiple references to a single object, and that mutation through any one of them is visible through all of them.
[ ] I can define and call instance methods, including ones with no parameters, ones with parameters, and ones with return values.
[ ] I can distinguish a method that mutates object state from one that computes and returns a value without storing it.
[ ] I can trace object state changes across a sequence of method calls on the same object.
[ ] I understand null as a reference that refers to no object, and can reason about the consequences of trying to use one, without needing exception-handling mechanics.
[ ] I understand object reachability, and can distinguish an object becoming eligible for garbage collection from it actually being reclaimed at a guaranteed moment.
[ ] I have an accurate, appropriately careful practical mental model of stack frames (for method invocations, local variables, and parameters) and the heap (for objects and their field state), without overclaiming JVM implementation guarantees.
[ ] I can trace, without running the code, how many stack frames are active at a given point in execution and what each one conceptually contains.
[ ] I can trace, without running the code, how many objects and how many references exist at a given point, and which references point to which objects.
[ ] I understand why a parameter with the same name as a field shadows that field inside a method, and I deliberately avoid that naming collision given that this curriculum does not yet use this.
[ ] I can distinguish "reassigning a reference variable" from "mutating the object it refers to," and correctly predict which one is visible to other references and which one is not.
[ ] I can pass an object reference as a method argument and correctly reason about which effects on it persist after the method returns.
[ ] I can model a simple real-world or abstract entity as a class, correctly deciding what belongs as stored state (a field) versus what belongs as computed behavior (a method).
[ ] I can design and reason about two or more objects that interact with each other through method calls, including a single method call that affects the state of more than one object.
[ ] I can debug object-oriented code that compiles but behaves incorrectly due to reference confusion, aliasing, shadowing, wrong-object selection, or state that was computed but never actually stored.
```