package com.proyecto.proyecto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ofertas")
@CrossOrigin(origins = "*") // Permite la conexión desde Angular
public class OfertaController {

    // Endpoint 1: Lista general de platillos rescatados
    @GetMapping("/lista")
    public String obtenerListaOfertas() {
        return "Respuesta de prueba: Platillos disponibles hoy [Flan Uruguayo ($59), Cacik ($35), Jajek ($62), Kabse ($47), Arado ($120)]";
    }

    // Endpoint 2: Detalle de promociones
    @GetMapping("/destacadas")
    public String obtenerOfertasDestacadas() {
        return "Respuesta de prueba: 5 platillos rescatados con descuento mayor al 50%.";
    }
}