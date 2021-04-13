package com.example.demo.lagringserver.controller;

import com.example.demo.lagringserver.model.Kunde;
import com.example.demo.lagringserver.repository.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/lagringserver/")
public class Controller {

    @Autowired
    private AppRepo repo;

    @PostMapping("/kunder")
    public void lagre(Kunde innKunde) {
        repo.lagreKunde(innKunde);
    }

    @GetMapping("/kunder")
    public List<Kunde> hent() {
        return repo.hentAlleKunder();
    }

    @DeleteMapping("/kunder")
    public void slett() {
        repo.slettAlleKunder();
    }
}
