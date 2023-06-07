package com.nc.ecommerce.repositories;

import com.nc.ecommerce.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByEmail(String email);


}