package com.registraduria.service.impl;

import com.registraduria.entity.Ciudadano;
import com.registraduria.service.CiudadanoService;
import com.registraduria.util.XmlUtil;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import java.io.File;

@WebService(endpointInterface = "com.registraduria.service.CiudadanoService")
public class CiudadanoServiceImpl implements CiudadanoService {

    @Override
    public String registrarCiudadano(Ciudadano ciudadano) {
        try {
            XmlUtil.guardarComoXml(ciudadano, "ruta/del/archivo/" + ciudadano.getId() + ".xml");
            return "Ciudadano registrado con éxito";
        } catch (JAXBException e) {
            e.printStackTrace();
            return "Error registrando ciudadano";
        }
    }

    @Override
    public String actualizarInformacion(String id, Ciudadano ciudadano) {
        File file = new File("ruta/del/archivo/" + id + ".xml");
        if (file.exists()) {
            try {
                XmlUtil.guardarComoXml(ciudadano, "ruta/del/archivo/" + id + ".xml");
                return "Información actualizada con éxito";
            } catch (JAXBException e) {
                e.printStackTrace();
                return "Error actualizando información";
            }
        } else {
            return "Ciudadano no encontrado";
        }
    }
}
