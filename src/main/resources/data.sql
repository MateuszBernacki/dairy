CREATE TABLE IF NOT EXISTS `teacher`
(
    `id`      INT NOT NULL,
    `name`    VARCHAR(30),
    `surname` VARCHAR(30),
    `age`     INT,
    `email` VARCHAR (40),
    `specialization` VARCHAR (30),
PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `student`
(
    `id`      INT NOT NULL,
    `name`    VARCHAR(30),
    `surname` VARCHAR(30),
    `age`     INT,
    `email` VARCHAR (40),
    `subject` VARCHAR (30),
    PRIMARY KEY(`id`)
);