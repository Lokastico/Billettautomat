package com.example.demo.lagringserver.controller;

import com.example.demo.lagringserver.model.Kunde;
import com.example.demo.lagringserver.repository.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/lagringserver/")
public class Controller {

    @Autowired
    AppRepo repo;

    @PostMapping("/kunder")
    public void lagre(Kunde kunde) {
        repo.leggInn(kunde);
    }

    @GetMapping("/kunder")
    public ArrayList<Kunde> hent() {
        return repo.hentAlle();
    }

    @DeleteMapping("/kunder")
    public void slett() {
        repo.slettAlle();
    }
}
