create table jogo(
	id_jogo int(55) primary key auto_increment not null,
	nome varchar(255) not null,
	genero  varchar(255) not null,
    descricao  varchar(255) not null,
	data_compra  varchar(255) not null,
    desenvolvedora  varchar(255) not null,
	plataformas  varchar(255) not null,
    Avaliacao  varchar(255) not null,
   preco double not null,
    estoque int(55) not null
);

create table cliente(
id_cliente int(55) primary key auto_increment not null,
nome varchar(255) not null,
idade varchar(55) not null,
email varchar(255) not null,
telefone varchar(255) not null
);




create table funcionario(
id_usuario int(55) auto_increment primary key not null,
usuario varchar(255) not null,
senha varchar(255) not null
);

create table gerente(
id_gerente int(55) auto_increment primary key not null,
usuario varchar(255) not null,
senha varchar(255) not null
);

create table Administrador(
id_adm int(55) auto_increment primary key not null,
usuario varchar(255) not null,
senha varchar(255) not null
);




INSERT INTO funcionario (usuario,senha)
VALUES ('msilva','m1234');


INSERT INTO Administrador (usuario,senha)
VALUES ('carlos','c1234');

INSERT INTO Gerente (usuario,senha)
VALUES ('jose','j1234');


INSERT INTO jogo (nome, genero, descricao, data_compra, desenvolvedora, plataformas, Avaliacao, preco, estoque)
VALUES ('Super Mario Bros', 'Plataforma', 'Jogo clássico da Nintendo', '2022-01-01', 'Nintendo', 'Nintendo Switch', '4.5/5', 59.99, 100);

INSERT INTO jogo (nome, genero, descricao, data_compra, desenvolvedora, plataformas, Avaliacao, preco, estoque)
VALUES ('God of War Ragnarok', 'Acao', 'Jogo clássico da Sony', '2020-01-01', 'Sony', 'playstation', '5/5', 100.99, 400);


