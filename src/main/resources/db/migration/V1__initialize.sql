create table students (
    id                bigserial primary key,
    name              varchar(255) not null,
    age               int not null
);

insert into students (name, age)
values
('Quentin Tarantino', 57),
('Bruce Willis', 65),
('Jason Statham', 53),
('Tom Cruise', 58),
('Keanu Charles Reeves', 56),
('Benedict Cumberbatch', 44),
('Sandra Annette Bullock', 56),
('Emily Blunt', 38),
('Daniel Radcliffe', 31),
('Emma Watson', 30);


