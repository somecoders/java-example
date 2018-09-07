-- auto Generated on 2018-09-07
-- DROP TABLE IF EXISTS person;
CREATE TABLE person(
	age INT (11) NOT NULL DEFAULT -1 COMMENT 'age',
	name VARCHAR (50) UNIQUE NOT NULL AUTO_INCREMENT COMMENT 'name',
	birth DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'birth',
	PRIMARY KEY (name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'person';
