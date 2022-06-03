INSERT INTO question (id, question, type)
VALUES (7, 'Сумма', 'SUMM');
INSERT INTO answer (id, question_id, answer)
VALUES (7, 7, "Да");

-- Пример 1
CREATE UNIQUE INDEX CONCURRENTLY tariff_code ON service.tariff (code);

-- Пример 2
ALTER TABLE service.tariff DROP COLUMN available;

-- Пример 3
CREATE TABLE IF NOT EXISTS brokerage_service.tariff
(
    id bigserial,
    code varchar(255) NOT NULL,
    name varchar(255)
);