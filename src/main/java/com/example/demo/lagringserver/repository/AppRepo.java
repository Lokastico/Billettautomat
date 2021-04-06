package com.example.demo.lagringserver.repository;

import com.example.demo.lagringserver.model.Kunde;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class AppRepo {
    private final ArrayList<Kunde> lagredeBilletter = new ArrayList<>();

    public void leggInn(Kunde kunde) {
        lagredeBilletter.add(kunde);
    }

    public ArrayList<Kunde> hentAlle() {
        return lagredeBilletter;
    }

    public void slettAlle() {
        lagredeBilletter.clear();
    }
}