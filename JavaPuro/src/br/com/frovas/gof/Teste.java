package br.com.frovas.gof;

import br.com.frovas.gof.facade.Facade;
import br.com.frovas.gof.singleton.SingletonEager;
import br.com.frovas.gof.singleton.SingletonLazy;
import br.com.frovas.gof.singleton.SingletonLazyHolder;
import br.com.frovas.gof.strategy.*;

public class Teste {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton

        System.out.println("Singleton");

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyH = SingletonLazyHolder.getInstance();
        System.out.println(lazyH);
        lazyH = SingletonLazyHolder.getInstance();
        System.out.println(lazyH);

        System.out.println("\n");


        // Testes relacionados ao Design Pattern Strategy

        System.out.println("Strategy");

        Behavior normal = new BehaviorNormal();
        Behavior defensive = new BehaviorDefensive();
        Behavior aggressive = new BehaviorAggressive();

        Robot robot = new Robot();
        robot.setBehavior(normal);

        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();
        robot.move();
        robot.move();

        System.out.println("\n");


        // Testes relacionados ao Design Pattern Facade

        System.out.println("Facade");

        Facade facade = new Facade();
        facade.migrateCustomer("Flávio", "8423412");
    }
}
