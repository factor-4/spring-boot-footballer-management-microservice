-- Ensure the 'footballer' table exists
CREATE TABLE IF NOT EXISTS footballer
(
    id            UUID PRIMARY KEY,
    name          VARCHAR(255)        NOT NULL,
    email         VARCHAR(255) UNIQUE NOT NULL,
    address       VARCHAR(255)        NOT NULL,
    age           VARCHAR(10)         NOT NULL,
    playing_role  VARCHAR(50)         NOT NULL
);

-- Insert well-known UUIDs for specific footballers
INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '323e4567-e89b-12d3-a456-426614174000',
       'Lionel Messi',
       'lionel.messi@example.com',
       'Rosario, Argentina',
       '36',
       'FORWARD'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '323e4567-e89b-12d3-a456-426614174000'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '323e4567-e89b-12d3-a456-426614174001',
       'Cristiano Ronaldo',
       'cristiano.ronaldo@example.com',
       'Madeira, Portugal',
       '39',
       'FORWARD'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '323e4567-e89b-12d3-a456-426614174001'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '323e4567-e89b-12d3-a456-426614174002',
       'Kevin De Bruyne',
       'kevin.debruyne@example.com',
       'Ghent, Belgium',
       '32',
       'MIDFIELDER'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '323e4567-e89b-12d3-a456-426614174002'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '323e4567-e89b-12d3-a456-426614174003',
       'Luka Modric',
       'luka.modric@example.com',
       'Zadar, Croatia',
       '38',
       'MIDFIELDER'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '323e4567-e89b-12d3-a456-426614174003'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '323e4567-e89b-12d3-a456-426614174004',
       'Virgil van Dijk',
       'virgil.vandijk@example.com',
       'Breda, Netherlands',
       '33',
       'DEFENDER'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '323e4567-e89b-12d3-a456-426614174004'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '423e4567-e89b-12d3-a456-426614174005',
       'Sergio Ramos',
       'sergio.ramos@example.com',
       'Camas, Spain',
       '37',
       'DEFENDER'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '423e4567-e89b-12d3-a456-426614174005'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '423e4567-e89b-12d3-a456-426614174006',
       'Manuel Neuer',
       'manuel.neuer@example.com',
       'Gelsenkirchen, Germany',
       '38',
       'GOALKEEPER'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '423e4567-e89b-12d3-a456-426614174006'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '423e4567-e89b-12d3-a456-426614174007',
       'Erling Haaland',
       'erling.haaland@example.com',
       'Leeds, England',
       '24',
       'FORWARD'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '423e4567-e89b-12d3-a456-426614174007'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '423e4567-e89b-12d3-a456-426614174008',
       'Pedri',
       'pedri@example.com',
       'Tegueste, Spain',
       '21',
       'MIDFIELDER'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '423e4567-e89b-12d3-a456-426614174008'
);

INSERT INTO footballer (id, name, email, address, age, playing_role)
SELECT '423e4567-e89b-12d3-a456-426614174009',
       'Kylian Mbappe',
       'kylian.mbappe@example.com',
       'Paris, France',
       '25',
       'FORWARD'
WHERE NOT EXISTS (
    SELECT 1 FROM footballer WHERE id = '423e4567-e89b-12d3-a456-426614174009'
);
