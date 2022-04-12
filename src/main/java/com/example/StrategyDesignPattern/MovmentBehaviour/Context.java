package com.example.StrategyDesignPattern.MovmentBehaviour;

public class Context {
    private MoveStrategy moveStrategy;

    public Context(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public int Move(int seconds){
       return moveStrategy.move(seconds);
    }
}
