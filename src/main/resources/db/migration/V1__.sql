CREATE TABLE category
(
    id   BINARY(16) NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT pk_category PRIMARY KEY (id)
);

CREATE TABLE j_mentor
(
    user_id              BIGINT NOT NULL,
    avg_rating DOUBLE NULL,
    current_company      VARCHAR(255) NULL,
    years_of_experience  BIGINT NULL,
    total_sessions_taken BIGINT NULL,
    total_no_of_mentees  BIGINT NULL,
    CONSTRAINT pk_j_mentor PRIMARY KEY (user_id)
);

CREATE TABLE j_student
(
    user_id         BIGINT NOT NULL,
    psp DOUBLE NULL,
    attendance DOUBLE NULL,
    year_of_passing BIGINT NULL,
    current_company VARCHAR(255) NULL,
    CONSTRAINT pk_j_student PRIMARY KEY (user_id)
);

CREATE TABLE j_ta
(
    user_id    BIGINT NOT NULL,
    avg_rating DOUBLE NULL,
    university VARCHAR(255) NULL,
    CONSTRAINT pk_j_ta PRIMARY KEY (user_id)
);

CREATE TABLE j_user
(
    id       BIGINT NOT NULL,
    name     VARCHAR(255) NULL,
    email_id VARCHAR(255) NULL,
    CONSTRAINT pk_j_user PRIMARY KEY (id)
);

CREATE TABLE ms_mentor
(
    id                   BIGINT NOT NULL,
    name                 VARCHAR(255) NULL,
    email_id             VARCHAR(255) NULL,
    avg_rating DOUBLE NULL,
    current_company      VARCHAR(255) NULL,
    years_of_experience  BIGINT NULL,
    total_sessions_taken BIGINT NULL,
    total_no_of_mentees  BIGINT NULL,
    CONSTRAINT pk_ms_mentor PRIMARY KEY (id)
);

CREATE TABLE ms_student
(
    id              BIGINT NOT NULL,
    name            VARCHAR(255) NULL,
    email_id        VARCHAR(255) NULL,
    psp DOUBLE NULL,
    attendance DOUBLE NULL,
    year_of_passing BIGINT NULL,
    current_company VARCHAR(255) NULL,
    CONSTRAINT pk_ms_student PRIMARY KEY (id)
);

CREATE TABLE ms_ta
(
    id         BIGINT NOT NULL,
    name       VARCHAR(255) NULL,
    email_id   VARCHAR(255) NULL,
    avg_rating DOUBLE NULL,
    university VARCHAR(255) NULL,
    CONSTRAINT pk_ms_ta PRIMARY KEY (id)
);

CREATE TABLE orders
(
    id BINARY(16) NOT NULL,
    CONSTRAINT pk_orders PRIMARY KEY (id)
);

CREATE TABLE orders_products
(
    orders_id   BINARY(16) NOT NULL,
    products_id BINARY(16) NOT NULL
);

CREATE TABLE price
(
    id       BINARY(16) NOT NULL,
    currency VARCHAR(255) NULL,
    value DOUBLE NULL,
    CONSTRAINT pk_price PRIMARY KEY (id)
);

CREATE TABLE product
(
    id            BINARY(16) NOT NULL,
    title         VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    image         VARCHAR(255) NULL,
    category_id   BINARY(16) NOT NULL,
    price_id      BINARY(16) NOT NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE st_user
(
    id                   BIGINT AUTO_INCREMENT NOT NULL,
    user_type            INT NULL,
    name                 VARCHAR(255) NULL,
    email_id             VARCHAR(255) NULL,
    psp DOUBLE NULL,
    attendance DOUBLE NULL,
    year_of_passing      BIGINT NULL,
    current_company      VARCHAR(255) NULL,
    avg_rating DOUBLE NULL,
    university           VARCHAR(255) NULL,
    years_of_experience  BIGINT NULL,
    total_sessions_taken BIGINT NULL,
    total_no_of_mentees  BIGINT NULL,
    CONSTRAINT pk_st_user PRIMARY KEY (id)
);

CREATE TABLE tpc_mentor
(
    id                   BIGINT NOT NULL,
    name                 VARCHAR(255) NULL,
    email_id             VARCHAR(255) NULL,
    avg_rating DOUBLE NULL,
    current_company      VARCHAR(255) NULL,
    years_of_experience  BIGINT NULL,
    total_sessions_taken BIGINT NULL,
    total_no_of_mentees  BIGINT NULL,
    CONSTRAINT pk_tpc_mentor PRIMARY KEY (id)
);

CREATE TABLE tpc_student
(
    id              BIGINT NOT NULL,
    name            VARCHAR(255) NULL,
    email_id        VARCHAR(255) NULL,
    psp DOUBLE NULL,
    attendance DOUBLE NULL,
    year_of_passing BIGINT NULL,
    current_company VARCHAR(255) NULL,
    CONSTRAINT pk_tpc_student PRIMARY KEY (id)
);

CREATE TABLE tpc_ta
(
    id         BIGINT NOT NULL,
    name       VARCHAR(255) NULL,
    email_id   VARCHAR(255) NULL,
    avg_rating DOUBLE NULL,
    university VARCHAR(255) NULL,
    CONSTRAINT pk_tpc_ta PRIMARY KEY (id)
);

CREATE TABLE tpc_user
(
    id       BIGINT NOT NULL,
    name     VARCHAR(255) NULL,
    email_id VARCHAR(255) NULL,
    CONSTRAINT pk_tpc_user PRIMARY KEY (id)
);

ALTER TABLE category
    ADD CONSTRAINT uc_category_name UNIQUE (name);

ALTER TABLE product
    ADD CONSTRAINT uc_product_price UNIQUE (price_id);

ALTER TABLE j_mentor
    ADD CONSTRAINT FK_J_MENTOR_ON_USER FOREIGN KEY (user_id) REFERENCES j_user (id);

ALTER TABLE j_student
    ADD CONSTRAINT FK_J_STUDENT_ON_USER FOREIGN KEY (user_id) REFERENCES j_user (id);

ALTER TABLE j_ta
    ADD CONSTRAINT FK_J_TA_ON_USER FOREIGN KEY (user_id) REFERENCES j_user (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES category (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_PRICE FOREIGN KEY (price_id) REFERENCES price (id);

ALTER TABLE orders_products
    ADD CONSTRAINT fk_ordpro_on_order FOREIGN KEY (orders_id) REFERENCES orders (id);

ALTER TABLE orders_products
    ADD CONSTRAINT fk_ordpro_on_product FOREIGN KEY (products_id) REFERENCES product (id);