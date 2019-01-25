#!/bin/sh
 
set -e
 
./wait-for-it.sh db:3306 --timeout=30 --strict -- echo "db is up"
 
java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
