# data-connection
aaaaa
## Summary
1. JDBC connection
2. Hibernate
3. Database installation

## 1. JDBC connection 


## 2. Hibernate

## 3.2 Database installation
### 3.2.1 H2
No installation is required. The spring.datasource.url is the one required property which should be set. By default, the username is sa with empty password. Two modes: in memory and file storage. See the application.properties file for more details related configuration. To access default H2 Console use this link: http://localhost:8081/h2-console/ , where 8081 is the server port.
Into JDBC URL text area, fill the database name: `./data/db`

### 3.2.2 MySQL
CREATE DATABSE fms;
Note: in case that you run the application starting with MySQL 8.0.4, please execute the following query:

ALTER USER '${USER}'@'localhost' IDENTIFIED WITH mysql_native_password BY '${PASSWORD}';
-- where ${USER} and ${PASSWORD} should be provided.

### 3.2.3 Postgres
Install PostgreSQL. It is required to create a database:

Please, run the following commands if it is the case:

createuser -U postgres -s Progress
Please, run the following command to import a database (if it is the case):

pg_restore -d DATABASE_NAME <  PATH/BACKUP_FILE_NAME.sql