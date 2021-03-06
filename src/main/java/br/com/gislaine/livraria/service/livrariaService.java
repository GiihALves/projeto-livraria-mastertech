package br.com.gislaine.livraria.service;

import br.com.gislaine.livraria.model.livrariaModel;
import br.com.gislaine.livraria.repository.livrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class livrariaService {

    @Autowired
    private livrariaRepository repository;

    public livrariaModel cadastrarLivro(livrariaModel livro){
        return repository.save(livro);
    }
}
