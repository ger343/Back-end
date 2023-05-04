package com.porfolio.Gerardocornalo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;

    @NotNull
    private String descripcion;
    @NotNull
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String img;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ubicacion;
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String telefono;
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String email;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String presentacion;

    @NotNull
    @Size(min = 1, max = 350, message = "no cumple con la longitud")
    private String acercaDe;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String img, String ubicacion, String telefono, String email, String presentacion, String acercaDe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
        this.presentacion = presentacion;
        this.acercaDe = acercaDe;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
