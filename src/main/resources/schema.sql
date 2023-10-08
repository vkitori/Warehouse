CREATE TABLE PRODUCT(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR,
	description VARCHAR,
	available INT,
	created_at DATE
);

INSERT INTO PRODUCT (NAME, DESCRIPTION, AVAILABLE, CREATED_AT)
VALUES ('test honey', 'sweet', 5, null);