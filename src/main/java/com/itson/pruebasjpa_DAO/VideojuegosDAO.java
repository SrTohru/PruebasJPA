/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.pruebasjpa_DAO;

import com.itson.pruebasjpa.interfaces.IVideojuego;
import com.itson.pruebasjpa_235666.Videojuego;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class VideojuegosDAO implements IVideojuego {

    @Override
    public List<Videojuego> consultarPorNombre(String name) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson_PruebasJPA_235666_jar_1.0");
        EntityManager entityManager = managerFactory.createEntityManager();
       
        try {
        TypedQuery<Videojuego> query = entityManager.createQuery("SELECT v FROM Videojuego v WHERE v.name = :nombre", Videojuego.class);
        query.setParameter("nombre", name);
        List<Videojuego> resultados = query.getResultList();
        return resultados;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Videojuego> consultarPorFechaLanzamiento(GregorianCalendar date) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson_PruebasJPA_235666_jar_1.0");
        EntityManager entityManager = managerFactory.createEntityManager();

        try {
            TypedQuery<Videojuego> consulta = entityManager.createQuery(
                    "SELECT v FROM Videojuego v WHERE v.fechaLanzamiento >= :fecha", Videojuego.class);
            consulta.setParameter("fecha", date);
            return consulta.getResultList();
        } finally {
            entityManager.close();
        }
    }

}
