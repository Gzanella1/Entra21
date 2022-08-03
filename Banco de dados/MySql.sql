	/*busca por genero*/
	select i.* from item i 
	inner join genero_item gi on gi.id_item  = i.id 
	inner join genero g on g.id = gi.id_genero 
	where g.nome ='Ação';
	
	select * from item i 
	inner join dvd d on d.id_item = i.id;
	
	select i.* from item i 
	inner join genero_item gi on gi.id_item  = i.id;
	/* inner join junção interna de tabelas onde  todos os registro  tem coisas em comum  */
	/* left join junção de tabelas= todos os registro da esquerda */
	/* rigth join junção de tabelas= todos os registro da direita */
	
	create table franquia(
	id bigint not null primary key auto_increment,
	nome varchar(100) not null
	);
	
	alter table item add column id_franquia bigint;
	alter table item add foreign key (id_franquia) references franquia(id);
	

	insert into item (titulo, valor_venda, valor_locacao)
	values('Shreck 2', 43.7, 8.0);
	
	insert into dvd  (diretor , duracao , ano_lancamento ,id_item  )values ('Andrew A', '1:32' , 2004,7);
	insert into genero_item (id_genero, id_item)values (5,7);
	insert into franquia (nome) values ('Shreck');
	
	
	update item set id_franquia = 1 
	/*onde o titulo like=parecido com 'Shreck '*/
	where titulo like 'Shreck%';	
	/*onde o titulo like=parecido com 'Shreck '*/
	/*Shreck%- se ele começa com Shreck*/
	/*%Shreck- se ele termina com Shreck*/
	/*%Shreck%- se ele contem com Shreck*/

	select f.nome, count(i.valor_venda)	
	from item i 
	join dvd d on d.id_item =i.id 
	left join franquia f on f.id = i.id_franquia
	group by f.nome;

	
	select * from item i 
	where id_franquia is null;
	
	select d.* from dvd d 
	inner join item i on i.id =d.id_item 
	where i.id_franquia is null;
	
	/*ano mais recente*/
	select max(l.ano_publicacao) from livro l;

	/*Buscan da tabela livro */
	select l.autor , l.qtde_paginas * from livro l 
	/*aonde o id da tabela item for igual ao id do livro */
	inner join item i on i.id = l.id_item 
	order by l.ano_publicacao desc limit 1;


	/*select sum(i.valor_venda)/count(id) from item i;*/
	select avg(i.valor_venda) from item;


	select g.nome, count(i.id) from item i 
	inner join genero_item gi on gi.id_item =i.id 
	inner join genero g on g.id =gi.id_genero 
	group by g.nome 
	order by  2 desc ;








	select * from genero_item gi  ;
	select * from genero g  ;
	select * from livro l ;
	select * from dvd d ;
	select * from item i ;
	select * from franquia ;	
	









