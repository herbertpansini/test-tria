CREATE TABLE deposito (
	id BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	descricao VARCHAR(255) NULL,
	local VARCHAR(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO deposito (nome, descricao, local) VALUES ('Depósito de Bebidas', NULL, 'SJC');


