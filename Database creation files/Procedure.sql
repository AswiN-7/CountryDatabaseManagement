REM:Procedure 1
create or replace procedure marry
(t1 person.id%TYPE,t2 person.id%TYPE) is
gen1 person.gender%TYPE;
gen2 gen1%TYPE;
m_status person.marital_status%TYPE;
m_status1 m_status%TYPE;
begin
	select gender into gen1 from person where id=t1;
	select gender into gen2 from person where id=t2;
	select marital_status into m_status from person where id=t1;
	select marital_status into m_status1 from person where id=t2;
	if((gen1<>gen2) and (t1<>t2) and (m_status='u') and (m_status1='u')) then
		insert into marriage_s values(t1,t2);
		insert into marriage_s values(t2,t1);
		update person
			set marital_status='m' where id=t1;
		update person
			set marital_status='m' where id=t2;
		dbms_output.put_line('Table Updated Sucessfully');
	else
		dbms_output.put_line('Marriage Not Possible');
	end if;
exception
	when no_data_found then
		dbms_output.put_line('Invalid Input');
end;
/

REM:PL/SQL Block:
declare 
	temp1 person.id%TYPE;
	temp2 temp1%TYPE;
begin
	temp1:='&temp1';
	temp2:='&temp2';
	marry(temp1,temp2);
end;
/

REM:Procedure 2
create or replace procedure dec_pop
(t3 person.id%TYPE,d1 person.dob%TYPE,r state.description%TYPE) is

sid state.state_id%TYPE;
sp state.population%TYPE;
begin
	select s.state_id into sid from state s,person p where(s.state_id=p.state) and (p.id=t3);
	select population into sp from state where state_id=sid;
	sp:=sp-1;
	update state
		set population=sp where state_id=sid;
	delete from sb_bank where person_id=t3;
	update person 
		set status=3 where id=t3;
	insert into person_died values(t3,d1,r);
    dbms_output.put_line('Sucessful');
exception
	when no_data_found then
		dbms_output.put_line('Invalid Input');
end;
/

REM:PL/SQL Block
declare
	temp person.id%TYPE;
	d person.dob%TYPE;
	reason char(100);
begin
	temp:='&temp';
	d:='&d';
	reason:='&reason';
	dec_pop(temp,d,reason);
end;
/

create or replace function log_pwd
(log login_id.state_rep_id%TYPE,pwd login_id.password%TYPE) return number is

rep_id login_id.state_rep_id%TYPE;
pass login_id.password%TYPE;
temp number;
cursor c is select * from login_id;
begin
	temp:=0;
	open c;
	loop
		fetch c into rep_id,pass;
		exit when c%NOTFOUND;
		if((rep_id=log) and (pwd=pass)) then
			temp:=1;
		end if;
	end loop;
	return temp;
end;

REM:PL/SQL Block

declare
	log1 login_id.state_rep_id%TYPE;
	pwd1 login_id.password%TYPE;
	t number;
begin
	log1:='&log1';
	pwd1:='&pwd1';
	t:=log_pwd(log1,pwd1);
	if(t=1) then
		dbms_output.put_line('Both are Present');
	else
		dbms_output.put_line('Not Present');
	end if;
end;

