package com.willian.AlpacaFilmes.infra;

import com.willian.AlpacaFilmes.domain.entities.Programacao;
import com.willian.AlpacaFilmes.infra.repositories.ProgamacaoRepository;
import com.willian.AlpacaFilmes.integrationsTest.testContainers.AbstractIntegrationTest;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class ProgamacaoRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    ProgamacaoRepository progamacaoRepository;

    @DisplayName("Teste do método findTop4ByOrderByIdDesc")
    @Test
    public void testFindTop4ByOrderByIdDesc() {
        // Given / Arrange

        // When / Act
        List<Programacao> result = progamacaoRepository.findTop4ByOrderByIdDesc();

        // Then / Assert
        /* Verificado se retorna 0 pois não existe migration ou dados cadastrados para programação
        sem cadastrar filmes*/
        assertEquals(0, result.size(), () -> "Veirifica se o repositorio está retornando");
    }
}
