DROP TABLE IF EXISTS users;
CREATE TABLE users (id int(11) PRIMARY KEY, name varchar(255), email varchar(255), password varchar(255));

INSERT INTO users (id, name, email, password) VALUES
                                                  (1, 'Admin', 'admin@gmail.com', '$2a$10$QEaf3I.eLiZC4F4pDnqmC.sTysFlJ59wgROmw3ATxceFs/wgg0LvK'),
                                                  (2, 'User', 'user@gmail.com', '$2a$10$exVjZOnYQ3oFdNTFP7qVHOoL8K2XhKpWXY3r8duw8v9pTNxmC0qbm');

DROP TABLE IF EXISTS roles;
CREATE TABLE roles (id int(11) PRIMARY KEY, name varchar(255));

INSERT INTO roles (id, name) VALUES
                                 (1, 'ROLE_ADMIN'),
                                 (2, 'ROLE_USER'),
                                 (3, 'ROLE_VISITOR');

DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role (user_id int(11) PRIMARY KEY, role_id int(11));

INSERT INTO user_role (user_id, role_id) VALUES
                                             (1, 1),
                                             (2, 2);

DROP TABLE IF EXISTS jelentkezo;
CREATE TABLE jelentkezo (id int(11) PRIMARY KEY, nev varchar(100), nem varchar(100));

INSERT INTO jelentkezo (id, nev, nem) VALUES
                                          (1, 'Skvar Tamás', 'f'),
                                          (2, 'Tatár István', 'f'),
                                          (3, 'Siket Karen', 'l'),
                                          (5, 'Dombovári Petra', 'l'),
                                          (6, 'Rém Elek', 'f'),
                                          (8, 'Sebő Tas', 'f'),
                                          (9, 'Szendrődi Csaba', 'f'),
                                          (10, 'Berger Péter', 'f'),
                                          (11, 'Csonka Anna', 'l'),
                                          (13, 'Kovács Ágnes', 'l'),
                                          (14, 'Szőke Mátyás', 'f'),
                                          (15, 'Kiss Zsófia', 'l'),
                                          (16, 'Bakos Kata Judit', 'l'),
                                          (17, 'Bodnár Anna Katalin', 'l'),
                                          (18, 'Keszthelyi Zsolt', 'f'),
                                          (19, 'Kiss Lajos', 'f'),
                                          (20, 'Szabó Orsolya Virág', 'l'),
                                          (21, 'Vég Kálmán', 'f'),
                                          (22, 'Hirzer Zsolt', 'f'),
                                          (23, 'Kincses Zoltán', 'f'),
                                          (24, 'Zentay Réka', 'l'),
                                          (25, 'Kovai Róbert', 'f'),
                                          (26, 'Koch Róbert', 'f'),
                                          (27, 'Szilágyi István', 'f'),
                                          (28, 'Horváth Pál', 'f'),
                                          (29, 'Duma Árpád', 'f'),
                                          (30, 'Nemes Gerda', 'l'),
                                          (31, 'Zsolnai Péter', 'f'),
                                          (32, 'Illés Nóra', 'l'),
                                          (33, 'Fődi Anna', 'l'),
                                          (34, 'Szűcs Lóránt', 'f'),
                                          (35, 'Borsos Anett', 'l'),
                                          (36, 'Sarlós Róbert', 'f'),
                                          (37, 'Hoffmann Bettina', 'l'),
                                          (38, 'Farkas Ildikó', 'l'),
                                          (39, 'Gál Brigitta', 'l'),
                                          (40, 'Szabó Izabella Diána', 'l'),
                                          (41, 'Dudás Krisztián', 'f'),
                                          (42, 'Csordás Kálmán', 'f'),
                                          (43, 'Tóth Alexandra', 'l'),
                                          (45, 'Dorogi Nóra Gréta', 'l'),
                                          (46, 'Nemes Petra', 'l'),
                                          (47, 'Schulcz Imola', 'l'),
                                          (48, 'Senkey Tamás', 'f'),
                                          (49, 'Nyers Sándor', 'f'),
                                          (50, 'Szekeres József', 'f'),
                                          (51, 'Berényi Zsolt', 'f'),
                                          (52, 'Bánfalvi Ramóna', 'l'),
                                          (53, 'Rácz Lili', 'l'),
                                          (54, 'Botos Noémi', 'l'),
                                          (55, 'Kasznár Judit', 'l'),
                                          (57, 'Kerekes Lili', 'l'),
                                          (58, 'Kis Barbara Emma', 'l'),
                                          (60, 'Nagy Eszter', 'l'),
                                          (61, 'Benkő Kata Enikő', 'l'),
                                          (62, 'Urbán Roland', 'f'),
                                          (63, 'Samu Blanka', 'l'),
                                          (64, 'Pálinkás Anna', 'l'),
                                          (65, 'Falch Emil', 'f'),
                                          (66, 'Teleki Kálmán', 'f'),
                                          (67, 'Sima Dezső', 'f'),
                                          (68, 'Rudas Ádám', 'f'),
                                          (69, 'Forrai Laura', 'l'),
                                          (70, 'Irinyi Katalin Ida', 'l'),
                                          (71, 'Hódi Vivien', 'l'),
                                          (72, 'Máté Oszkár', 'f'),
                                          (73, 'Püski Kata', 'l'),
                                          (74, 'Mészáros Anita Réka', 'l'),
                                          (75, 'Kis Nóra Judit', 'l'),
                                          (76, 'Nyári Judit', 'l'),
                                          (77, 'Balog Orsolya', 'l'),
                                          (78, 'Zombori Adrienn', 'l'),
                                          (79, 'Tóti Albert', 'f'),
                                          (81, 'Petres Zoltán', 'f'),
                                          (83, 'Rovó Petra', 'l'),
                                          (85, 'Fogó Róbert', 'f'),
                                          (86, 'Juhász Imre', 'f'),
                                          (88, 'Tanács Lilla', 'l'),
                                          (89, 'Kiss Sándor', 'f'),
                                          (90, 'Kovács Vivien', 'l'),
                                          (91, 'Kun Anna', 'l'),
                                          (92, 'Pályi Balázs', 'f'),
                                          (93, 'Kristóf Petra', 'l'),
                                          (94, 'Gábor Zita', 'l'),
                                          (95, 'Lakatos Zita Ildikó', 'l'),
                                          (96, 'Garadnai Zoltán', 'f'),
                                          (97, 'Bognár Ágnes', 'l'),
                                          (98, 'Dobi Brigitta Krisztina', 'l'),
                                          (99, 'Dócz Károly', 'f'),
                                          (100, 'Halász Norbert', 'f');

