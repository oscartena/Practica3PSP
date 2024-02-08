package api.service;

import api.model.CartaFifa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartaFifaServiceImpl implements CartaFifaService{
    @Override
    public List<CartaFifa> findAll() {
        List<CartaFifa> cartas = new ArrayList<>();
        cartas.add(new CartaFifa(1,"Ronaldinho",96,"TOTY"));
        cartas.add(new CartaFifa(2,"Enzo Fernandez",83,"Oro"));
        cartas.add(new CartaFifa(3,"Cristiano Ronaldo",91,"Winter Wildcard"));
        cartas.add(new CartaFifa(4,"Jude Bellingham",89,"Jugador del mes"));
        return cartas;
    }
}
