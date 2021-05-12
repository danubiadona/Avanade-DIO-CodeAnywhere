package com.avanade.dio.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Estoque {
    private Produto produto;
    private Loja loja;
    private int quantidade;
}
