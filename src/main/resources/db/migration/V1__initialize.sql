create table students
(
    id   bigserial primary key,
    name varchar(255) not null,
    age  int          not null
);

insert into students (name, age)
values ('Quentin Tarantino', 57),
       ('Bruce Willis', 65),
       ('Jason Statham', 53),
       ('Tom Cruise', 58),
       ('Keanu Charles Reeves', 56),
       ('Benedict Cumberbatch', 44),
       ('Sandra Annette Bullock', 56),
       ('Emily Blunt', 38),
       ('Daniel Radcliffe', 31),
       ('Emma Watson', 30);

create table roles
(
    id   bigserial primary key,
    name varchar(255)
);

create table authorities
(
    id   bigserial primary key,
    name varchar(255)
);

create table roles_authorities
(
    role_id      bigint not null,
    authority_id bigint not null,
    foreign key (role_id) references roles (id),
    foreign key (authority_id) references authorities (id)
);

create table users
(
    id       bigserial primary key,
    username varchar(255),
    password varchar(255)
);

create table users_roles
(
    user_id bigint not null,
    role_id bigint not null,
    foreign key (user_id) references users (id),
    foreign key (role_id) references roles (id)
);

insert into roles (name)
values ('ADMIN'),
       ('ENTRANT'),
       ('STUDENT'),
       ('TEACHER'),
       ('RECTOR');

insert into authorities (name)
values ('Common'),
       ('Admin'),
       ('Entrant'),
       ('Student'),
       ('Teacher'),
       ('Rector');


insert into users (username, password)
values ('admin', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
       ('entrant', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
       ('student', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
       ('teacher', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
       ('rector', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
       ('combo', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i');

insert into users_roles (user_id, role_id)
values (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5),
       (6, 2),
       (6, 3);

insert into roles_authorities (role_id, authority_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (1, 5),
       (1, 6),
       (2, 1),
       (2, 3),
       (3, 1),
       (3, 4),
       (4, 1),
       (4, 3),
       (4, 4),
       (4, 5),
       (5, 1),
       (5, 3),
       (5, 4),
       (5, 5),
       (5, 6);

