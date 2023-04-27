
package com.porfolio.Gerardocornalo.Security.Repository;

import com.porfolio.Gerardocornalo.Security.Entity.Rol;
import com.porfolio.Gerardocornalo.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
