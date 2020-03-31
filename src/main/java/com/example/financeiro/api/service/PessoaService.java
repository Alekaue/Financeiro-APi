package com.example.financeiro.api.service;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.financeiro.api.model.Pessoa;
import com.example.financeiro.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa salvar(Pessoa pessoa) {
		pessoa.getContatos().forEach(c -> c.setPessoa(pessoa));
		return pessoaRepository.save(pessoa);
	}
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Pessoa pessoaSalva = buscaPessoaPeloCodigo(codigo);
		
		pessoaSalva.getContatos().clear();
		pessoaSalva.getContatos().addAll(pessoa.getContatos());
		
		pessoaSalva.getContatos().forEach(c -> c.setPessoa(pessoaSalva));
		
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo", "contatos");
		return pessoaRepository.save(pessoaSalva);
	}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaSalva = buscaPessoaPeloCodigo(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}
	
	public Pessoa buscaPessoaPeloCodigo(Long codigo) {
<<<<<<< HEAD
		Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
		
		if (!pessoaSalva.isPresent()) {	
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva.get();
=======
		Pessoa pessoaSalva = pessoaRepository.findOne(codigo);
		
		if (pessoaSalva == null) {	
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
>>>>>>> 5463513f823666261da7fd0e31bd8d6ee6919c4e
	}

}
