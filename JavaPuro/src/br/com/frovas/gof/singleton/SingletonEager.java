package br.com.frovas.gof.singleton;

/**
 * Singleton "apressado"
 * @author frovas
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
