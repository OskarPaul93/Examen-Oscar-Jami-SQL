package com.krakdev.fitzone.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krakdev.fitzone.entidades.Socio;
import com.krakdev.fitzone.services.ServicioSocio;

@RestController
@RequestMapping("/socios")
public class SocioController {

    private final ServicioSocio servicioSocio;

    public SocioController(ServicioSocio servicioSocio) {
        this.servicioSocio = servicioSocio;
    }

    @PostMapping
    public ResponseEntity<Socio> crear(@RequestBody Socio socio) {
        Socio socioCreado = servicioSocio.crear(socio);
        return ResponseEntity.status(HttpStatus.CREATED).body(socioCreado);
    }

    @GetMapping
    public ResponseEntity<List<Socio>> listar() {
        return ResponseEntity.ok(servicioSocio.listar());
    }

    @GetMapping("/estado")
    public ResponseEntity<List<Socio>> buscarPorEstado(
            @RequestParam boolean activo) {
        return ResponseEntity.ok(servicioSocio.buscarPorEstado(activo));
    }
}

