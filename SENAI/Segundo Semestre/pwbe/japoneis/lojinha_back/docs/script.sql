DROP DATABASE IF EXISTS lojinha;
CREATE DATABASE lojinha charset=UTF8 COLLATE utf8_general_ci;
USE lojinha;

CREATE TABLE produtos(
    id_produto INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    dia DATE NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    valor FLOAT(10,2) NOT NULL,
    tipo VARCHAR(1)
);

DESCRIBE PRODUTOS;

SHOW TABLES;

LOAD DATA INFILE 'C:/logic/SENAI/Segundo Semestre/pwbe/japoneis/lojinha_back/docs/lancamentos.csv'
INTO TABLE produtos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

SELECT * FROM produtos;