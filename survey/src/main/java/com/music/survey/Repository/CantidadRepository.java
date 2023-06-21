package com.music.survey.Repository;

import com.music.survey.Entity.Cantidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
@RepositoryRestResource(path="cantidades", collectionResourceRel = "cantidades")
public interface CantidadRepository extends JpaRepository<Cantidad, Integer> {
    @Query(value = "SELECT l.estilo, CASE WHEN COUNT(r.estilo) < 1  THEN 0 ELSE COUNT(r.estilo) END AS cantidad FROM estilos l LEFT JOIN usuarios_estilos r ON l.estilo = r.estilo GROUP BY l.estilo", nativeQuery = true)
    List<Object[]> obtenerCantidadRepeticionesPorEstilo();
}