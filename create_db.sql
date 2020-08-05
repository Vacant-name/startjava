CREATE DATABASE Jaeger;
\c Jaeger;
CREATE TABLE Robots
(
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark INTEGER,
	height INTEGER,
	weight INTEGER,
	status TEXT,
	origin TEXT,
	launch CHAR(9),
	kaijuKill INTEGER
);

