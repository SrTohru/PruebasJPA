/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.pruebasjpa_DAO;

import com.itson.pruebasjpa.interfaces.ILogros;
import com.itson.pruebasjpa_235666.Logros;
import com.itson.pruebasjpa_235666.Videojuego;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class LogrosDAO implements ILogros {

    @Override
    public List<Logros> consultarPorPuntaje(Integer puntaje) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson_PruebasJPA_235666_jar_1.0");
        EntityManager entityManager = managerFactory.createEntityManager();
        TypedQuery<Logros> query = entityManager.createQuery("SELECT v FROM Logros v WHERE v.puntos >= :puntos", Logros.class);
        query.setParameter("puntos", puntaje);
        List<Logros> resultados = query.getResultList();
        entityManager.close();
        return resultados;
    }

}
