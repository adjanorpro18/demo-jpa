package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @version 01 demoJpa
 * @author Enyon ADJANOR
 * Classe de la connection à la base de données
 */

public class ConnectionJpa {
    public static void main(String[] args) {

        //Creation de l'instance d'EntityMananger

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");

        EntityManager em = entityManagerFactory.createEntityManager();

        //Mettre en place la transaction
        EntityTransaction trans = em.getTransaction();
        trans.begin();

        // Identifier une region grâce à son identifiant

        Region region = em.find(Region.class, 109434);
        System.out.println(region.getNomRegion());

        //Extraire une nouvelle region
        Region nvRegion = new Region();
        nvRegion.setCodeRegion("109451");
        nvRegion.setNomRegion("Picardie");
        em.persist(nvRegion);
        System.out.println(nvRegion.getCodeRegion() + " : " + nvRegion.getNomRegion());
        trans.commit();

        //Fermer les ressources

        entityManagerFactory.close();   // fermer le factory
        em.close(); // fermer le manager









    }

}
