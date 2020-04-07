CREATE TABLE IF NOT EXISTS user_entity (
    id SERIAL,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    university VARCHAR(100) NOT NULL
);