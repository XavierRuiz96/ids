package com.examen.ids.controller;

import com.examen.ids.service.ExamenService;
import com.examen.ids.util.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    ExamenService examenService;

    @PostMapping("/apiv1/clientes/add")
    ResponseEntity guardarCliente(@RequestBody Cliente cliente){
        boolean ok=examenService.guardarCliente(cliente);
        if(ok)
            return ResponseEntity.ok().body("guardado");
        else
            return (ResponseEntity) ResponseEntity.noContent();
    }
}
