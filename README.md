Serialization is the concept of representing an object’s state as a byte stream.  The byte stream has all the information about the object.

Deserialization is the byte data type stream is converted in to an object in the memory.

This mechanism is used to persist the object.

Benefits of Serialization :-
    Used for marshaling (traveling the state of an object on the network)
    To persist or save an object’s state
    JVM independent
    Easy to understand and customize


Benefits of Deserialization :-
    Data Persistence
    Communication
    Interoperability
    Cloning Objects
    Versioning and Upgrades


Mechanism of Serialization and Deserialization

Serialization:
    To make an object of a class serializable, the class must implement the Serializable interface. This is a marker interface (it has no methods).
    The ObjectOutputStream class is used to write the object to an output stream, which can be a file, network socket, etc.
    Create  an ObjectOutputStream and pass it the object we want to serialize using the writeObject() method.

Deserialization:
    The ObjectInputStream class is used to read the object from an input stream, like a file or network socket.
    Create an ObjectInputStream and use the readObject() method to read the byte stream and convert it back into an object.
    
