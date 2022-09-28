DROP DATABASE IF EXISTS Patrimonio;
CREATE DATABASE Patrimonio charset=UTF8 COLLATE utf8_general_ci;
USE Patrimonio;

CREATE TABLE itens(
    ni NUMERIC(6) NOT NULL,
    aquisicao TIMESTAMP NOT NULL,
    denominacao VARCHAR(100) NOT NULL,
    valor NUMERIC(10,2),
    img VARCHAR(200) DEFAULT 'default.png',
    CONSTRAINT pk_item primary key (ni)
)

DESCRIBE ITENS;

LOAD DATA INFILE 'D:/logic/SENAI/Segundo Semestre/pwbe/aula10/docs/bd/itens.csv'
INTO TABLE itens
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

SELECT * FROM itens;
