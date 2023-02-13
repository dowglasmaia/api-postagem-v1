INSERT INTO poste(cod_poste,
                  titulo,
                  texto_postagem,
                  autor,
                  data_hora)
VALUES (:codPostagem,
        :titulo,
        :textoPostagem,
        :autor,
        :dataHora);