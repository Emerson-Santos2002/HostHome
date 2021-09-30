drop database if exists casa;
create database casa;
use casa;

create table usuario(

id int primary key auto_increment,
login varchar(30) unique,
senha varchar(30) not null,
perfil varchar(10) not null,
nome varchar(40) not null

);

create table casa(

id int primary key auto_increment, 
proprietario int not null,
endereco varchar(255) not null,
quartos int not null,
valor integer not null,
situacao boolean not null

);

create table alugado(

	idCasa int not null,
    idProprietario int not null,
    idLocatario int not null,
    foreign key(idCasa) references casa(id),
    foreign key(idProprietario) references perfil(id),
    foreign key(idLocatario) references perfil(id)
    
);

insert into usuario(login, senha, perfil, nome) values("admin", "senha", "locador", "Emerson");
insert into usuario(login, senha, perfil, nome) values("larissa", "senha", "locador", "larissa");
insert into usuario(login, senha, perfil, nome) values("islan",	"senha", "locatario", "islan");
insert into casa(proprietario, endereco, quartos, valor, situacao) values (1, "jasmim", 2, 350.00, false);

select * from usuario;
select * from casa;

delete from casa where id = 9 and proprietario = 1;

update casa set endereco = "gleba-h", quartos = 3, valor = 300 where id = 6;


