package com.itson.pruebasjpa_235666;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Jugador")
public class Jugador implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pseudonimo", nullable = false, length = 100)
    private String pseudonimo;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    private Sexo sexo;
    
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento", unique = true ,nullable = false, length = 100)
    private Calendar fechaNacimiento;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idDireccion", nullable = false)
    private Direccion direccion;
    
    public Jugador() {
    }

    public Jugador(String pseudonimo, Sexo sexo, Calendar fechaNacimiento, Direccion direccion) {
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Jugador(Long id, String pseudonimo, Sexo sexo, Calendar fechaNacimiento, Direccion direccion) {
        this.id = id;
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    

    
}
