/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.controllers;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.una.CasaSubasta.dto.LoteDTO;
import org.una.CasaSubasta.entities.Lab2_Lote;
import org.una.CasaSubasta.services.ILoteService;
import org.una.CasaSubasta.utils.MapperUtils;

/**
 *
 * @author sergio
 */
@RestController
@RequestMapping("/lote")    
public class LoteController {
    @Autowired
    private ILoteService loteService;
    
    @GetMapping() 
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            Optional<List<Lab2_Lote>> result = loteService.findAll();
            if (result.isPresent()) {
                List<LoteDTO> loteDTO = MapperUtils.DtoListFromEntityList(result.get(), LoteDTO.class);
                return new ResponseEntity<>(loteDTO, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}") 
    public ResponseEntity<?> findById(@PathVariable(value = "id") Long id) {
        try {

            Optional<Lab2_Lote> loteFound = loteService.findById(id);
            if (loteFound.isPresent()) {
                LoteDTO loteDTO = MapperUtils.DtoFromEntity(loteFound.get(), LoteDTO.class);
                return new ResponseEntity<>(loteDTO, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/") 
    @ResponseBody
    public ResponseEntity<?> create(@RequestBody Lab2_Lote lote) {
        try {
            Lab2_Lote loteCreated = loteService.create(lote);
            LoteDTO loteDTO = MapperUtils.DtoFromEntity(loteCreated, LoteDTO.class);
            return new ResponseEntity<>(loteDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
