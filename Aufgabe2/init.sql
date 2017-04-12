drop table makler;
drop table estate;


CREATE TABLE makler(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
  name varchar(255),
  address varchar(255),
  login varchar(40) not NULL unique,
 password varchar(40));

 CREATE TABLE estate(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
  city varchar(255),
  postalcode varchar(40),
  street varchar(40),
  street_number varchar(40),
  square_area varchar(40));
