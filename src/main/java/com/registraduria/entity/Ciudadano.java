package com.registraduria.entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ciudadano {

    private String idCiudadano;
    private String tipoDocumentoIdentidad;
    private String numDocumentoIdentidad;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String operador;
    private String fechaNacimiento;
    private String estadoCivil;
    private boolean personaFallecida;

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(String idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public boolean isPersonaFallecida() {
        return personaFallecida;
    }

    public void setPersonaFallecida(boolean personaFallecida) {
        this.personaFallecida = personaFallecida;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNumDocumentoIdentidad() {
        return numDocumentoIdentidad;
    }

    public void setNumDocumentoIdentidad(String numDocumentoIdentidad) {
        this.numDocumentoIdentidad = numDocumentoIdentidad;
    }

    public String getTipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    public void setTipoDocumentoIdentidad(String tipoDocumentoIdentidad) {
        this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
    }
    

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // ... más campos y métodos según sea necesario
}
