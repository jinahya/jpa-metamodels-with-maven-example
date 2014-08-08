#!/bin/sh
mvn -Phibernate-as-dependency clean package
mvn -Phibernate-by-processor clean package
mvn -Popenjpa-as-dependency clean package
mvn -Popenjpa-by-processor clean package
mvn -Peclipselink-as-dependency clean package
mvn -Peclipselink-by-processor clean package
mvn -Pdatanucleus-as-dependency clean package
mvn -Pdatanucleus-by-processor clean package
#mvn -Pbatoojpa1 (Active: false , Source: pom)
#mvn -Pbatoojpa2 (Active: false , Source: pom)
