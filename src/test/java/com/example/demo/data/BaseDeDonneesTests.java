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

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {
    @MockBean
    private VoitureRepository voitureRepository;


    @Test
    void uneVoiture(){
        Voiture v1 = new Voiture("nowaycar",120,3);
        Voiture v4 = new Voiture("nowaycar",120,3);

        Iterable<Voiture> v = voitureRepository.findAll();
        System.out.println(v);

        voitureRepository.save(new Voiture("nowaycar",120));
        voitureRepository.save(v4);
        voitureRepository.save(v1);

        System.out.println("dsfdsfds");

        Iterable<Voiture> v2 = voitureRepository.findAll();

        System.out.println(v2);
        System.out.println(voitureRepository.count());

        // tester les méthodes de l'interface CrudRepository qui permette d'accéder à la base de données: https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
        // save, find, delete...
    }
}
