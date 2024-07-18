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


The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform. To make a Java object serializable we implement the java.io.Serializable interface. The ObjectOutputStream class contains writeObject() method for serializing an Object.

Mechanism of Serialization and Deserialization


    Serialization:
        The object is converted into a byte stream.
        The byte stream is written to a storage medium or transmitted over a network.

    Deserialization:
        The byte stream is read from the storage medium or received over the network.
        The byte stream is converted back into the original object. 
