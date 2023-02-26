package com.healthcare.medicurepolicy.repository;

import com.healthcare.medicurepolicy.model.MedicurePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface MediRepository extends JpaRepository<MedicurePolicy, Integer> {

}
