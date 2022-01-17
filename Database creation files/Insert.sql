REM:Inserting into state

insert into state values('s001','abc','aasd',7700,5000);
insert into state values('s002','xyz','qwer',7650,7000);
insert into state values('s003','jkl','wert',9000,7400);
insert into state values('s004','ab','uiop',10000,8300);
insert into state values('s005','cde','zxzc',12300,1000);
insert into state values('s006','wez','qfg',18990,1233);
insert into state values('s007','xcv','vcc',8373,7659);
insert into state values('s008','mnb','saa',9009,5000);
insert into state values('s009','plk','aqq',13500,4599);
insert into state values('s0010','sdf','nnn',6784,6779);	
insert into state values('s0011','nnb','mmj',9087,8500);
insert into state values('s0012','aag','llp',7753,3455);
insert into state values('s0013','jko','eqw',8790,1900);
insert into state values('s0014','lop','motl',9987,1234);
insert into state values('s0015','mmb','zass',78900,56000);
insert into state values('s0016','qwy','zall',9000,8900);
insert into state values('s0017','thy','pomf',4566,544);
insert into state values('s0018','uik','fhgj',6500,788);
insert into state values('s0019','ulo','clck',70000,60000);
insert into state values('s0020','mon','cmop',1000,657);	


REM:Inserting into person

insert into person values('p001','WXYZ','M','31-jan-1990','m','','','BE','s001',1);
insert into person values('p002','ABCD','F','26-apr-1987','m','','','MSC','s001',2);
insert into person values('p003','PAQW','M','13-jun-1998','m','p001','p002','ME','s005',2);
insert into person values('p004','EFGH','F','08-dec-1999','m','','','ME','s003',3);
insert into person values('p005','IJKL','M','15-may-1988','m','p003','p004','PHD','s004',1);
insert into person values('p006','MNOP','F','09-jun-1985','m','','','ME','s004',1);
insert into person values('p007','QRST','M','08-jul-1995','m','p005','p006','BSC','s004',1);
insert into person values('p008','MLKJ','F','17-jun-1998','m','','','MSC','s005',2);
insert into person values('p009','KJLP','M','16-sep-1999','m','p007','p008','ME','s006',1);
insert into person values('p0010','PLLM','F','01-jan-1985','m','','','BA','s007',1);
insert into person values('p0011','OIJK','M','09-aug-1987','m','p009','p0010','BE','s009',2);
insert into person values('p0012','KJL','F','22-feb-1997','m','','','PHD','s0019',1);
insert into person values('p0013','OLKJ','M','12-dec-1931','m','p0011','p0012','MA','s0012',2);
insert into person values('p0014','MNJL','F','16-mar-1933','m','','','BSC','s0020',1);
insert into person values('p0015','LKJH','M','29-apr-1996','m','p0013','p0014','PHD','s0010',1);
insert into person values('p0016','BVFG','F','01-may-2000','m','','','PHD','s009',1);
insert into person values('p0017','NHTY','M','19-jun-1995','m','p0015','p0016','ME','s001',1);
insert into person values('p0018','FDGA','F','21-jul-1950','m','','','BE','s0015',1);
insert into person values('p0019','KJLN','M','15-aug-1999','u','p0017','p0019','BA','s0019',1);
insert into person values('p0020','BVCZ','F','17-sep-1995','u','','','BTECH','s0017',1);
insert into person values('p0021','BVCZ','F','17-sep-1998','u','','','BTECH','s0017',1);
insert into person values('p0022','BVCZ','F','17-sep-2010','u','','','BTECH','s0017',1);
insert into person values('p0023','BVCZ','F','17-sep-2011','u','','','BTECH','s0017',1);
insert into person values('p0024','BVCZ','F','17-sep-2010','u','','','BTECH','s0017',1);
insert into person values('p0025','BVCZ','F','17-sep-1999','u','','','BTECH','s0017',1);
insert into person values('p0026','BVCZ','F','17-sep-1990','u','','','BTECH','s0017',1);
insert into person values('p0027','BVCZ','F','17-sep-2000','u','','','BTECH','s0017',1);
insert into person values('p0028','BVCZ','F','17-sep-2000','u','','','BTECH','s0017',1);
insert into person values('p0029','BVCZ','F','17-sep-2000','u','','','BTECH','s0017',1);
insert into person values('p0030','BVCZ','F','17-sep-2000','u','','','BTECH','s0017',1);
insert into person values('p0031','BVCZ','F','17-sep-2000','u','','','BTECH','s0017',1);
insert into person values('p0032','BVCZ','F','17-sep-2000','u','','','BTECH','s0017',1);
insert into person values('p0033','BVCZ','F','17-sep-2000','u','','','BTECH','s0017',1);
REM:Inserting into supply

insert into supply values('su001','apld','ghjl',1000);
insert into supply values('su005','qwxz','lkh',2000);
insert into supply values('su002','yuo','smds',1500);
insert into supply values('su003','poa','tyyu',4311);
insert into supply values('su004','lkj','mnbl',4500);


REM:Inserting into inventory

insert into inventory values('s001','su001',1000);
insert into inventory values('s001','su002',1000);
insert into inventory values('s002','su001',1000);
insert into inventory values('s003','su001',1000);
insert into inventory values('s001','su004',1000);



REM:Inserting into visitor:

insert into visitor values('v001','p001','fghj','asdfg');
insert into visitor values('v002','p004','ghjk','fhda');
insert into visitor values('v003','p005','zxcv','polk');
insert into visitor values('v004','p002','bnmc','mnbv');
insert into visitor values('v005','p003','pioi','ytere');


REM:Inserting into info

insert into info values('if001','s001',1,'lkkj');
insert into info values('if002','s003',3,'mnv');
insert into info values('if003','s004',2,'poid');
insert into info values('if004','s005',4,'uie');
insert into info values('if005','s002',1,'htyo');



REM:Inserting into police

insert into police values(9213121330,'s001');
insert into police values(9213121440,'s002');
insert into police values(9213121130,'s003');
insert into police values(8721189722,'s002');
insert into police values(9966133485,'s004');
insert into police values(7913526338,'s005');


REM:Inserting into hospital

insert into hospital values(8345671110,'s001');
insert into hospital values(8349821110,'s002');
insert into hospital values(8341901140,'s003');
insert into hospital values(7841233667,'s004');
insert into hospital values(9345812007,'s005');	
insert into hospital values(6823699874,'s003');

REM:Inserting into login_id

insert into login_id values('sr001','tyoiu');
insert into login_id values('sr002','toupw');
insert into login_id values('sr003','123erq');
insert into login_id values('sr004','pmn**1');
insert into login_id values('sr005','$%tyf');	



REM:Inserting into sb_bank

insert into sb_bank values('BANK_A','p002',1000,0);
insert into sb_bank values('BANK_B','p002',10000,1000);
insert into sb_bank values('BANK_B','p005',5000,7500);
insert into sb_bank values('BANK_C','p005',2000,0);
insert into sb_bank values('BANK_D','p005',100000,0);

