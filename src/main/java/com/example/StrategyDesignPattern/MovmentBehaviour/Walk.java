package com.example.StrategyDesignPattern.MovmentBehaviour;

public class Walk implements MoveStrategy {
    @Override
    public int move( int seconds) {
        return 3*seconds;
    }
}
