package CreationalDesignPattern.aSingleton.Example1;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonDesignPattern s = SingletonDesignPattern.getInstance();
        SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

        // Breaking of singleton design pattern -> mechanism by which design fail ie create many objects

        // Reflection
        // cloning
        // serialization
        // multithreading

        // 1. Serialization
        // Objectout. -> WriteObject, readObject

        FileOutputStream f = new FileOutputStream("C:\\Users\\abhis\\OneDrive\\Desktop\\serializableDoc.txt");
        ObjectOutputStream obj = new ObjectOutputStream(f);
        obj.writeObject(s);

        // Deserialize
        FileInputStream f1 = new FileInputStream("C:\\Users\\abhis\\OneDrive\\Desktop\\serializableDoc.txt");
        ObjectInputStream in = new ObjectInputStream(f1);
        SingletonDesignPattern s4 = (SingletonDesignPattern) in.readObject();

        System.out.println(s4.name); // new object s4, differ from the previous one6666
        System.out.println(s4.hashCode());
    }
}
