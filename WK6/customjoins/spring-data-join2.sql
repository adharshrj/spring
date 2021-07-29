USE `cj`;
CREATE TABLE IF NOT EXISTS `department` (
  `id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `name` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `description` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;CREATE DATABASE `cj` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

INSERT INTO `department` (`id`, `name`, `description`) VALUES
	(1, 'FD', 'Frontend Development'),
	(2, 'BD', 'Backend Development'),
	(3, 'FS', 'FullStack Development'),
	(4, 'HR', 'Human Resources');

CREATE TABLE IF NOT EXISTS `employee` (
  `id` int unsigned COLLATE utf8mb4_unicode_ci NOT NULL AUTO_INCREMENT,
  `name` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `dept_id` int unsigned COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `employee` (`id`, `name`, `email`, `address`, `dept_id`) VALUES
	(1, 'Adharsh', 'adharsh@gmail.com', NULL, 3),
	(2, 'Ajith', 'ajith@gmail.com', NULL, 2),
	(3, 'Tony', 'tony@gmail.com', NULL, 1);

INSERT INTO `employee` (`id`, `name`, `email`, `address`, `dept_id`) VALUES
    (4, 'Dhoni', 'Dhoni@gmail.com', NULL, 4);