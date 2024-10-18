package com.spring.screenmatch.Medico;

import com.spring.screenmatch.Endereco.DadosEndereco;

public record DadosCadastrosMedicos(String nome,
                                    String email,
                                    String crm,
                                    Especialidade especialidade,
                                    DadosEndereco endereco){

}
