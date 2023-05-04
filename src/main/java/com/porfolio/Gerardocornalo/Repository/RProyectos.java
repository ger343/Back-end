
package com.porfolio.Gerardocornalo.Repository;

import com.porfolio.Gerardocornalo.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository <Proyectos, Integer> {
    public Optional<Proyectos> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
   
}
