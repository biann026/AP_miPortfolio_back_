package com.portfoliobp.pbp.Security.Repository;

import com.portfoliobp.pbp.Security.Entity.Rol;
import com.portfoliobp.pbp.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
