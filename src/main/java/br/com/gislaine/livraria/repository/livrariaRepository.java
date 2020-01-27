package br.com.gislaine.livraria.repository;

import br.com.gislaine.livraria.model.livrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface livrariaRepository extends CrudRepository<livrariaModel, String> {
}
