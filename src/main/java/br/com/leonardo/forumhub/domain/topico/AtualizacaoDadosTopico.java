package br.com.leonardo.forumhub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record AtualizacaoDadosTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem,
        String idAutor,
        String idCurso) {
}
