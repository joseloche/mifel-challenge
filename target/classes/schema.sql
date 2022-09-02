DROP TABLE IF EXISTS catalogo;
create table catalog (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name varchar(50),
    f_name varchar(50),
    l_name varchar(50),
    direction varchar(100),
    age integer(2),
    primary key(id)
 ); 