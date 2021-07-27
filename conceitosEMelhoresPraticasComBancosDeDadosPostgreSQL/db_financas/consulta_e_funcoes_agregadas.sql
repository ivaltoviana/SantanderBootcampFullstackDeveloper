-- Fazendo consultas no banco de dados
SELECT numero, nome FROM banco;
SELECT numero, nome, ativo FROM banco;
SELECT banco_numero, numero, nome FROM agencia;
SELECT numero, nome, email FROM cliente;
SELECT id, nome FROM tipo_transacao;
SELECT banco_numero, agencia_numero, numero, cliente_numero FROM conta_corrente;
SELECT banco_numero, agencia_numero, cliente_numero FROM cliente_transacoes;

-- Não recomendado usar em produção
SELECT * FROM cliente_transacoes;

-- information_schema.columns: permite obter informações sobre todas as colunas de todas
-- as tabelas e exibições dentro de um banco de dados
SELECT * FROM information_schema.columns WHERE table_name = 'banco';
SELECT column_name, data_type FROM information_schema.columns WHERE table_name = 'banco';

--Funções Agregadas:
	-- AVG: a média (média aritmética) de todos os valores de entrada não nulos
	-- COUNT (opção: HAVING): número de linhas de entrada para as quais o valor da expressão não é nulo
	-- MAX: valor máximo da expressão em todos os valores de entrada não nulos
	-- MIN: valor mínimo de expressão em todos os valores de entrada não nulos
	-- SUM: soma da expressão em todos os valores de entrada não nulos

SELECT valor FROM cliente_transacoes;

-- média de todos os valores da tabela cliente_transacoes
SELECT AVG(valor) FROM cliente_transacoes;

-- mostra quantos emails há na tabela cliente, terminandos com gmail.com
SELECT COUNT(numero), email
FROM cliente
WHERE email ILIKE '%gmail.com'
GROUP BY email;

-- Número máximo na tabela cleinte
SELECT MAX(numero)
FROM cliente;

-- Número mínimo na tabela cleinte
SELECT MIN(numero)
FROM cliente;

-- Valor máximo na tabela cliente_transacoes
SELECT MAX(valor)
FROM cliente_transacoes;

-- -- Valor mínimo na tabela cleinte_transacoes
SELECT MIN(valor)
FROM cliente_transacoes;

-- Valor máximo de cada tipo de transação que está disponível do bd
SELECT MAX(valor), tipo_transacao_id
FROM cliente_transacoes
GROUP BY tipo_transacao_id;

-- Valor mínimo de cada tipo de transação que está disponível do bd
SELECT MIN(valor), tipo_transacao_id
FROM cliente_transacoes
GROUP BY tipo_transacao_id;

SELECT column_name, data_type FROM information_schema.columns WHERE table_name = 'cliente_transacoes';

-- mostra a quantidade de registros de transações por tipo
-- que há na tabela cliente_transacoes maior que 150
SELECT COUNT(id), tipo_transacao_id
FROM cliente_transacoes
GROUP BY tipo_transacao_id
HAVING COUNT(id) > 150;

-- Soma de todos os registros da tabela cliente_transacoes
SELECT SUM(valor)
FROM cliente_transacoes;


SELECT SUM(valor), tipo_transacao_id
FROM cliente_transacoes
GROUP BY tipo_transacao_id
ORDER BY tipo_transacao_id ASC; -- ordem de exibição na consulta: ascendente

SELECT SUM(valor), tipo_transacao_id
FROM cliente_transacoes
GROUP BY tipo_transacao_id
ORDER BY tipo_transacao_id DESC; -- ordem de exibição na consulta: descendente