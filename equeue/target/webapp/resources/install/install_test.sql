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