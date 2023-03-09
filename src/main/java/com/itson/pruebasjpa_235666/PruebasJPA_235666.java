package com.itson.pruebasjpa_235666;

import com.itson.pruebasjpa_DAO.LogrosDAO;
import com.itson.pruebasjpa_DAO.VideojuegosDAO;
import com.sun.media.jfxmedia.control.VideoDataBuffer;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class PruebasJPA_235666 {

    public static void main(String[] args) {

//        VideojuegosDAO vDAO = new VideojuegosDAO();
//        LogrosDAO lDAO = new LogrosDAO();

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson_PruebasJPA_235666_jar_1.0");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        
        
        
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        
//        CriteriaQuery<Videojuego> criteria = builder.createQuery(Videojuego.class);
//         
//        
//        
//        TypedQuery<Videojuego> query = entityManager.createQuery(criteria);
//        
//        List<Videojuego> juego = query.getResultList();
//        
//        for (Videojuego v: juego) {
//            System.out.println(v);
//        }
//        



 

 

        
        
        
                Jugador j1 = entityManager.find(Jugador.class, 1L);
        
                Videojuego v1 = entityManager.find(Videojuego.class, 1L);
                Videojuego v2 = entityManager.find(Videojuego.class, 2L);
        
                    VideojuegoJugador realacion1 = new VideojuegoJugador(v1, j1, new GregorianCalendar());
                VideojuegoJugador realacion2 = new VideojuegoJugador(v2, j1, new GregorianCalendar());
                
                entityManager.persist(realacion1);
                entityManager.persist(realacion2);
                
                
               //j1.setJugadores(jugadores);
//       System.out.println("------------------");
//        System.out.println("------------------");
//        System.out.println("Consultar por nombre");
//        System.out.println("------------------");
//        System.out.println("------------------");
//
//        List<Videojuego> resultados = vDAO.consultarPorNombre("Minecraft");
//        for (Videojuego v : resultados) {
//            System.out.println("------------------");
//            System.out.println("Id: " + v.getId());
//            System.out.println("Nombre: " + v.getName());
//            System.out.println("Desarrollador: " + v.getDesarrolladoras());
//            System.out.println("Puntaje: " + v.getPuntaje());
//            System.out.println("------------------");
//        }
//
//        System.out.println("------------------");
//        System.out.println("------------------");
//        System.out.println("Consultar por puntaje de logros");
//        System.out.println("------------------");
//        System.out.println("------------------");
//
//        List<Logros> results = lDAO.consultarPorPuntaje(100);
//        for (Logros l : results) {
//            System.out.println("------------------");
//            System.out.println("Id: " + l.getId());
//            System.out.println("Nombre: " + l.getName());
//            System.out.println("Puntos: " + l.getPuntos());
//            System.out.println("Id videojuego: " + l.getVideojuego().getId());
//            System.out.println("------------------");
//        }
//
//        System.out.println("------------------");
//        System.out.println("------------------");
//        System.out.println("Consultar por fecha lanzamiento");
//        System.out.println("------------------");
//        System.out.println("------------------");
//
//        List<Videojuego> results2 = vDAO.consultarPorFechaLanzamiento(new GregorianCalendar(2013, Calendar.JANUARY, 22));
//
//        for (Videojuego v : results2) {
//            System.out.println("------------------");
//            System.out.println("Id: " + v.getId());
//            System.out.println("Nombre: " + v.getName());
//            System.out.println("Desarrollador: " + v.getDesarrolladoras());
//            System.out.println("Puntaje: " + v.getPuntaje());
//            System.out.println("Fecha lanzamiento: " + v.getFechaLanzamiento());
//            System.out.println("------------------");
//        }
        entityManager.getTransaction().commit();

    }
}
