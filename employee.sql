CREATE DATABASE `employee_directory`;
USE `employee_directory`;


CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `employee` VALUES 
	(1,'Mantas','Pavardenis','Pavardenis@mail.com'),
	(2,'Martynas','Vardenis','MVardenis@luv2code.com'),
	(3,'Paulius','Petrauskas','PPetrauskas@luv2code.com'),
	(4,'Lukas','Zmogenas','LZmogenas@luv2code.com'),
	(5,'Petras','Lapinskas','Lapinskas@luv2code.com');

