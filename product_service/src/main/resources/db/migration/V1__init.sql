create table if not exists products
(
    id
    bigserial,
    title
    varchar
(
    255
), price int, primary key
(
    id
));
INSERT INTO products (title, price)
VALUES ('bread', 40),
       ('Milk', 60),
       ('Tea', 53),
       ('coffee', 140),
       ('carrot', 40),
       ('potato', 44),
       ('orange', 90),
       ('banana', 87),
       ('kiwi', 133),
       ('chocolate', 73),
       ('juice', 100),
       ('apple', 82),
       ('mango', 170),
       ('beer', 60);