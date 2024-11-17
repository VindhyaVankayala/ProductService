CREATE TABLE extra_test_model
(
    id    BINARY(16) NOT NULL,
    title VARCHAR(255) NULL,
    CONSTRAINT pk_extratestmodel PRIMARY KEY (id)
);

ALTER TABLE orders
    ADD status VARCHAR(255) NULL;