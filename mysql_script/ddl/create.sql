CREATE TABLE `Customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `DriveLicenece` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardnumber` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `firstname_jp` varchar(45) DEFAULT NULL,
  `lastname_jp` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cardnumber_UNIQUE` (`cardnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `Mynumber` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardnumber` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `firstname_jp` varchar(45) DEFAULT NULL,
  `lastname_jp` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cardnumber_UNIQUE` (`cardnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `MynumberCard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardnumber` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `firstname_jp` varchar(45) DEFAULT NULL,
  `lastname_jp` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cardnumber_UNIQUE` (`cardnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `DriveLiceneceImgInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardNumber` varchar(45) DEFAULT NULL,
  `lightingCondition` varchar(2) DEFAULT NULL,
  `background` varchar(2) DEFAULT NULL,
  `angle` VARCHAR(2) NULL ,
  `path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `path_UNIQUE` (`path`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `MynumberCardImgInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardNumber` varchar(45) DEFAULT NULL,
  `lightingCondition` varchar(2) DEFAULT NULL,
  `background` varchar(2) DEFAULT NULL,
  `angle` VARCHAR(2) NULL,
  `path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `path_UNIQUE` (`path`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `MynumberImgInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardNumber` varchar(45) DEFAULT NULL,
  `lightingCondition` varchar(2) DEFAULT NULL,
  `background` varchar(2) DEFAULT NULL,
  `angle` VARCHAR(2) NULL,
  `frontOrReverseside` varchar(2) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `path_UNIQUE` (`path`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

