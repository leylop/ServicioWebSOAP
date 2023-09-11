package com.registraduria.service;

import com.registraduria.entity.Ciudadano;

public interface CiudadanoService {
    String registrarCiudadano(Ciudadano ciudadano);
    String actualizarInformacion(String id, Ciudadano ciudadano);
}
