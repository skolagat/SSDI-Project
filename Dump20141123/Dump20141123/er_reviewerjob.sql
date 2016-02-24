CREATE DATABASE  IF NOT EXISTS `er` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `er`;
-- MySQL dump 10.13  Distrib 5.6.19, for Win32 (x86)
--
-- Host: localhost    Database: er
-- ------------------------------------------------------
-- Server version	5.6.20-enterprise-commercial-advanced

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
-- Table structure for table `reviewerjob`
--

DROP TABLE IF EXISTS `reviewerjob`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reviewerjob` (
  `jobid` int(11) NOT NULL,
  `cid` int(11) DEFAULT NULL,
  `chairname` varchar(40) DEFAULT NULL,
  `reviewname` varchar(50) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`jobid`),
  KEY `cid` (`cid`),
  KEY `chairname` (`chairname`),
  KEY `reviewname` (`reviewname`),
  KEY `pid` (`pid`),
  CONSTRAINT `reviewerjob_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `listofconferences` (`id`),
  CONSTRAINT `reviewerjob_ibfk_2` FOREIGN KEY (`chairname`) REFERENCES `login` (`username`),
  CONSTRAINT `reviewerjob_ibfk_3` FOREIGN KEY (`reviewname`) REFERENCES `login` (`username`),
  CONSTRAINT `reviewerjob_ibfk_4` FOREIGN KEY (`pid`) REFERENCES `paper` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviewerjob`
--

LOCK TABLES `reviewerjob` WRITE;
/*!40000 ALTER TABLE `reviewerjob` DISABLE KEYS */;
INSERT INTO `reviewerjob` VALUES (1,1,'chandar','sash',1),(2,1,'chandar','chandy',1),(3,1,'chandar','rohit',1),(4,1,'chandar','rohit',2);
/*!40000 ALTER TABLE `reviewerjob` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-23 22:25:40
