CREATE TABLE IF NOT EXISTS  client (
               id IDENTITY  PRIMARY KEY,
               name VARCHAR(200)    NOT  NULL  CHECK ( LENGTH (name)>=3 ));

CREATE TABLE IF NOT EXISTS  planet (
               id VARCHAR(10) ,
               name VARCHAR(500)    NOT  NULL  CHECK ( LENGTH (name)>=1 )
CONSTRAINT check_id  CHECK ( id NOT LIKE '%[^A-Z]|[^0-9]%')
);

CREATE TABLE IF NOT EXISTS   ticket (
               id IDENTITY  PRIMARY KEY,
               created_at TIMESTAMP,
               client_id INT  NOT  NULL ,
               from_planet_id VARCHAR(10) NOT  NULL  ,
               to_planet_id VARCHAR(10) NOT  NULL  ,
               FOREIGN KEY (client_id)  REFERENCES client (id) ON DELETE CASCADE
);