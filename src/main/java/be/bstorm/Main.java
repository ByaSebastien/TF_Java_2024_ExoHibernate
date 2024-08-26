package be.bstorm;

import be.bstorm.entities.Address;
import be.bstorm.entities.Pilot;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExoJPA");
        EntityManager em = emf.createEntityManager();

        Pilot pilot = new Pilot();
        pilot.setName("Joe");
        pilot.setAddress(new Address("Rue cerisié 18","Fexhe","Liège","4347"));
        pilot.setPhoneNumber("000");
        pilot.setPatent("123456789");

        em.getTransaction().begin();
        em.persist(pilot);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}