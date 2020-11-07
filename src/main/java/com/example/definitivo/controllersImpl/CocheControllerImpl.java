package com.example.definitivo.controllersImpl;

import com.example.definitivo.controllers.CocheController;
import com.example.definitivo.entities.Coche;
import com.example.definitivo.services.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CocheControllerImpl implements CocheController {

    @Autowired
    CocheService cocheService;

    // http://localhost:8080/coches (GET)
    @RequestMapping(value = "/coches", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Coche> getCoches() {
        return cocheService.findAllCoches();
    }

    // http://localhost:8080/coches/1 (GET)
    @GetMapping("/coche")
    @Override
    public Optional<Coche> getCocheById(@RequestParam(value = "id") Integer id) {
        return cocheService.findCocheById(id);
    }

    // http://localhost:8080/cochesByConcesionario/1 (GET)
    @GetMapping("/cochesByConcesionario")
    @Override
    public List<Coche> getCocheByIdConcesionario(@RequestParam(value = "id") Integer id, @RequestParam(value = "orderBy") String orderBy) {
        return cocheService.findCocheByIdConcesionario(id, orderBy);
    }

    // http://localhost:8080/coches/add (POST)
    @RequestMapping(value = "/coches/add", method = RequestMethod.POST, produces = "application/json")
    @Override
    public Coche addCoche(Coche cocheNew) {
         return cocheService.saveCoche(cocheNew);
    }

    @GetMapping("/deleteCoche")
    @Override
    public String deleteCoche(@RequestParam(value = "id") Integer id) {
        return cocheService.deleteCoche(id);
    }

    @PostMapping("/matricularCoche")
    public String matricularCoche(@RequestParam(value = "id") Integer id, @RequestParam(value = "matricula") String matricula) {
        return cocheService.matricularCoche(id, matricula);
    }
    @PostMapping("/venderCoche")
    public String venderCoche(@RequestParam(value = "id") Integer id, @RequestParam(value = "precioVenta") Float precioVenta) {
        return cocheService.venderCoche(id, precioVenta);
    }

    // http://localhost:8080/test (GET)
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    @Override
    public String test() {
        return "¡Funciona!";
    }
}
