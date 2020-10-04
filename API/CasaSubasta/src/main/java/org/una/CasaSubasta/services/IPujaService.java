package org.una.CasaSubasta.services;

import java.util.List;
import java.util.Optional;
import org.una.CasaSubasta.entities.Lab2_Puja;

/**
 *
 * @author chris
 */
public interface IPujaService {

    public Optional<List<Lab2_Puja>> findAll();

    public Optional<Lab2_Puja> findById(Long id);
    
    public Lab2_Puja create(Lab2_Puja puja);
}

