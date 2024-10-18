package com.spring.screenmatch.Paciente;

import com.spring.screenmatch.Endereco.DadosEndereco;

public record CadastroDadosPaciente(String nome,
                                    String email,
                                    String telefone,
                                    String cpf,
                                    DadosEndereco endereco) {
}
