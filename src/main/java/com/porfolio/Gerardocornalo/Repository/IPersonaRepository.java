
package com.porfolio.Gerardocornalo.Repository;

import com.porfolio.Gerardocornalo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
