package com.example.demo.data;

import org.hibernate.annotations.Entity;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;

import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;

import static org.mockito.Mockito.*;

@SpringBootTest
public class BaseDeDonneesTests {
    @MockBean
    private VoitureRepository voitureRepository ;
    @MockBean
    private Voiture vMB;

    @Test
    void CreateVoiture(){
        voitureRepository.save(this.vMB);
        Iterable<Voiture> v = voitureRepository.findAll();

        System.out.println(v);

        doNothing().when(vMB).setPrix(2);
        doNothing().when(vMB).setId(1);
        when(vMB.getId()).thenReturn(1);
    }


    @Test
    void uneVoiture(){
        Voiture v1 = new Voiture("yes",1,1);
        v1.setId(12);
        v1.setPrix(2);

        System.out.println(v1.getPrix());
        System.out.println(v1);

        voitureRepository.save(v1);
        Iterable<Voiture> v = voitureRepository.findAll();

        System.out.println(v);
        System.out.println(voitureRepository.count());

    }
}
