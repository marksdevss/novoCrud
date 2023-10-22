create table fornecedores(
id_fornecedor int(55) primary key auto_increment not null,
nome varchar(255) not null,
idade int(55) not null,
email varchar(255) not null,
telefone varchar(255) not null
);

INSERT INTO fornecedores (nome, idade, email, telefone)
VALUES 
('João da Silva', 35, 'joao.silva@email.com', '(11) 1234-5678'),
('Maria Oliveira', 28, 'maria.oliveira@email.com', '(22) 9876-5432'),
('Pedro Santos', 40, 'pedro.santos@email.com', '(33) 5555-5555'),
('Ana Souza', 23, 'ana.souza@email.com', '(44) 7777-7777'),
('Carlos Pereira', 50, 'carlos.pereira@email.com', '(55) 9999-9999'),
('Laura Almeida', 32, 'laura.almeida@email.com', '(66) 1111-1111'),
('José Ferreira', 45, 'jose.ferreira@email.com', '(77) 3333-3333'),
('Fernanda Lima', 29, 'fernanda.lima@email.com', '(88) 2222-2222'),
('Paulo Ribeiro', 38, 'paulo.ribeiro@email.com', '(99) 4444-4444'),
('Beatriz Santos', 26, 'beatriz.santos@email.com', '(00) 6666-6666');


/*funcionario*/
create table funcionario(
id_usuario int(55) auto_increment primary key not null,
usuario varchar(255) not null,
senha varchar(255) not null
);

INSERT INTO funcionario (usuario,senha)
VALUES ('msilva','m1234');


/*gerente*/
create table gerente(
id_gerente int(55) auto_increment primary key not null,
usuario varchar(255) not null,
senha varchar(255) not null
);

INSERT INTO Gerente (usuario,senha)
VALUES ('jose','j1234');


/*administrador*/
create table Administrador(
id_adm int(55) auto_increment primary key not null,
usuario varchar(255) not null,
senha varchar(255) not null
);

INSERT INTO Administrador (usuario,senha)
VALUES ('carlos','c1234');

/*CRIANDO TABELA CATEGORIA*/

create table categorias(
id_categoria int(55) auto_increment primary key not null,
categoria varchar(155) not null,
id_jogo int(10) not null
);

INSERT INTO categorias (categoria, id_jogo)
VALUES 
('Ação', 1),
('Aventura', 2),
('RPG', 3),
('Esportes', 4),
('Estratégia', 5),
('Simulação', 6),
('Corrida', 7),
('Quebra-Cabeça', 8),
('Plataforma', 9),
('FPS', 10);

/*CRIANDO TABELA PLATAFORMA*/

create table plataformas(
id_plataforma int(55) auto_increment primary key not null,
plataforma varchar(55) not null,
id_jogo int(10) not null
);

INSERT INTO plataformas (plataforma, id_jogo)
VALUES 
('PC', 1),
('PlayStation 5', 2),
('Xbox Series X', 3),
('Nintendo Switch', 4),
('PlayStation 4', 5),
('Xbox One', 6),
('Nintendo 3DS', 7),
('iOS', 8),
('Android', 9),
('Mac', 10);






