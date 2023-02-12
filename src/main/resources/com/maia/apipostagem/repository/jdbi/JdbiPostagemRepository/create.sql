INSERT INTO poste
(cod_poste,
 autor,
 data_hora,
 texto_postagem,
 titulo)
VALUES (:id,
        :titulo,
        :descricao,
        :dataCriacao,
        :autor);