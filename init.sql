CREATE DATABASE my_database;

USE my_database;

CREATE TABLE user_data (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           email VARCHAR(255) NOT NULL
);
