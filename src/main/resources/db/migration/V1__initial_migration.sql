CREATE TABLE carts (
                       id BINARY(16) NOT NULL PRIMARY KEY,
                       created_date DATE DEFAULT (CURDATE()) NOT NULL
);
CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL primary key,
    name          VARCHAR(255)   NOT NULL,
    price         DECIMAL(10, 2) NOT NULL
);

create table cart_items
(
    id         bigint auto_increment
        primary key,
    cart_id    binary(16)    not null,
    product_id BIGINT        not null,
    quantity   int default 1 not null,
    constraint cart_items_cart_product_unique
        unique (cart_id, product_id),
    constraint cart_items__carts_id_fk
        foreign key (cart_id) references carts (id)
            on delete cascade,
    constraint cart_items_products_id_fk
        foreign key (product_id) references products (id)
            on delete cascade
);

