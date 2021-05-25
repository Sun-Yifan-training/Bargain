/* Drop Tables */
DROP TABLE IF EXISTS bargain;
DROP TABLE IF EXISTS weekday;

/* Create Tables */
CREATE TABLE weekday
(
    id INTEGER PRIMARY KEY,
    name VARCHAR(128)
);

CREATE TABLE bargain
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128),
    category VARCHAR(128),
    weekday_id INTEGER,
    CONSTRAINT fk_weekday_id FOREIGN KEY (weekday_id) REFERENCES weekday(id)
);