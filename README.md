# SpringBootWebLogic
Sample Springboot Application with JNDI DataSource ready to deploy on Oracle Weblogic Server (Oracle DB DataSource)

Create table:
create table test1.REGIONS(REGION_ID NUMERIC not null, REGION_NAME varchar(25));

Insert Data:
insert into test1.REGIONS(REGION_ID, REGION_NAME) values(1,'xiaohua');


Weblogic DataSource JNDI Name:
jdbc/spring-boot-test-DS