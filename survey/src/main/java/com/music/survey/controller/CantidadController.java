package com.music.survey.controller;

import com.music.survey.Repository.CantidadRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cantidades")
public class CantidadController {

    private final CantidadRepository cantidadRepository;

    public CantidadController(CantidadRepository cantidadRepository) {       ;
        this.cantidadRepository = cantidadRepository;
    }
    @GetMapping("/repeticiones")
    public List<Map<String, Object>> obtenerCantidadRepeticionesPorEstilo() {
        List<Object[]> resultados = cantidadRepository.obtenerCantidadRepeticionesPorEstilo();

        List<Map<String, Object>> respuesta = new ArrayList<>();
        for (Object[] fila : resultados) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", fila[0]);
            item.put("value", fila[1]);
            respuesta.add(item);
        }
        return respuesta;
    }

}
