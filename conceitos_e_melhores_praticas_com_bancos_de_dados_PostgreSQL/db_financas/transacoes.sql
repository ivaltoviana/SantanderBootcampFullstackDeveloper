SELECT numero, nome, ativo FROM banco ORDER BY numero;

UPDATE banco SET ativo = false WHERE numero = 0;

-- Transação
BEGIN;
	UPDATE banco SET ativo = true WHERE numero = 0;
	SELECT numero, nome, ativo FROM banco WHERE numero = 0;
ROLLBACK;

BEGIN;
	UPDATE banco SET ativo = true WHERE numero = 0;
COMMIT;

SELECT id, gerente, nome FROM funcionarios;

BEGIN;
	UPDATE funcionarios SET gerente = 2 WHERE id = 3; -- Magno funcionário da Beatriz
SAVEPOINT sf_func;
	UPDATE funcionarios SET gerente = null; -- erro, vai continuar a partir do ROLLBACK
ROLLBACK TO sf_func;
	UPDATE funcionarios SET gerente = 3 WHERE id = 5; -- Wagner funcionário do Magno
COMMIT;