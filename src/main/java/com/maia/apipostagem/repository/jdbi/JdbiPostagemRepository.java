package com.maia.apipostagem.repository.jdbi;

import com.maia.apipostagem.domain.Postagem;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import org.springframework.stereotype.Component;

@UseClasspathSqlLocator
@Component
public interface JdbiPostagemRepository {

    @SqlUpdate
    void create(@BindBean Postagem postagem);

}
