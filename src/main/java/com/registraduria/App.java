package com.registraduria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.registraduria.service.impl.CiudadanoServiceImpl;

@SpringBootApplication
@RestController
public class App {

    private final CiudadanoServiceImpl servicio = new CiudadanoServiceImpl();

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/ciudadano")
    public String handleGetRequest() {
        // Aquí puedes manejar la solicitud GET
        return "Solicitud GET recibida";
    }

    @PostMapping("/ciudadano")
    public String handlePostRequest(@RequestBody String xmlData) {
        // Aquí manejas la solicitud POST
        return servicio.registrarCiudadano(xmlData);
    }

    @PutMapping("/ciudadano")
    public String handlePutRequest(@RequestBody String client_identifier,String xmlData) {
        // Aquí manejas la solicitud PUT (para actualizar)
        return servicio.actualizarInformacion(client_identifier, xmlData);
    }
}
