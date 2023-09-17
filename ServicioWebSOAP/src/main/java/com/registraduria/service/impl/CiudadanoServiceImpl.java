package com.registraduria.service.impl;

import com.registraduria.entity.Ciudadano;
import com.registraduria.service.CiudadanoService;
import com.registraduria.util.XmlUtil;
import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import java.io.File;

@WebService(endpointInterface = "com.registraduria.service.CiudadanoService")
public class CiudadanoServiceImpl implements CiudadanoService {

    private static final String OUTPUT_DIR = "./output/";

    @Override
    public String registrarCiudadano(Ciudadano ciudadano) {
        try {
            XmlUtil.guardarComoXml(ciudadano, OUTPUT_DIR + ciudadano.getNumDocumentoIdentidad() + ".xml");
            return "Ciudadano registrado con éxito";
        } catch (JAXBException e) {
            e.printStackTrace();
            return "Error registrando ciudadano";
        }
    }

    @Override
    public String actualizarInformacion(String id, Ciudadano ciudadano) {
        File file = new File(OUTPUT_DIR + id + ".xml");
        if (file.exists()) {
            try {
                XmlUtil.guardarComoXml(ciudadano, OUTPUT_DIR + id + ".xml");
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
