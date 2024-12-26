package com.dianaglobal.Editora.Nosso.Lar.repository;

import com.dianaglobal.Editora.Nosso.Lar.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}