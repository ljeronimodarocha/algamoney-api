create table pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    ativo BOOL DEFAULT FALSE,
    logadouro VARCHAR(50),
    numero VARCHAR(50),
    complemento VARCHAR(50),
    bairro VARCHAR(50),
    cep VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(50)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO pessoa (nome, ativo, logadouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Lucas Jeronimo', true, 'SP', '125', 'Casa', 'Centro', '15787878', 'Riberão Preto', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logadouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Angelica', true, 'SP', '125', 'Casa', 'Centro', '15787878', 'Riberão Preto', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logadouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('FAved', false, 'RJ', '125', 'Casa da Sogra', 'Favela', '15787878', 'Rio de Janeiro', 'Rio de Janeiro');
INSERT INTO pessoa (nome, ativo, logadouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('kado', false, 'SP', '125', 'Casa', 'Centro', '15787878', 'Riberão Preto', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logadouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('Luck',true, 'SP', '125', 'Casa', 'Centro', '15787878', 'Riberão Preto', 'São Paulo');
INSERT INTO pessoa (nome, ativo, logadouro, numero, complemento, bairro, cep, cidade, estado) VALUES ('NAta', false, 'SP', '125', 'Casa', 'Centro', '15787878', 'Riberão Preto', 'São Paulo');

