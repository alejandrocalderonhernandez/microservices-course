package com.debuggeandoideas.companiescrud.repositories;

import com.debuggeandoideas.companiescrud.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findByName(String name);
}
