package com.example.StrategyDesignPattern.CoronaVirus;

public class Covid19Treatment  implements  VaccinationStrategy{
    @Override
    public String vaccinateInjection() {
        return "it is covid 19 treatment";
    }
}
