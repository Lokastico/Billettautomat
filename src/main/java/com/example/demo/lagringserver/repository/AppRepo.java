package com.example.demo.lagringserver.repository;

import com.example.demo.lagringserver.model.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AppRepo {

    @Autowired
    private JdbcTemplate db;

    public void lagreKunde(Kunde innKunde){
        String sql = "INSERT INTO kunde (fnavn, enavn, epost, filmen, antall, nummer) VALUES(?,?,?,?,?,?)";
        db.update(sql, innKunde.getFnavn(),innKunde.getEnavn(),innKunde.getEpost(),innKunde.getFilmen(),innKunde.getAntall(),innKunde.getNummer());
    }

    public List<Kunde> hentAlleKunder(){
        String sql = "SELECT * FROM kunde";
        List<Kunde> alleKunder = db.query(sql, new BeanPropertyRowMapper(Kunde.class));
        return alleKunder;
    }

    public void slettAlleKunder(){
        String sql = "DELETE FROM kunde";
        db.update(sql);
    }


/*
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

 */
}