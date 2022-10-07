DROP DATABASE IF EXISTS estacionamento;
CREATE DATABASE estacionamento charset=UTF8 collate utf8_general_ci;
USE estacionamento;

CREATE TABLE clientes(
    cpf varchar(14) primary key not null unique,
    nome varchar(100) not null,
    telefone varchar(20) not null
);

CREATE TABLE veiculos(
    placa varchar(7) primary key not null unique,
    tipo varchar(5) not null,
    modelo varchar(25) not null,
    cor varchar(50) not null,
    cpf varchar(14) not null,
    foreign key(cpf) references clientes(cpf)
);

CREATE TABLE vagas(
    id_vaga integer not null primary key auto_increment,
    status boolean,
    tipo varchar(10) not null,
    valor_hora float(6,2) not null
);

CREATE TABLE controle (
    cpf varchar(14) not null,
    entrada datetime not null,
    saida datetime,
    placa varchar(7) not null,
    id_vaga integer not null,
    foreign key (cpf) references clientes(cpf),
    foreign key (placa) references veiculos(placa),
    foreign key (id_vaga) references vagas(id_vaga)
);

insert into clientes values('989.724.070-54', 'Adriano Príncipe dos Santos', '(97) 3131-6375'),
('854.636.450-86', 'Free William de Almeida', '(82) 2423-1418'),
('440.868.330-26', 'Naida Navinda Navolta Pereira', '(96) 2584-1747'),
('355.389.880-15', 'Rocambole Simionato', '(55) 3022-4517'),
('793.546.260-76', 'Isacclene Bazante da Silva', '(28) 2414-1116');

insert into veiculos values('CKN2236', 'Carro', 'Hilux', 'Verde', '989.724.070-54'),
('MYP5736', 'Moto', 'PCX', 'Prata', '854.636.450-86'),
('MOG9751', 'Moto', 'Kawasaki', 'Rosa', '440.868.330-26'),
('HJP2420', 'Carro', 'Picape', 'Dourada', '355.389.880-15'),
('MUW8757', 'Carro', 'Towner', 'Laranja', '793.546.260-76');

insert into vagas values(default, 1, 'Carro', 5.00),
(default, 1, 'Moto', 3.50),
(default, 1, 'Moto', 4.00),
(default, 1, 'Idoso', 2.50),
(default, 1, 'Deficiente', 2.00);

insert into controle values('989.724.070-54','2022-04-23 13:34:26','2022-04-23 15:42:31', 'CKN2236', 1),
('854.636.450-86','2022-04-25 16:27:22','2022-04-25 17:20:41', 'MYP5736', 2),
('440.868.330-26','2022-05-03 09:02:39','2022-05-03 12:15:59', 'MOG9751', 3),
('355.389.880-15','2022-06-22 14:51:12','2022-06-22 15:23:11', 'HJP2420', 4),
('793.546.260-76','2022-06-22 14:54:00','2022-06-22 15:25:49', 'MUW8757', 5);

create view vw_completa as
SELECT c.cpf, c.nome, c.telefone, v.placa, v.tipo, v.modelo, v.cor, ct.entrada, ct.saida, ct.id_vaga From clientes c
inner join veiculos v
on c.cpf = v.cpf
join controle ct
on v.placa  = ct.placa;

select * from clientes;
select * from veiculos;
select * from vagas;    
select * from controle;