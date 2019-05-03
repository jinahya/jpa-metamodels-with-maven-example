# jpa-metamodels-with-maven-example

[![Build Status](https://travis-ci.org/jinahya/jpa-metamodels-with-maven-example.svg?branch=develop)](https://travis-ci.org/jinahya/jpa-metamodels-with-maven-example)

An example generates JPA Metamodels with Apache Maven.

# EclipseLink aaa

## `eclipselink-dependency`
Uses `org.eclipselink.persistence:org.eclipselink.persistence.jpa.modelgen.processor` as an optional dependency.

## `eclipselink-processor`
Uses `org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor` from `org.eclipselink.persistence:org.eclipselink.persistence.jpa.modelgen.processor` as an annotation processor.

* Note that a compiler argument(`-Aeclipselink.persistencexml`) of the location of `persistence.xml` is required.

# Hibernate

## `hibernate-dependency`
Uses `org.hibernate:hibernate-jpamodelgen` as an optional dependency.

## `hibernate-processor`
Uses `org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor` from `org.hibernate:hibernate-jpamodelgen` as an annotation processor.
* Note that `javax.xml.bind.jaxb-api` is required.

# OpenJPA

## `openjpa-dependency`
Uses `org.apache.openjpa:openjpa` as an optional dependency.
* Note that `javax.annotation:javax:annotation-api` is required.
* And a compier argument(`-Aopenjpa.metamodel`) must be set.

## `openjpa-processor`
Uses `org.apache.openjpa.persistence.meta.AnnotationProcessor6` of `org.apache.openjpa:openjpa` as an annotation processor.

# DataNucleus

## `datanucleus-dependency`
Uses `org.datanucleus:datanucleus-jpa-query` as an optional dependency.

## `datanucleus-processor`
Uses `org.datanucleus.jpa.query.JPACriteriaProcessor` from `org.datanucleus:datanucleus-jpa-query` as an annotation processor.


