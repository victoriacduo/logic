drop database if exists solicitacoes;
create database solicitacoes charset=utf8 collate utf8_general_ci;
use solicitacoes;

Create table Funcionarios(
	Cod_Func numeric(4) not null,   
	Nome_Func varchar(50) not null,
	Sexo char(1) not null,            
	Cidade varchar(30),
	Estado varchar(2),
	constraint pk_func_1 primary key(Cod_Func)
);

Create table Departamentos(
	Cod_Depto numeric(4) not null,
	Nome_Depto varchar(50) not null,
	constraint pk_dep_1 primary key(Cod_Depto)
); 

Create table Produtos(
	Cod_Produto numeric(4) not null,  
	Nome_produto varchar(50) not null,
	constraint pk_prod_1 primary key(Cod_Produto)
);

Create table Solicitacoes(
	Num_Sol numeric(4) not null,     
	Data_sol date null,
	Cod_Depto numeric(4) not null,           
	Cod_Func  numeric(4) not null,
	constraint pk_sol_1 primary key(Num_Sol),
	constraint fk_sol_dep_1 Foreign Key(Cod_Depto) references Departamentos(Cod_Depto),
	constraint fk_sol_fun_1 Foreign Key(Cod_Func) references Funcionarios(Cod_Func)
);

drop procedure if exists solicita_um_item();
delimiter //
create procedure solicita_um_item(id int)
begin
	update solicitacoes
	set valor = (select sum(qtde * valor) from itens_solicitacao where num_sol = cod_func)
	where num_sol = cod_func;
end//
delimiter ;

drop procedure if exists solicita_um_item;
delimiter //
create procedure solicita_um_item(n_sol int, depto int, func int, prod int, qtd int, total float)
begin
	insert into Solicitacoes value (n_sol, curdate(), depto, func);
	insert into Itens_Solicitacao value(n_sol, prod, qtd, total);
end//
delimiter ;


Create table Itens_Solicitacao(
	Num_Sol numeric(4) not null,
	Cod_Produto numeric(4) not null,
	Qtde numeric(4) not null,
	Valor numeric(12,2) not null,
	constraint pk_itens_sol primary key(Num_Sol, cod_produto),
	constraint fk_itens_sol_1 foreign Key(Num_Sol) references Solicitacoes(Num_Sol),
	constraint fk_itens_prod_1 Foreign Key(Cod_Produto) references Produtos(Cod_Produto)
);

insert into Departamentos values
(1000,"Vendas"),
(2000,"Compras"),
(2001,"Recursos Humanos");

insert into Funcionarios values
(100,"Jose Pedro","M","Sumare","SP"),
(150,"Ana Pereira","F","Nova Odessa","SP"),
(200,"Maria da Silva","F","Londrina","PR"),
(300,"Joao Antonio","M","Campinas","SP");

insert into Produtos values
(125,"Parafuso"),
(135,"Arruela"),
(145,"Difusor"),
(155,"Paralama");

insert into Solicitacoes values
(1000,"2018/12/01",1000,100),
(1001,"2018/03/13",2001,200),
(1005,"2018/02/10",2001,150),
(1010,"2019/02/22",2000,100),
(1020,"2019/03/23",1000,200),
(1040,"2019/03/24",2001,300);

insert into Itens_Solicitacao values
(1000,125,2,4.36),
(1000,145,1,85),
(1001,135,3,2.12),
(1001,155,2,522),
(1010,145,2,170),
(1010,135,2,1.06),
(1020,125,1,2.18),
(1020,145,2,170),
(1040,155,3,783),
(1005,125,1,50),
(1005,145,3,54.5);

select * from Departamentos;
select * from Funcionarios;
select * from Produtos;
select * from Solicitacoes;
select * from Itens_Solicitacao;
select max(valor) from Itens_Solicitacao;
Select Year(curdate()) as ano;
Select month(curdate()) as mes;
show tables;

select * from solicitacoes
where data_sol >= '2018-02-01'
and data_sol <= '2018-02-28';

SELECT Cod_Func, Nome_Func, sum(Valor) as Soma from (SELECT f.Cod_Func, f.Nome_Func, its.Valor FROM funcionarios f
INNER JOIN solicitacoes s
on s.Cod_Func = f.Cod_Func
INNER JOIN itens_solicitacao its
on s.Num_Sol = its.Num_Sol) as Tabela
GROUP BY Cod_Func
ORDER BY Soma DESC LIMIT 1;

create view vw_visao as
select s.num_sol, s.data_sol, dpt.cod_depto, dpt.nome_depto, fun.cod_func, 
fun.nome_func, its.cod_produto, p.nome_produto, its.qtde, its.valor from solicitacoes s
inner join departamentos dpt
on s.cod_depto = dpt.cod_depto
inner join funcionarios fun
on s.cod_func = fun.cod_func
inner join itens_solicitacao its
on s.num_sol = its.num_sol
inner join Produtos p
on its.cod_produto = p.cod_produto order by s.num_sol desc;
select * from vw_visao;

create view vw_teste as
select dpt.nome_depto, p.nome_produto from departamentos dpt
join solicitacoes s
on dpt.cod_depto = s.cod_depto
join itens_solicitacao its
on s.num_sol = its.num_sol
join Produtos p
on its.cod_produto = p.cod_produto
where nome_produto like "%Parafuso%" or nome_produto="%Difusor%";
select * from vw_teste;