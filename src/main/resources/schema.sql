create database gestion_annuaire;

create table contact 
(
id INT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
nom VARCHAR(50),
prenom VARCHAR(50)
);

create table type 
(
id INT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
type VARCHAR(50)
);

create table numero 
(
id INT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
tel VARCHAR(10),
id_contact INT (20),
id_type INT (20),
CONSTRAINT fk_ContactNumero FOREIGN KEY (id_contact) REFERENCES contact(id),
CONSTRAINT fk_TypeNumero FOREIGN KEY (id_type) REFERENCES type(id)
);