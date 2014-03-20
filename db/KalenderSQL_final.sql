CREATE DATABASE  IF NOT EXISTS `kalender` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `kalender`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: kalender
-- ------------------------------------------------------
-- Server version	5.6.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ansatt`
--

DROP TABLE IF EXISTS `ansatt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ansatt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brukernavn` varchar(16) DEFAULT NULL,
  `epost` varchar(255) DEFAULT NULL,
  `passord` varchar(256) DEFAULT NULL,
  `navn` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `brukernavn_UNIQUE` (`brukernavn`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ansatt`
--

LOCK TABLES `ansatt` WRITE;
/*!40000 ALTER TABLE `ansatt` DISABLE KEYS */;
INSERT INTO `ansatt` VALUES (1,'test','test@test.ts','a94a8fe5ccb19ba61c4c0873d391e987982fbbd3','Sondre Steinsland Hegdal'),(2,'trunks','test@test.ts','a94a8fe5ccb19ba61c4c0873d391e987982fbbd3','Sondre Steinsland Hegdal'),(3,'trundks','test@test.ts','a94a8fe5ccb19ba61c4c0873d391e987982fbbd3','Sondre Steinsland Hegdal'),(4,'trusndks','test@test.ts','a94a8fe5ccb19ba61c4c0873d391e987982fbbd3','Sondre Steinsland Hegdal'),(5,'trusnsddks','test@test.ts','a94a8fe5ccb19ba61c4c0873d391e987982fbbd3','Sondre Steinsland Hegdal'),(6,'ingenState','test@test.ts','a94a8fe5ccb19ba61c4c0873d391e987982fbbd3','Sondre Steinsland Hegdal'),(7,'Sour','sunmaid@1337.no','40bd001563085fc35165329ea1ff5c5ecbdbbeef','Audun'),(8,'1','1','1','1');
/*!40000 ALTER TABLE `ansatt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `avtale`
--

DROP TABLE IF EXISTS `avtale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `avtale` (
  `avtaleid` int(11) NOT NULL AUTO_INCREMENT,
  `sted` varchar(20) DEFAULT NULL,
  `starttid` datetime DEFAULT NULL,
  `sluttid` datetime DEFAULT NULL,
  `beskrivelse` text,
  `eierid` int(11) NOT NULL,
  `c_sted` varchar(20) DEFAULT NULL,
  UNIQUE KEY `avtaleid_UNIQUE` (`avtaleid`),
  KEY `fk_sted_idx` (`sted`),
  KEY `fk_haropprettet_idx` (`eierid`),
  CONSTRAINT `fk_avtale_sted` FOREIGN KEY (`sted`) REFERENCES `sted` (`romnr`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_haropprettet` FOREIGN KEY (`eierid`) REFERENCES `ansatt` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avtale`
--

LOCK TABLES `avtale` WRITE;
/*!40000 ALTER TABLE `avtale` DISABLE KEYS */;
INSERT INTO `avtale` VALUES (2,'Boden','2014-03-18 00:00:00','2014-03-18 00:00:00','Sondre Steinsland Hegdal',2,NULL),(3,NULL,'2014-03-18 00:00:00','2014-03-18 00:00:00','Sondre Steinsland Hegdal',2,'Bodeghn'),(4,'Boden','1970-01-01 00:00:00','1970-01-01 00:00:00','Sondre Steinsland Hegdal',2,NULL),(5,'Boden','1970-01-01 00:00:00','1970-01-01 00:00:00','Sondre Steinsland Hegdal',2,NULL);
/*!40000 ALTER TABLE `avtale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gruppe`
--

DROP TABLE IF EXISTS `gruppe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gruppe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gruppenr` varchar(20) NOT NULL,
  `epost` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `gruppenr_UNIQUE` (`gruppenr`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gruppe`
--

LOCK TABLES `gruppe` WRITE;
/*!40000 ALTER TABLE `gruppe` DISABLE KEYS */;
INSERT INTO `gruppe` VALUES (1,'best',NULL);
/*!40000 ALTER TABLE `gruppe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invitert_avtale`
--

DROP TABLE IF EXISTS `invitert_avtale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invitert_avtale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ansattid` int(11) NOT NULL,
  `avtaleid` int(11) NOT NULL,
  `skal_komme` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_avtale_idx` (`avtaleid`),
  KEY `fk_ansatt_invitert_idx` (`ansattid`),
  CONSTRAINT `fk_ansatt_invitert` FOREIGN KEY (`ansattid`) REFERENCES `ansatt` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_avtale` FOREIGN KEY (`avtaleid`) REFERENCES `avtale` (`avtaleid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invitert_avtale`
--

LOCK TABLES `invitert_avtale` WRITE;
/*!40000 ALTER TABLE `invitert_avtale` DISABLE KEYS */;
/*!40000 ALTER TABLE `invitert_avtale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medlem_av`
--

DROP TABLE IF EXISTS `medlem_av`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medlem_av` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `medlemid` int(11) NOT NULL,
  `gruppeid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_gruppe_idx` (`gruppeid`),
  KEY `fk_ansatt_idx` (`medlemid`),
  CONSTRAINT `fk_gruppe` FOREIGN KEY (`gruppeid`) REFERENCES `gruppe` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_medlem` FOREIGN KEY (`medlemid`) REFERENCES `ansatt` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medlem_av`
--

LOCK TABLES `medlem_av` WRITE;
/*!40000 ALTER TABLE `medlem_av` DISABLE KEYS */;
INSERT INTO `medlem_av` VALUES (1,7,1),(2,6,1);
/*!40000 ALTER TABLE `medlem_av` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sted`
--

DROP TABLE IF EXISTS `sted`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sted` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `romnr` varchar(20) NOT NULL,
  `antallplasser` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `romnr_UNIQUE` (`romnr`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sted`
--

LOCK TABLES `sted` WRITE;
/*!40000 ALTER TABLE `sted` DISABLE KEYS */;
INSERT INTO `sted` VALUES (1,'Boden',42),(2,'Røykehjørnet',7);
/*!40000 ALTER TABLE `sted` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sted_tilgjengelig`
--

DROP TABLE IF EXISTS `sted_tilgjengelig`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sted_tilgjengelig` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `romnr` varchar(45) NOT NULL,
  `avtaleid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_romnr_idx` (`romnr`),
  KEY `fk_avtaleid_sted_idx` (`avtaleid`),
  CONSTRAINT `fk_avtaleid_sted` FOREIGN KEY (`avtaleid`) REFERENCES `avtale` (`avtaleid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_romnr` FOREIGN KEY (`romnr`) REFERENCES `sted` (`romnr`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sted_tilgjengelig`
--

LOCK TABLES `sted_tilgjengelig` WRITE;
/*!40000 ALTER TABLE `sted_tilgjengelig` DISABLE KEYS */;
/*!40000 ALTER TABLE `sted_tilgjengelig` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `varsel`
--

DROP TABLE IF EXISTS `varsel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `varsel` (
  `varselid` int(11) NOT NULL AUTO_INCREMENT,
  `melding` text,
  `avtaleid` int(11) NOT NULL,
  `tidspunkt` datetime DEFAULT NULL,
  PRIMARY KEY (`varselid`),
  UNIQUE KEY `varselid_UNIQUE` (`varselid`),
  KEY `fk_avtale_varsel_idx` (`avtaleid`),
  CONSTRAINT `fk_avtale_varsel` FOREIGN KEY (`avtaleid`) REFERENCES `avtale` (`avtaleid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `varsel`
--

LOCK TABLES `varsel` WRITE;
/*!40000 ALTER TABLE `varsel` DISABLE KEYS */;
/*!40000 ALTER TABLE `varsel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-20 15:13:00
