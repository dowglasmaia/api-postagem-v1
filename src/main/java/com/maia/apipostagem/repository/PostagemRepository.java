package com.maia.apipostagem.repository;

import com.maia.apipostagem.domain.Postagem;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.springframework.stereotype.Repository;

@Repository
@UseClasspathSqlLocator
public interface PostagemRepository {

    @SqlUpdate
    void insert(@BindBean Postagem postagem);

}
