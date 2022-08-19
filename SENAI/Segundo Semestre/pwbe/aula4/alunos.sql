drop database if exists alunos;
create database alunos charset=UTF8 collate utf8_general_ci;
use alunos;

create table alunos(
    id_aluno integer not null primary key auto_increment,
    nome_aluno varchar(30) not null,
    nascimento varchar (10) not null,
    sexo varchar(1) not null,
    peso float(5,2) not null
);

create table telefones(
    id_aluno integer not null,
    telefone varchar(15) not null,
    foreign key (id_aluno) references alunos(id_aluno)
);

create table aparelhos(
    id_aparelho integer not null primary key auto_increment,
    aparelho varchar(30) not null
);

create table exercicios(
    id_exercicio integer not null primary key auto_increment,
    descricao_exercicio varchar(150) not null,
    grupo_muscular varchar(10) not null,
    foreign key (id_aparelho) references arapelhos(id_aparelho)
);

create table fichas(
    id_aluno integer not null,
    id_exercicio integer not null,
    dia_semana varchar(15) not null,
    serie varchar(20) not null,
    foreign key (id_aluno) references alunos(id_alunos),
    foreign key (id_aparelho) references exercicios(id_aparelho)
);

describe alunos;
describe telefones;
describe exercicios;
describe aparelhos;
describe fichas;
show tables;