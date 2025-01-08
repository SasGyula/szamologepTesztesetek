package hu.szamalk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzamologepTest {

    @Test
    void egyEsSzazKozottiErdemeny(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat();
        int eredmeny = szamologep.getEredmeny();
        Assertions.assertTrue((eredmeny <= 100) || (eredmeny > 0), "Az eredmény nagyobb mint száz vagy kisebb mint 0");
    }
    @Test
    void joValaszokDarabszama(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat();
        joValaszok = szamologep.getJoValaszokDb();
        Assertions.assertEquals(3,joValaszokDb(), "");
    }
    @Test
    void egeszSzamosEredmenyOsztaskor(){
        Szamologep szamologep = new Szamologep();
        
    }
}