DROP TABLE IF EXISTS kepzes;
CREATE TABLE kepzes (id int(11) SERIAL PRIMARY KEY, nev varchar(100), felveheto int(11), minimum int(11));

INSERT INTO kepzes (id, nev, felveheto, minimum) VALUES
                                                     (1, 'francia', 16, 140),
                                                     (2, 'angol', 30, 150),
                                                     (3, 'matematika', 16, 160),
                                                     (4, 'informatika', 16, 150),
                                                     (5, 'környezetvédelmi', 16, 130),
                                                     (6, 'közgazdasági', 30, 130);

DROP TABLE IF EXISTS jelentkezes;
CREATE TABLE jelentkezes (id int(11) SERIAL PRIMARY KEY, jelentkezoid int(11), kepzesid int(11), sorrend int(11), szerzett int(11));

INSERT INTO jelentkezes (id, jelentkezoid, kepzesid, sorrend, szerzett) VALUES
                                                                            (1, 67, 5, 3, 161),
                                                                            (2, 61, 3, 1, 113),
                                                                            (3, 39, 2, 1, 122),
                                                                            (4, 31, 1, 2, 152),
                                                                            (5, 64, 4, 2, 177),
                                                                            (6, 57, 3, 3, 135),
                                                                            (7, 53, 1, 1, 182),
                                                                            (8, 27, 5, 2, 153),
                                                                            (9, 99, 4, 2, 116),
                                                                            (10, 69, 1, 2, 187),
                                                                            (11, 5, 2, 1, 154),
                                                                            (12, 36, 5, 1, 108),
                                                                            (13, 1, 2, 1, 139),
                                                                            (14, 67, 3, 1, 190),
                                                                            (15, 37, 3, 2, 144),
                                                                            (16, 30, 5, 4, 197),
                                                                            (17, 35, 5, 2, 195),
                                                                            (18, 75, 3, 1, 159),
                                                                            (19, 22, 5, 1, 133),
                                                                            (20, 19, 2, 1, 162),
                                                                            (21, 81, 3, 1, 186),
                                                                            (22, 69, 2, 1, 115),
                                                                            (23, 23, 1, 4, 181),
                                                                            (24, 50, 2, 4, 125),
                                                                            (25, 63, 6, 3, 121),
                                                                            (26, 55, 6, 2, 163),
                                                                            (27, 85, 1, 1, 179),
                                                                            (28, 16, 1, 2, 107),
                                                                            (29, 35, 6, 1, 128),
                                                                            (30, 86, 2, 2, 187),
                                                                            (31, 16, 6, 3, 167),
                                                                            (32, 79, 3, 1, 153),
                                                                            (33, 66, 4, 1, 170),
                                                                            (34, 76, 3, 4, 169),
                                                                            (35, 18, 2, 2, 185),
                                                                            (36, 33, 4, 1, 150),
                                                                            (37, 72, 3, 2, 146),
                                                                            (38, 89, 3, 1, 111),
                                                                            (39, 25, 6, 1, 141),
                                                                            (40, 41, 2, 3, 108),
                                                                            (41, 37, 2, 1, 184),
                                                                            (42, 28, 6, 1, 163),
                                                                            (43, 24, 3, 1, 155),
                                                                            (44, 100, 2, 1, 112),
                                                                            (45, 100, 3, 2, 152),
                                                                            (46, 22, 2, 3, 111),
                                                                            (47, 1, 3, 3, 154),
                                                                            (48, 27, 6, 1, 107),
                                                                            (49, 70, 6, 4, 118),
                                                                            (50, 70, 4,	2, 168);

