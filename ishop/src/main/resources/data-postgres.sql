INSERT into users (first_name, last_name, email, password)
	VALUES ('Guilherme', 'Barbosa', 'gui@ishop.com', '111');

INSERT into users (first_name, last_name, email, password)
	VALUES ('Hilario', 'Correa', 'hilario@ishop.com', '222');

INSERT into users (first_name, last_name, email, password)
	VALUES ('Tulio', 'Dias', 'tulio@ishop.com', '333');

INSERT into products (name)
	VALUES ('Abajur');

INSERT into products (name)
	VALUES ('Brinquedo');

INSERT into products (name)
	VALUES ('Caneca');

INSERT into user_cart (id_user)
	VALUES (1);

INSERT into user_cart (id_user)
	VALUES (2);

INSERT into user_cart (id_user)
	VALUES (3);

INSERT into cart (id_user_cart, id_product, quantity)
	VALUES (1, 1, 1);

INSERT into cart (id_user_cart, id_product, quantity)
	VALUES (1, 2, 2);

INSERT into cart (id_user_cart, id_product, quantity)
	VALUES (1, 3, 3);