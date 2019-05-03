#!/bin/sh
mvn -Phibernate-dependency clean package
mvn -Phibernate-processor clean package
mvn -Popenjpa-dependency clean package
mvn -Popenjpa-processor clean package
mvn -Peclipselink-dependency clean package
mvn -Peclipselink-processor clean package
mvn -Pdatanucleus-dependency clean package
mvn -Pdatanucleus-processor clean package
