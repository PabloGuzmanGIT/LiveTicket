package com.isil.Parcial1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, String>{
}
