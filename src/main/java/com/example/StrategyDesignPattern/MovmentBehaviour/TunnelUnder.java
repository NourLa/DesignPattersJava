package com.example.StrategyDesignPattern.MovmentBehaviour;

public class TunnelUnder implements MoveStrategy {
    @Override
    public int move(int seconds) {
        return 5*seconds;
    }
}
