CREATE TABLE ressource (
    ressource_id bigserial primary key,
    surname varchar(20) NOT NULL,
    firstname varchar(20) text NOT NULL,
    date_added timestamp default NULL,
    last_updated timestamp default NULL
);


CREATE TABLE evaluation( 
   evaluation_id bigserial primary key,
   date timestamp NOT NULL,
   rating integer NOT NULL,
   skill_id_fk integer REFERENCES skill (skill_id),
   ressource_id_fk integer REFERENCES ressource (ressource_id),
);

CREATE TABLE skill( 
   skill_id bigserial primary key,
   label varchar(20) NOT NULL
);