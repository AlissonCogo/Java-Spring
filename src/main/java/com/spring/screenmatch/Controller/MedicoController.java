package com.spring.screenmatch.Controller;

import com.spring.screenmatch.Medico.DadosCadastrosMedicos;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void CadastrarMedico(@RequestBody DadosCadastrosMedicos dadosMedico){
        System.out.println(dadosMedico);
    }

}
