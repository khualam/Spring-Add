create table users (username varchar(20) primary key, password varchar(20));
insert into users values ('userone','passone');
insert into users values('usertwo','passtwo');
insert into users values('userthree','passthree');


select username,password,'true' as enabled from users where username=?

create table roles ( username varchar(20) , role varchar(20), primary key (username,role))
insert into roles values ('userone', 'ROLE_admin');
insert into roles values ('usertwo', 'ROLE_stduser');
insert into roles values('userthree', 'ROLE_admin');
insert into roles values('userthree', 'ROLE_stduser');
select users.username, roles.role as role from users, roles where users.username =? and roles.username = users.username 


