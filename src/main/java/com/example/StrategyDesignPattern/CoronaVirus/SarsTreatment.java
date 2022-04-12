package com.example.StrategyDesignPattern.CoronaVirus;

public class SarsTreatment implements VaccinationStrategy {
    @Override
    public String vaccinateInjection() {
        return "it is Sars treatment";
    }
}
