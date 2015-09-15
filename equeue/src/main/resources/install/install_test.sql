DROP TABLE IF EXISTS `users`;
CREATE TABLE  `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `token` varchar(255),
  `surname` varchar(255),
  `name` varchar(255),
  `father_name` varchar(255),
  `user_role` bigint(20) DEFAULT NULL,
  `ufilial` bigint(20) DEFAULT NULL,
  `upodr` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO users (id, login, password, user_role,ufilial,upodr) VALUES
(1, 'test','098f6bcd4621d373cade4e832627b4f6', 1, 1, 1);

DROP TABLE IF EXISTS `filial`;
CREATE TABLE  `filial` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kod` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255),
  `coment` varchar(255),
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO filial (id, kod, name, address, coment) VALUES
(1, 'kod_filial_test','name_filial_test', 'address_filial_test', 'coment_filial_test');

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE  `user_role` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,  
`authority` varchar(255) NOT NULL,
`name` varchar(255) NOT NULL, 
PRIMARY KEY (`id`),
UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user_role (`id`,`authority`,`name`)
VALUES(null,'test1','Test_name_users_role');

DROP TABLE IF EXISTS `devices`;
CREATE TABLE  `devices` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL,
  `podrazdel` bigint(20) DEFAULT NULL,
  `deviceType` bigint(20) DEFAULT NULL,	
  `state` bool DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO devices (`id`,`code`,`podrazdel`,`deviceType`,`state`)
VALUES(1,'dev1',1,1,true);