# designPatterns
Basic design patterns in kotlin / java - with definitions


#Creational Patterns:
Deal with creation of objects.
Usually replace class constructor with other mechanism.
This helps control objects creation to either ensure proper use, or to make object creation easier
during usage

#types
#-> Encapsulating object creation, limiting type of object tha class can create.
#-> Self object creation and exposing only an instance.

#Factory Pattern
-> deals with delegating object creation to a static method to ensure proper object creation

#Builder Pattern
-> allows us to delegate object creation to a class that will build the object for you

# Singleton Pattern
-> allows us to ensure that only a single instance of the classes ever created.

#dependency injection pattern
the class requests all other objects it needs instead of creating them itself.

#object pool
similar to singleton, except here a pool of objects is created, and the objects are reused instead of
being recreated over and over again, because object creation can be expensive sometimes on resources

#Lazy initialization
delaying the creation of an object or the setting of a variable until the first time it is actually needed

