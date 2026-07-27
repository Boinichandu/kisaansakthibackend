package com.example.kisansakthi.service;

import com.example.kisansakthi.model.Subsidy;

import java.util.List;

public interface SubsidyService {

    List<Subsidy> getAllSubsidies();

    Subsidy getSubsidyById(Integer id);

    Subsidy addSubsidy(Subsidy subsidy);

    Subsidy updateSubsidy(Integer id, Subsidy subsidy);

    void deleteSubsidy(Integer id);

}