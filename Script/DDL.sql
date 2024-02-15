-- database: Exobots.sqlite

DROP TABLE IF EXISTS IABot;
CREATE TABLE IABot (
    IdIABot        INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre         TEXT NOT NULL UNIQUE,
    Observacion    TEXT,
    FechaCrea      DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO IABot (Nombre)
VALUES ('Iabot');

DROP TABLE IF EXISTS ExaBot;
CREATE TABLE ExaBot (
    IdExaBot       INTEGER PRIMARY KEY AUTOINCREMENT,
    IdIABot        INTEGER NOT NULL,
    Nombre         TEXT NOT NULL,
    Serie          TEXT NOT NULL,
    CONSTRAINT fk_IABot
    FOREIGN KEY (IdIABot)
    REFERENCES IABot(IdIABot)
);

CREATE TABLE seq AS 
WITH RECURSIVE
  cnt(x) AS (SELECT 1 UNION ALL SELECT x+1 FROM cnt LIMIT 1000)
SELECT x AS id, 'exabot' || x AS nombre, 'Serie E' || x AS serie FROM cnt;

INSERT INTO ExaBot (IdIABot, Nombre, Serie)
SELECT 1, nombre, serie FROM seq;

DROP TABLE seq;
