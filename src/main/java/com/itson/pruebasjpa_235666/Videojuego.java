package com.itson.pruebasjpa_235666;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "videojuegos")
public class Videojuego implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "desarrolladora", nullable = false, length = 100)
    private String desarrolladoras;

    @Column(name = "puntaje", nullable = false)
    private Integer puntaje;

    @OneToMany(mappedBy = "videojuego")
    private List<Logros> logros;
    
    
    public Videojuego() {
    }

    public Videojuego(String name, String desarrolladoras, Integer puntaje) {
        this.name = name;
        this.desarrolladoras = desarrolladoras;
        this.puntaje = puntaje;
    }

    public Videojuego(Long id, String name, String desarrolladoras, Integer puntaje) {
        this.id = id;
        this.name = name;
        this.desarrolladoras = desarrolladoras;
        this.puntaje = puntaje;
    }

    public Videojuego(Long id, String name, String desarrolladoras, Integer puntaje, List<Logros> logros) {
        this.id = id;
        this.name = name;
        this.desarrolladoras = desarrolladoras;
        this.puntaje = puntaje;
        this.logros = logros;
    }
    
    public List<Logros> getLogros() {
        return logros;
    }

    public void setLogros(List<Logros> logros) {
        this.logros = logros;
    }

    
    
    public String getDesarrolladoras() {
        return desarrolladoras;
    }

    public void setDesarrolladoras(String desarrolladoras) {
        this.desarrolladoras = desarrolladoras;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getPuntos() {
        return puntaje;
    }

    public void setPuntos(Integer puntos) {
        this.puntaje = puntos;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Videojuego)) {
            return false;
        }
        Videojuego other = (Videojuego) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.itson.pruebasjpa_233233.Videojuego[ id=" + id + " ]";
    }

}
