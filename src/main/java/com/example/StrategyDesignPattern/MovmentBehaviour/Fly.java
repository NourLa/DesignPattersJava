package com.example.StrategyDesignPattern.MovmentBehaviour;

public class Fly implements MoveStrategy {
    @Override
    public int move(int seconds) {
        return 8* seconds;
    }
}
