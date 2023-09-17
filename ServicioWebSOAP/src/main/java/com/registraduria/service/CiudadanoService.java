package com.registraduria.service;

import com.registraduria.entity.Ciudadano;

import javax.jws.WebService;

@WebService
public interface CiudadanoService {
    String registrarCiudadano(Ciudadano ciudadano);
    String actualizarInformacion(String id, Ciudadano ciudadano);
}
