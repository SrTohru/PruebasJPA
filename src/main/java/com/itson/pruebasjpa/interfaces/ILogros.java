package com.itson.pruebasjpa.interfaces;

import com.itson.pruebasjpa_235666.Logros;
import java.util.List;

public interface ILogros {
    
    List <Logros> consultarPorPuntaje(Integer puntaje);
}
