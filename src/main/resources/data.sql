CREATE TABLE contacts(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR2(50) NOT NULL,
  last_name VARCHAR2(50) NOT NULL,
  email VARCHAR2(50) NOT NULL,
  phone_number VARCHAR2(20) NOT NULL,
  status VARCHAR2(8) NOT NULL
);
INSERT INTO contacts(first_name, last_name, email, phone_number, status) VALUES
  ('John', 'Kines', 'john.kines@em.co','911234567891','ACTIVE'),
   ('John', 'Kines', 'john.kines@em.co','911234567891','ACTIVE'),
 ('John', 'Kines', 'john.kines@em.co','911234567891','ACTIVE');