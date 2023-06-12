package com.portfoliobp.pbp.Repository;

import com.portfoliobp.pbp.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    Optional<Proyectos> findByNombreP(String nombre);
    public boolean existsByNombreP(String nombre);
}