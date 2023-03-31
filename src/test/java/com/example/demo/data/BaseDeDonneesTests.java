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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {
    @MockBean
    private VoitureRepository voitureRepository ;

    @Test
    void CreateVoiture(){
        Voiture v1 = mock(Voiture.class);
        voitureRepository.save(v1);
        Iterable<Voiture> v = voitureRepository.findAll();

        System.out.println(v);

    }


    @Test
    void uneVoiture(){
        Voiture v1 = Mockito.mock(Voiture.class);
        v1.setId(12);
        v1.setPrix(2);

        System.out.println(v1.getPrix());
        System.out.println(v1);

        voitureRepository.save(v1);
        Iterable<Voiture> v = voitureRepository.findAll();

        System.out.println(v);
        System.out.println(voitureRepository.count());

        // tester les méthodes de l'interface CrudRepository qui permette d'accéder à la base de données: https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
        // save, find, delete...
    }
}