DROP TABLE IF EXISTS uzenet;
CREATE TABLE uzenet (id int(11) SERIAL PRIMARY KEY, content varchar(100), date varchar(100), name varchar(100));

DROP TABLE IF EXISTS vizsgazodiak;
CREATE TABLE vizsgazodiak (azon int(11) SERIAL PRIMARY KEY, nev varchar(50), osztaly varchar(50));

INSERT INTO vizsgazodiak (nev, osztaly) VALUES
                                            ('Borbás Ferenc', '11/B'),
                                            ('Sima Dezső', '11/C'),
                                            ('Lajos Lajos', '11/C'),
                                            ('Lant János', '12/D'),
                                            ('Fogó Róbert', '11/C'),
                                            ('Pisty Mihály', '12/D'),
                                            ('Déri Béla', '11/B'),
                                            ('Nikk Gábor', '12/B'),
                                            ('Budai Tamás', '12/A'),
                                            ('Bog Aladár', '12/A'),
                                            ('Bálint Gábor', '11/B'),
                                            ('Fekete Zsolt', '12/E'),
                                            ('Kisó Ábel', '10/D'),
                                            ('Hámori Frigyes', '10/C'),
                                            ('Kosztolányi András', '11/B'),
                                            ('Sebes Vilmos', '11/A'),
                                            ('Pölös Ágost', '12/A'),
                                            ('Szűcs Lóránt', '12/D'),
                                            ('Weisz Richárd', '11/B'),
                                            ('Tóth Zoltán', '10/E'),
                                            ('Pók Béla', '12/E'),
                                            ('Stabb Ottó', '9/A'),
                                            ('Füst Szabolcs', '12/C'),
                                            ('Budai Ferenc', '9/A'),
                                            ('Szósz György', '9/A'),
                                            ('Fenyves Attila', '12/B'),
                                            ('Ilkei Béla', '11/B'),
                                            ('Eszes Győző', '12/C'),
                                            ('Izsó Gusztáv', '12/C'),
                                            ('Mind Ákos', '9/C');