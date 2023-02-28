package com.itson.pruebasjpa_235666;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PruebasJPA_235666 {

    public static void main(String[] args) {
        
        Videojuego videojuego = new Videojuego("KOF", "Netmarble", 8);
        Logros logro1 = new Logros("3 Perfects al Hilo", 100, videojuego);
        Logros logro2 = new Logros("Waterdrop sin valde agua", 6969, videojuego);
        
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson_PruebasJPA_235666_jar_1.0");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(videojuego);
        entityManager.persist(logro1);
        entityManager.persist(logro2);
        
//        Long idVideojueego = 2L;
//        Videojuego v = entityManager.find(Videojuego.class, idVideojueego);
//
//        if (v != null) {
//            v.setName("asdjjoadsjioas 3");
//            
//            entityManager.persist(v);
//        }else{
//            System.out.println("No se encontro");
//        }

//        Videojuego videojuego = new Videojuego();
//        videojuego.setName("Minecraft 2");
//        videojuego.setRating(100);
    //    entityManager.persist(videojuego);
        entityManager.getTransaction().commit();

    }
}
