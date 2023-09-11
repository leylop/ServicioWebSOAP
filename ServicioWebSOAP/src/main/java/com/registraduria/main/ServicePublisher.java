package com.registraduria.main;

import javax.xml.ws.Endpoint;
import com.registraduria.service.impl.CiudadanoServiceImpl;

public class ServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/ciudadano", new CiudadanoServiceImpl());
        System.out.println("Servicio publicado en http://localhost:8080/ws/ciudadano");
    }
}
