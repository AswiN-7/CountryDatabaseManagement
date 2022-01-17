/*					Country Database Management System
Entity:person with id,name,gender,dob,marital status,father,mother,qualification,state,status
id is unique
marital status m-married,u-unmarried
status 1-alive and present in this country,2-alive and lives in some other country,3-died

Entity:state with state_id,state_name,description,state_size,population,representive
state_id unique

Entity:supply with supply_id,name,description,qty
supply_id is unique

Entity:inventory with state_id,supply_id,qty
state_id,supply_id unique

Entity:visitor with visitor_id,host_id,name,country
visitor_id is unique

Entity:person_died with person_id,dod,reason
refered from person table and reduce the population count and assign 3 in status

Entity:info with info_id,state,type,description
info_id is unique
type 1-hospitals,2-schools,3-colleges,4-tourism
*/

REM:Dropping All Tables

drop table sb_bank;
drop table login_id;
drop table hospital;
drop table police;
drop table info;
drop table person_died;
drop table visitor;
drop table inventory;
drop table supply;
drop table marriage;
drop table person;
drop table state;




REM:Creating All Tables

create table state(
state_id varchar2(20) constraint state_id_pk primary key, 
state_name varchar2(20), 
description varchar2(300),
state_size number, 
population number);

create table person(
id varchar2(10) constraint person_pk1 primary key,
name varchar2(20) constraint pers_not_null not null, 
gender varchar2(2) constraint gen_not_null  not null, 
dob date, 
marital_status varchar2(2) constraint mar_not_null not null, 
father varchar2(10) references person(id), 
mother varchar2(10) references person(id), 
qualification varchar2(50), 
state varchar2(20) references state(state_id),
status number);

create table marriage(
person_id varchar2(10) constraint m_pk primary key,
partner_id varchar2(10),
constraint m_fk foreign key(person_id) references person(id),
constraint m_fk1 foreign key(partner_id) references person(id));

create table supply( 
supply_id varchar2(20) constraint supply_id_pk primary key, 
name varchar2(20) constraint name_nn not null, 
description varchar2(200) constraint decs_nn not null, 
qty number(4) constraint qty_nn not null);

create table inventory(
state_id varchar2(20) constraint state_id_in_fk references state(state_id), 
supply_id varchar2(20) constraint supply_id_in_fk references supply(supply_id), 
qty number(4) constraint qty_in_nn not null,
constraint in_pk primary key(state_id,supply_id));

create table visitor(
visitor_id varchar2(20) constraint visitor_id_pk primary key, 
host_id varchar2(20) constraint host_id_fk references person(id), 
name char(40) constraint name_vi_nn not null, 
country char(30));

create table person_died(
person_id varchar2(10) constraint person_id_pk primary key, 
dod date,
reason varchar2(100));

create table info(
info_id varchar2(10) constraint info_id_pk primary key,
state varchar2(20) constraint state_r references state(state_id),
type number, 
description varchar2(200));

create table police(
phone_no number(30) ,
state_id varchar2(30) references state(state_id),
constraint police_pk primary key(phone_no,state_id));

create table hospital(
phone_no number(30),
state_id varchar2(30) references state(state_id),
constraint hospital_pk primary key(phone_no,state_id));

create table login_id(
state_rep_id varchar2(30) constraint login_pk primary key,
password varchar2(30));

create table sb_bank(
bank_name varchar2(30),
person_id varchar2(30) references person(id),
balance number(30),
standing_loan number(30),
constraint bank_pk primary key(bank_name,person_id));
