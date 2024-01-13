-- table company
create table if not exists company(
                                      id serial primary key,
                                      "name" varchar(32) not null unique,
    founder varchar(128),
    logo varchar(255),
    foundation_date date
    );

-- index for name
create index name_company
    on company("name");

-- table web site
create table if not exists web_site(
                                       id serial primary key,
                                       id_company bigint,
                                       "name" varchar(32) not null unique,
    category varchar(32) not null,
    description text,
    constraint fk_company
    foreign key(id_company)
    references company(id)
    on delete cascade
    );