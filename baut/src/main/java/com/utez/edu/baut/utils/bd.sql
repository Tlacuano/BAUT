create database baut;
use baut;

create table permissions(
                            id_permission bigint primary key auto_increment,
                            permission varchar(200)
);
create table roles(
                      id_rol bigint primary key auto_increment,
                      rol varchar(80),
                      status boolean
);
create table roles_has_permissions(
                                      fk_id_rol bigint,
                                      fk_id_permission bigint,
                                      foreign key(fk_id_rol) references roles(id_rol),
                                      foreign key(fk_id_permission) references permissions(id_permission)
);
create table people(
                       id_person bigint primary key auto_increment,
                       name varchar(200),
                       surname varchar(100),
                       lastname varchar(100),
                       curp varchar(18),
                       tuition varchar(50)
);
create table users(
                      id_user bigint primary key auto_increment,
                      institutional_mail varchar(50),
                      password varchar(255),
                      status boolean,
                      fk_id_person bigint,
                      foreign key (fk_id_person) references people(id_person)
);
create table user_has_roles(
                               fk_id_rol bigint,
                               fk_id_user bigint,
                               foreign key(fk_id_rol) references roles(id_rol),
                               foreign key(fk_id_user) references users(id_user)
);
create table items(
                      id_item bigint primary key auto_increment,
                      image text,
                      name varchar(200),
                      description text,
                      price double,
                      start_availability_date varchar(10),
                      end_availability_date varchar(10),
                      status boolean,
                      fk_id_user_seller bigint,
                      foreign key(fk_id_user_seller) references users(id_user)
);
create table trades(
                       id_trade bigint primary key auto_increment,
                       date varchar(10),
                       fk_id_user_buyer bigint,
                       fk_id_item bigint,
                       foreign key(fk_id_user_buyer) references users(id_user),
                       foreign key(fk_id_item) references items(id_item)
);
create table reviews(
                        id_review bigint primary key auto_increment,
                        date varchar(10),
                        rate int,
                        comment text,
                        fk_id_trade bigint,
                        foreign key(fk_id_trade) references trades(id_trade)
);



--roles
insert into roles(rol, status) values('Administrador', true);
insert into roles(rol, status) values('Vendedor', true);
insert into roles(rol, status) values('Alumno', true);
insert into roles(rol, status) values('Profesor', true);

--un administrador
insert into people(name, surname, lastname, curp, tuition) values('Tlacuano', 'Admin', 'Root', 'AAAA000000AAAAAA00', '000000000');
insert into users(institutional_mail, password, status, fk_id_person) VALUES ('20213tn105@utez.edu.mx','root',true,1);
insert into user_has_roles(fk_id_rol, fk_id_user) values(1,1);

--dos vendedores
insert into people(name, surname, lastname, curp, tuition) values('Jose Emilio', 'Enriquez', 'Torres', 'AAAA000000AAAAAA01', '000000001');
insert into users(institutional_mail, password, status, fk_id_person) VALUES ('vendedor1@utez.edu.mx','vendedor1',true,2);
insert into user_has_roles(fk_id_rol, fk_id_user) values(2,2);

insert into people(name, surname, lastname, curp, tuition) values('Juan', 'Perez', 'Lopez', 'AAAA000000AAAAAA02', '000000002');
insert into users(institutional_mail, password, status, fk_id_person) VALUES ('vendedor2@utez.edu.mx','vendedor2',true,3);
insert into user_has_roles(fk_id_rol, fk_id_user) values(2,3);

--dos alumnos
insert into people(name, surname, lastname, curp, tuition) values('Ramon', 'Perez', 'Lopez', 'AAAA000000AAAAAA03', '000000003');
insert into users(institutional_mail, password, status, fk_id_person) VALUES ('alumno1@utez.edu.mx','alumno1',true,4);
insert into user_has_roles(fk_id_rol, fk_id_user) values(3,4);

insert into people(name, surname, lastname, curp, tuition) values('Araceli', 'Casarrubias', 'de la Cruz', 'AAAA000000AAAAAA04', '000000004');
insert into users(institutional_mail, password, status, fk_id_person) VALUES ('alumno2@utez.edu.mx','alumno2',true,5);
insert into user_has_roles(fk_id_rol, fk_id_user) values(3,5);

--dos profesores
insert into people(name, surname, lastname, curp, tuition) values('Maximiliano', 'Carsi', 'Lopez', 'AAAA000000AAAAAA05', '000000005');
insert into users(institutional_mail, password, status, fk_id_person) VALUES ('max@utez.edu.mx','max',true,6);
insert into user_has_roles(fk_id_rol, fk_id_user) values(4,6);

insert into people(name, surname, lastname, curp, tuition) values('Luis', 'Garcia', 'Lopez', 'AAAA000000AAAAAA06', '000000006');
insert into users(institutional_mail, password, status, fk_id_person) VALUES ('luis@utez.edu.mx','luis',true,7);
insert into user_has_roles(fk_id_rol, fk_id_user) values(4,7);

--productos
insert into items(image, name, description, price, start_availability_date, end_availability_date, status, fk_id_user_seller)
values('https://i5.walmartimages.com.mx/mg/gm/1p/images/product-images/img_large/00088411638515l.jpg?odnHeight=612&odnWidth=612&odnBg=FFFFFF', 'Laptop', 'Laptop HP', 10000, '2023-09-06', '2024-09-06', true, 2);

insert into items(image, name, description, price, start_availability_date, end_availability_date, status, fk_id_user_seller)
values('https://hartplas.com/cdn/shop/products/termo_6.jpg?v=1631833805', 'termo', 'un termo de agua muy bonito', 10000, '2023-09-06', '2024-09-06', true, 3);

insert into items(image, name, description, price, start_availability_date, end_availability_date, status, fk_id_user_seller)
values('https://i5.walmartimages.com.mx/mg/gm/1p/images/product-images/img_large/00750042427101l.jpg?odnHeight=612&odnWidth=612&odnBg=FFFFFF', 'Playera', 'una playera muy bonita', 10000, '2023-09-06', '2024-09-06', true, 2);
