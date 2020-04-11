FROM mysql:5.7

COPY orderdb.sql /docker-entrypoint-initdb.d/orderdb.sql

ENV MYSQL_DATABASE=orderdb MYSQL_USER=mahendra  MYSQL_PASSWORD=pass@1234 MYSQL_ROOT_PASSWORD=pass@12345

