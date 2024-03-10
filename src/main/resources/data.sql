insert into users(username,password,enabled) values ('maha','pass',true);
insert into users(username,password,enabled) values ('bavesh','pass',true);

insert into authorities(username,authority) values ('maha','ROLE_USER');
insert into authorities(username,authority) values ('bavesh','ROLE_ADMIN');