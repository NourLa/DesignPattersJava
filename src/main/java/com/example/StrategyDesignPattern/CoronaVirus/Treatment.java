package com.example.StrategyDesignPattern.CoronaVirus;

public class Treatment {
    private VaccinationStrategy vaccinationStrategy;

    public Treatment(VaccinationStrategy vaccinationStrategy){
        this.vaccinationStrategy=vaccinationStrategy;
    }
    public String vaccinateInjection(){
      return  vaccinationStrategy.vaccinateInjection();
    }

    public void setVaccinationStrategy(VaccinationStrategy vaccinationStrategy) {
        this.vaccinationStrategy = vaccinationStrategy;
    }
}
