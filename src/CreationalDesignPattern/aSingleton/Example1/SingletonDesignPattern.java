package CreationalDesignPattern.aSingleton.Example1;

import java.io.Serializable;

public class SingletonDesignPattern implements Serializable {
    String name = "Abhi";

    //static SingletonDesignPattern s = new SingletonDesignPattern(); // Eager initialization
    // Lazy initialization

    static SingletonDesignPattern s = null;

    private SingletonDesignPattern() {
        // DB connection
        // fetching data from properties files
        // premium due of LIC for mellion people fall on same day then sending notification using singelton
        // logger is also singelton
        // Autowiring in spring boot
    }

    synchronized static SingletonDesignPattern getInstance() {
        if(s == null) {
            s = new SingletonDesignPattern();
        }
        return s;
    }

    Object readResolve() {
        return s;
    }
}


