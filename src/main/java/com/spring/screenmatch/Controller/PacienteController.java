package com.spring.screenmatch.Controller;

import com.spring.screenmatch.Paciente.CadastroDadosPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @PostMapping
    public void CadastrarPaciente(@RequestBody CadastroDadosPaciente dadosPaciente) {
        System.out.println(dadosPaciente);
    }
}
