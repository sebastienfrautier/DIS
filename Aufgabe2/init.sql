drop table makler;
drop table estate;
drop table house;
drop table appartment;
drop table person;
drop table purchase_contract;
drop table contract;
drop table tenancy_contract;


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


CREATE TABLE house(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
   floors varchar(255),
   price varchar(40),
   garden varchar(40));


CREATE TABLE appartment(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
   floors varchar(255),
   price varchar(40),
    garden varchar(40));



CREATE TABLE person(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
   fist_name varchar(255),
   name varchar(255),
   address varchar(255));

CREATE TABLE purchase_contract(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
   installment varchar(255),
   intetrest_rate varchar(255));

CREATE TABLE contract(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
   contract_no varchar(255),
   date varchar(255),
   place_id varchar(255));


CREATE TABLE tenancy_contract(id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1, NO CACHE) PRIMARY KEY,
   start_date date,
   duration varchar(8),
   additional_costs varchar(8));




