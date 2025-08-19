package br.com.leonardo.forumhub.controllers;

import br.com.leonardo.forumhub.domain.topico.AtualizacaoDadosTopico;
import br.com.leonardo.forumhub.domain.topico.CadastroDadosTopico;
import br.com.leonardo.forumhub.domain.topico.DetalhamentoDadosTopico;
import br.com.leonardo.forumhub.domain.topico.ListagemDadosTopico;
import br.com.leonardo.forumhub.services.TopicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoService service;

    @PostMapping
    @Transactional
    public ResponseEntity<DetalhamentoDadosTopico> cadastrar(@RequestBody @Valid CadastroDadosTopico dados, UriComponentsBuilder uriBuilder) {

        var topico = service.cadastrar(dados);
        var uri = uriBuilder.path("/topicos/${id}").buildAndExpand(topico.id()).toUri();

        return ResponseEntity.created(uri).body(topico);
    }

    @GetMapping
    public ResponseEntity<Page<ListagemDadosTopico>> listar(@PageableDefault(size = 10, sort = {"dataCriacao"}) Pageable paginacao) {
        var topicos = service.listar(paginacao);
        return ResponseEntity.ok(topicos);

    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalhamentoDadosTopico> detalhar(@PathVariable Long id) {
        var topico = service.detalhar(id);
        return ResponseEntity.ok(topico);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DetalhamentoDadosTopico> atualizar(@RequestBody @Valid AtualizacaoDadosTopico dados, @PathVariable Long id) {
        var topicoAtualizado = service.atualizar(dados, id);
        return ResponseEntity.ok(topicoAtualizado);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
