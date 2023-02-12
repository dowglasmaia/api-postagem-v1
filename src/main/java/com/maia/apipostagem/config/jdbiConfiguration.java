package com.maia.apipostagem.config;

import com.maia.apipostagem.repository.jdbi.JdbiPostagemRepository;
import com.maia.apipostagem.services.PostagemService;
import com.maia.apipostagem.services.impl.JdbiPostagemServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.spi.JdbiPlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@Slf4j
public class jdbiConfiguration {
    @Bean
    public Jdbi jdbi(DataSource ds, List<JdbiPlugin> jdbiPlugins, List<RowMapper<?>> rowMappers) {
        TransactionAwareDataSourceProxy proxy = new TransactionAwareDataSourceProxy(ds);
        Jdbi jdbi = Jdbi.create(proxy);

        // Register all available plugins
        log.info("[I27] Installing plugins... ({} found)", jdbiPlugins.size());
        jdbiPlugins.forEach(plugin -> jdbi.installPlugin(plugin));

        // Register all available rowMappers
        log.info("[I31] Installing rowMappers... ({} found)", rowMappers.size());
        rowMappers.forEach(mapper -> jdbi.registerRowMapper(mapper));

        return jdbi;
    }

    @Bean
    public JdbiPlugin sqlObjectPlugin() {
        return new SqlObjectPlugin();
    }

    @Bean
    public JdbiPostagemRepository jdbiPostagemRepository(Jdbi jdbi) {
        return jdbi.onDemand(JdbiPostagemRepository.class);

    }
    @Bean
    public JdbiPostagemServiceImpl postagemService() {
        return new JdbiPostagemServiceImpl();
    }
}
