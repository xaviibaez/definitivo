package com.example.definitivo.controllersImpl;

import com.example.definitivo.controllers.CocheController;
import com.example.definitivo.entities.Coche;
import com.example.definitivo.services.CocheService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CocheControllerImpl implements CocheController {
    @Autowired
    CocheService cocheService;

    @Override
    public List<Coche> getCoches() {
        return null;
    }

    @Override
    public Optional<Coche> getCocheById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Coche addCoche(Coche cocheNew) {
        return null;
    }

    @Override
    public String deleteCoche(Integer id) {
        return null;
    }

    @Override
    public String updateCoche(Coche cocheUpdated) {
        return null;
    }

    @Override
    public String test() {
        return null;
    }
}