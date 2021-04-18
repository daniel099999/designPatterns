# Design Patterns
Basic design patterns in kotlin / java - with definitions

## Creational Patterns:
- Deal with creation of objects.
- Usually replace class constructor with other mechanism.
- This helps control objects creation to either ensure proper use, or to make object creation easier during usage.

### _Types_
- Encapsulating object creation, limiting type of object tha class can create.
- Self object creation and exposing only an instance.

#### Factory Pattern
- deals with delegating object creation to a static method to ensure proper object creation

#### Builder Pattern
- allows us to delegate object creation to a class that will build the object for you

#### Singleton Pattern
- allows us to ensure that only a single instance of the classes ever created.

#### Dependency injection pattern
- the class requests all other objects it needs instead of creating them itself.

#### Object pool
- similar to singleton, except here a pool of objects is created, and the objects are reused instead of being recreated over and over again, because object creation can be expensive sometimes on resources.

#### Lazy initialization
- delaying the creation of an object or the setting of a variable until the first time it is actually needed

## Structural design patterns
- Help make relationships between objects and entities easier to manage and deal with. Puedes pensar que esta categoría es como mezclar condimentos. Algunos pueden mezclarse tanto que incluso pueden pareceer uno. Otros conservan su sabor pese a que están mezclados.

## _Styles_
- simplify the communication between classes
- allow for the addition of functionality to exist in classes

#### Adapter Pattern
- Adapts the interface of a class into one that a different client expects, sort of like putting puzzle pieces together.

#### Composite pattern
- tree structure of objects where every object has the same interface and objects can easily be reused, instead of recreated

#### Proxy Pattern
- class that acts as a middleman or an interpreter between two or more other classes


