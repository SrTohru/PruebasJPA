package com.itson.pruebasjpa.interfaces;

import com.itson.pruebasjpa_235666.Videojuego;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.List;

public interface IVideojuego {
    
    List <Videojuego> consultarPorNombre(String name);
    List <Videojuego> consultarPorFechaLanzamiento(GregorianCalendar date);
}
