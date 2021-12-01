-- MESSAGE
DROP TABLE IF EXISTS MESSAGE;
CREATE TABLE MESSAGE(
    id  SERIAL PRIMARY KEY NOT NULL,
    text   TEXT NOT NULL,
    date timestamp default current_timestamp
);
