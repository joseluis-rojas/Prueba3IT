package com.music.survey.Repository;

import com.music.survey.Entity.Grafica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
@RepositoryRestResource(path="grafica", collectionResourceRel = "grafica")
public interface GraficaRepository extends JpaRepository<Grafica, Serializable> {
}
