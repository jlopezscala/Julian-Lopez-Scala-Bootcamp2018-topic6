CREATE TABLE `User` (
	`id` INT NOT NULL,
	`username` varchar(45) NOT NULL AUTO_INCREMENT,
	`password` varchar(45) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Cart` (
	`id` INT NOT NULL,
	`subtotal` FLOAT NOT NULL DEFAULT '0.0',
	PRIMARY KEY (`id`)
);

CREATE TABLE `Product` (
	`id` INT NOT NULL,
	`name` varchar(45) NOT NULL,
	`price` FLOAT NOT NULL DEFAULT '0.0',
	PRIMARY KEY (`id`)
);

