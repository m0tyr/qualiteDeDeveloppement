package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest extends Voiture {
    @Test
    void creerVoiture(){
        Voiture voiTest = new Voiture("porsche",12.0,1);
        Assert.isTrue(voiTest.getMarque()=="porsche");
        Assert.isTrue(voiTest.getId()==1);
        voiTest.setPrix(250);
        Assert.isTrue(voiTest.getPrix() == 250);
    }
}