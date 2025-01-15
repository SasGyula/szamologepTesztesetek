package hu.szamalk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzamologepTest {

    @Test
    void egyEsSzazKozottiErdemenyOsszeadasnal(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat("összeadás");
        int eredmeny = szamologep.getA() + szamologep.getB();
        Assertions.assertTrue((eredmeny <= 100) || (eredmeny > 0), "Az eredmény nagyobb mint száz vagy kisebb mint 0");
    }
    @Test
    void egyEsSzazKozottiErdemenyKivonasnal(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat("kivonás");
        int eredmeny = szamologep.getA() - szamologep.getB();
        Assertions.assertTrue((eredmeny <= 100) || (eredmeny > 0), "Az eredmény nagyobb mint száz vagy kisebb mint 0");
    }
    @Test
    void egyEsSzazKozottiErdemenyOsztásnál(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat("osztás");
        int eredmeny = szamologep.getA() / szamologep.getB();
        Assertions.assertTrue((eredmeny <= 100) || (eredmeny > 0), "Az eredmény nagyobb mint száz vagy kisebb mint 0");
    }
    @Test
    void egyEsSzazKozottiErdemenySzorzasnal(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat("szorzás");
        int eredmeny = szamologep.getA() + szamologep.getB();
        Assertions.assertTrue((eredmeny <= 100) || (eredmeny > 0), "Az eredmény nagyobb mint száz vagy kisebb mint 0");
    }
    @Test
    void joValaszokDarabszama(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat("összeadás");
        joValaszok = szamologep.getJoValaszokDb();
        Assertions.assertEquals(1,joValaszokDb(), "Nem számolja helyesen a jó válaszokat");
    }
    @Test
    void nullavalOsztas(){
        Szamologep szamologep = new Szamologep();
        szamologep.feladat("osztás");
        Assertions.assertFalse(szamologep.getA() == 0 || szamologep.getB() == 0);
    }
}