package service;

import entity.Produto;
import org.springframework.stereotype.Service;
import repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public List<Produto> listar(){
        return repository.findAll();
    }
    public Produto buscarPorId(Long id){
        Optional<Produto> produto = repository.findById(id);

        return produto.orElse(null);
    }

    public Produto atualizar (Long id , Produto produtoAtualizado){
        Produto produto = buscarPorId(id);

        if (produto == null){
            return null;
        }

        produto.setNome(produtoAtualizado.getNome());
        produto.setPreco(produtoAtualizado.getPreco());

        return repository.save(produto);

    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
