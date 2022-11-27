DROP TABLE IF EXISTS users;
CREATE TABLE users (id SERIAL PRIMARY KEY, name varchar(255), email varchar(255), password varchar(255));

INSERT INTO users (id, name, email, password) VALUES
(1, 'Admin', 'admin@gmail.com', '$2a$10$QEaf3I.eLiZC4F4pDnqmC.sTysFlJ59wgROmw3ATxceFs/wgg0LvK'),
(2, 'User', 'user@gmail.com', '$2a$10$exVjZOnYQ3oFdNTFP7qVHOoL8K2XhKpWXY3r8duw8v9pTNxmC0qbm');

DROP TABLE IF EXISTS roles;
CREATE TABLE roles (id SERIAL PRIMARY KEY, name varchar(255));

INSERT INTO roles (id, name) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER'),
(3, 'ROLE_VISITOR');

DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role (user_id int(11) PRIMARY KEY, role_id int(11) UNIQUE NOT NULL);

INSERT INTO user_role (user_id, role_id) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 2);

