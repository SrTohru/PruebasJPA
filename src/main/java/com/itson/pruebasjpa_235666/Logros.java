package com.itson.pruebasjpa_235666;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Logros")
public class Logros implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "puntos", nullable = false)
    private Integer puntos;

    @ManyToOne
    @JoinColumn(name = "idVideojuego", nullable = false)
    private Videojuego videojuego;
    
    
    public Logros() {
    }

    public Logros(String name, Integer puntos, Videojuego videojuego) {
        this.name = name;
        this.puntos = puntos;
        this.videojuego = videojuego;
    }

    public Logros(Long id, String name, Integer puntos, Videojuego videojuego) {
        this.id = id;
        this.name = name;
        this.puntos = puntos;
        this.videojuego = videojuego;
    }

    
    
    public Videojuego getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego videojuego) {
        this.videojuego = videojuego;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    
    
    
}
