package com.avanade.dio.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Loja {
    private int codigo;
    private String nome;
    private boolean inativo;
    
}
