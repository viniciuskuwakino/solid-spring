package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.services.AbrigoService;
import br.com.alura.services.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
