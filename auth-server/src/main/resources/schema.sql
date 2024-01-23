create table user_info
(
    id bigint auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    primary key(id)
);