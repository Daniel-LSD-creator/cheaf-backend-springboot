package com.proyecto.proyecto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // Permite la conexion desde Angular
public class AuthController {

    // Endpoint 1: Verificacion de estado de sesion
    @GetMapping("/status")
    public String obtenerEstadoSesion() {
        return "Respuesta de prueba: Servicio de autenticacion activo. Sesion de usuario valida.";
    }

    // Endpoint 2: Perfil de usuario simulado
    @GetMapping("/perfil")
    public String obtenerPerfilPrueba() {
        return "Respuesta de prueba: Usuario 'nou' autenticado correctamente en Cheaf App.";
    }
}