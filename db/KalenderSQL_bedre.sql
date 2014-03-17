CREATE DATABASE  IF NOT EXISTS `kalender` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `kalender`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: kalender
-- ------------------------------------------------------
-- Server version	5.6.16-log

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
  `passord` varchar(32) DEFAULT NULL,
  `navn` varchar(45) DEFAULT NULL,
  `invitertAvtale` int(11) NOT NULL,
  `medlemav` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `brukernavn_UNIQUE` (`brukernavn`),
  KEY `fk_medlemav_idx` (`medlemav`),
  CONSTRAINT `fk_inviterttil` FOREIGN KEY (`id`) REFERENCES `avtale` (`eierid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_medlemav` FOREIGN KEY (`medlemav`) REFERENCES `gruppe` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ansatt`
--

LOCK TABLES `ansatt` WRITE;
/*!40000 ALTER TABLE `ansatt` DISABLE KEYS */;
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
  `starttid` time DEFAULT NULL,
  `sluttid` time DEFAULT NULL,
  `dato` date DEFAULT NULL,
  `beskrivelse` text,
  `eierid` int(11) NOT NULL,
  UNIQUE KEY `avtaleid_UNIQUE` (`avtaleid`),
  KEY `fk_sted_idx` (`sted`),
  KEY `fk_haropprettet_idx` (`eierid`),
  CONSTRAINT `fk_sted` FOREIGN KEY (`sted`) REFERENCES `sted` (`romnr`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_haropprettet` FOREIGN KEY (`eierid`) REFERENCES `ansatt` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avtale`
--

LOCK TABLES `avtale` WRITE;
/*!40000 ALTER TABLE `avtale` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gruppe`
--

LOCK TABLES `gruppe` WRITE;
/*!40000 ALTER TABLE `gruppe` DISABLE KEYS */;
/*!40000 ALTER TABLE `gruppe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `state` (
  `id` int(11) NOT NULL,
  `value` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sted`
--

LOCK TABLES `sted` WRITE;
/*!40000 ALTER TABLE `sted` DISABLE KEYS */;
/*!40000 ALTER TABLE `sted` ENABLE KEYS */;
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

-- Dump completed on 2014-03-16 19:03:03
