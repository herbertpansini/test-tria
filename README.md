# Tria Software

**Teste Java**


# Passos
**Leia com atenção todo esse README:**
1. Faça um fork desse repositório, para sua conta pessoal.
2. Temos o seguinte cenário, com essas entidades:
* Equipamento (id, código, nome, preço, modelo);
* Depósito (id, nome, descrição, local)
E, sabendo-se que 1 depósito possui N equipamentos, e que 1 equipamento pertence somente a 1 depósito.

3. Altere esse README.rd, e inclua abaixo os comandos SQL para criação das tabelas, respeitando o relacionamento entre elas.

 **SQL:**
CREATE TABLE deposito (
	id BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	descricao VARCHAR(255) NULL,
	local VARCHAR(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE equipamento (
	id BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	codigo VARCHAR(20) NOT NULL,
	nome VARCHAR(50) NOT NULL,
	preco DECIMAL(9, 2) NOT NULL,
	modelo VARCHAR(20) NOT NULL,
	id_deposito BIGINT(20) NOT NULL,
	FOREIGN KEY (id_deposito) REFERENCES deposito(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

4. Crie uma Api rest, com os seguintes endpoints:
* Um endpoint para salvar um equipamento, considerando o estoque de ID = 1 e local = "SJC";
* Um endpoint para trazer todos os equipamentos.
* Um endpoint para trazer todos os equipamentos de "SJC".
* Crie o banco em memória, para teste.
**Obs:** Utilize a estrutura de pastas, anotações, camadas de abstração, nomenclatura(inglês ou português), testes unitários(se tiver conhecimento) que você está acostumado.

5. Altere esse README.rd para incluir o comando Maven para gerarmos o pacote e rodarmos a aplicação:
 **MVN:**
$ mvn package
$ mvn clean install -U -DskipTests

6. Altere esse README.rd, adicionando os comandos pedidos:
No nosso servidor onde fazemos o deploy, temos a imagem do nosso projeto, que se chama “asset-manage” e possui a TAG “0.01”. Execute os comandos Docker para listar as imagens, e depois o comando para executar essa imagem como container. Adicione os parâmetros para desanexar do comando e para sempre reiniciar.
 **Docker:**
$ docker images
$ docker run -it asset-manage:0.01 /bin/bash

7. Altere esse README.rd, adicionando os comandos pedidos:
Execute o comando Docker para listar todos os containers, inclusive os parados, e logo após inicie o container com o ID = bba606a95392.
 **Docker:**
 $ docker ps -a
 $ docker start bba606a95392
 
 8. Responda as seguintes perguntas aqui mesmo nesse README:
* Fale sobre 2 design patterns que você conhece e porque utilizá-los.
**Resposta:**
 Singleton: Onde temos uma classe ou objeto seja instanciada uma única vez e com visibilidade e acessibilidade global dessa instância em um determinado escopo do projeto.
 
 Builder: Onde você cria uma classe que fica responsável por configurar sua classe principal e retornar o objeto pronto.
* Conhece os princípios SOLID? Por que utilizá-los? Explique os dois primeiros.
**Resposta:**
 SRP (Single Resposability Principle) determina que uma classe deve ter apenas uma resposabilidade. Sendo assim terá apenas um motivo para alterá-la. OCP (Open/Closed Principle) determina que uma classe deve ser aberta para extensão e fechada para alteração.

9. Após criar o projeto e alterar o README, com as respostas, faça um pull request.

**BOA SORTE!**

