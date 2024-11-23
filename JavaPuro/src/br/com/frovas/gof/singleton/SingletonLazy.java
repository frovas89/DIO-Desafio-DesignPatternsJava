package br.com.frovas.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author frovas
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
