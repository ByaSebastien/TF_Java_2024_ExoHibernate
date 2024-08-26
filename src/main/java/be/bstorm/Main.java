package be.bstorm;

import be.bstorm.entities.Address;
import be.bstorm.entities.Pilot;
import be.bstorm.repositories.PilotRepository;
import be.bstorm.repositories.PilotRepositoryImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        PilotRepository pilotRepository = new PilotRepositoryImpl();

        Pilot pilot = new Pilot();
        pilot.setName("Joe");
        pilot.setAddress(new Address("Rue cerisié 18","Fexhe","Liège","4347"));
        pilot.setPhoneNumber("000");
        pilot.setPatent("123456789");

        pilotRepository.save(pilot);

    }
}