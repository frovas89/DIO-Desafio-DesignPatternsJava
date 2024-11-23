package br.com.frovas.gof.strategy;

public class BehaviorAggressive implements Behavior {


    @Override
    public void move() {
        System.out.println("Movendo-se agressivamente...");
    }
}
