package com.example.kisansakthi.repository;

import com.example.kisansakthi.model.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpertRepository extends JpaRepository<Expert, Integer> {

    // Search by District
    List<Expert> findByDistrict(String district);

    // Search by Mandal
    List<Expert> findByMandal(String mandal);

    // Search by District and Mandal
    List<Expert> findByDistrictAndMandal(String district, String mandal);

    // Search by Specialization
    List<Expert> findBySpecialization(String specialization);
}