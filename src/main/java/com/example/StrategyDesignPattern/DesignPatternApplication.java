package com.example.StrategyDesignPattern;

import com.example.FactoryDesignPattern.Notification;
import com.example.FactoryDesignPattern.NotificationFactory;
import com.example.StrategyDesignPattern.CoronaVirus.Covid19Treatment;
import com.example.StrategyDesignPattern.CoronaVirus.SarsTreatment;
import com.example.StrategyDesignPattern.CoronaVirus.Treatment;
import com.example.StrategyDesignPattern.MovmentBehaviour.Context;
import com.example.StrategyDesignPattern.MovmentBehaviour.Fly;
import com.example.StrategyDesignPattern.MovmentBehaviour.TunnelUnder;
import com.example.StrategyDesignPattern.MovmentBehaviour.Walk;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        /*Testing Design Pattern Strategy*/

        /*Execute CoronaVirus Exemple */
        Treatment covidTreatment = new Treatment(new Covid19Treatment());
        System.out.println(covidTreatment.vaccinateInjection());
        Treatment sarsTreatment = new Treatment(new SarsTreatment());
        System.out.println( sarsTreatment.vaccinateInjection());

        /*Execute MovementBehaviour Exemple */
        Context walk = new Context(new Walk());
        System.out.println("unit walk it can cover"+ walk.Move(1));
        Context fly = new Context(new Fly());
        System.out.println("unit fly it can cover"+fly.Move(1));
        Context tunnelUnder = new Context(new TunnelUnder());
        System.out.println("unit tunnels under it can cover"+tunnelUnder.Move(1));


        /*Testing Design Pattern Factory*/
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }

}
