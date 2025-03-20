create table TB_PRODUCTOS(
id number(10) primary key,
nombre varchar2(100) not null,
tipo varchar2 (25) check (tipo ='ALIMENTACION' 
OR TIPO ='ELECTRONICA' OR TIPO='ROPA')not null,
precio number(5,2)not null,
stock number(5) not null
);

insert into tb_productos values(1,'MANZANA','ALIMENTACION',1.99,100);
insert into tb_productos values(2,'TELEVISION','ELECTRONICA',499.99,15);
insert into tb_productos values(3,'SUDADERA','ROPA',19.99,300);
insert into tb_productos values(4,'NARANJA','ALIMENTACION',2.99,500);
insert into tb_productos values(5,'ORDENADOR','ELECTRONICA',999.99,10);
insert into tb_productos values(6,'LIMON','ALIMENTACION',1.50,800);


select id,nombre,tipo,precio,stock from tb_productos;

SELECT COUNT(TIPO),AVG(PRECIO) FROM TB_PRODUCTOS
GROUP BY TIPO;

SELECT COUNT(TIPO) FROM tb_PRODUCTOS;
