DROP TABLE IF EXISTS users CASCADE;
CREATE TABLE users
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
    first_name character varying(20) NOT NULL,
    last_name varchar(20) NOT NULL,
    email text NOT NULL,
    password varchar(12) NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
    name text NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS user_cart CASCADE;
CREATE TABLE user_cart
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
	id_user integer NOT NULL ,
    PRIMARY KEY (id),
	CONSTRAINT "fk_cartUser" FOREIGN KEY (id_user)
        REFERENCES users(id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
        NOT VALID
);

DROP TABLE IF EXISTS cart;
CREATE TABLE cart
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
	id_user_cart integer NOT NULL ,
	id_product integer,
    quantity integer,
    PRIMARY KEY (id),
	CONSTRAINT "fk_cartUser" FOREIGN KEY (id_user_cart)
        REFERENCES user_cart(id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
        NOT VALID,
    CONSTRAINT "fk_cartProduct" FOREIGN KEY (id_product)
        REFERENCES products(id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
        NOT VALID
);