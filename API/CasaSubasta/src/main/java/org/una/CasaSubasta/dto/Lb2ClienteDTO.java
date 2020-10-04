/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.CasaSubasta.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author expz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class Lb2ClienteDTO {
    private String nombreCompleto;
    private String nombreUsuario;
    private String password;
    private String correoelectronico;
    private Date fechaRegistro;
    private boolean estado;
}
