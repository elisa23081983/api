
package br.belval.api.repository;
 
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.belval.api.model.Produto;
 
@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
 
	List<Produto> findByNomeContainingOrDescricaoContaining(String texo1, String texto2);


}

