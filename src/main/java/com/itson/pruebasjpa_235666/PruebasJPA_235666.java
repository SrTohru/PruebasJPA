package com.itson.pruebasjpa_235666;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PruebasJPA_235666 {

    public static void main(String[] args) {
        
       // Videojuego videojuego = new Videojuego("Minecraft", "Mojan", 72);
        //Logros logro1 = new Logros("Waterdrop", 100, videojuego);
        //Logros logro2 = new Logros(" sin valde agua", 6969, videojuego);
        
        
        Jugador jugador = new Jugador("SrTohru",
                Sexo.HOMBRE,
                new GregorianCalendar(2003,Calendar.DECEMBER, 07),
                new Direccion("Calkini", "2022", "Espigas"));
        
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson_PruebasJPA_235666_jar_1.0");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(jugador);
//        Logros logro = entityManager.find(Logros.class, (long) 1);
//        
//        if(logro != null){
//            entityManager.remove(logro);
//        }else{
//            System.out.println("No se encontro dicho logro");
//        }
        
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
