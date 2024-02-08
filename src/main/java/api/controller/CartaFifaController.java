package api.controller;

import api.model.CartaFifa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import api.service.CartaFifaServiceImpl;

import java.util.List;

@RestController
public class CartaFifaController {

    @Autowired
    private CartaFifaServiceImpl cartaFifaService;

    @GetMapping(value = "/cartas")
    public ResponseEntity<List<CartaFifa>> getCartas(){
        List<CartaFifa> cartas = cartaFifaService.findAll();
        return new ResponseEntity<>(cartas, HttpStatus.OK);
    }
}
