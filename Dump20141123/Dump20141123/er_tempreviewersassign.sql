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
-- Table structure for table `tempreviewersassign`
--

DROP TABLE IF EXISTS `tempreviewersassign`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tempreviewersassign` (
  `tid` int(11) NOT NULL,
  `paperid` int(11) DEFAULT NULL,
  `ruser1` varchar(40) DEFAULT NULL,
  `statusofreviewers` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`tid`),
  KEY `ruser1` (`ruser1`),
  KEY `paperid` (`paperid`),
  CONSTRAINT `tempreviewersassign_ibfk_1` FOREIGN KEY (`ruser1`) REFERENCES `login` (`username`),
  CONSTRAINT `tempreviewersassign_ibfk_2` FOREIGN KEY (`paperid`) REFERENCES `paper` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempreviewersassign`
--

LOCK TABLES `tempreviewersassign` WRITE;
/*!40000 ALTER TABLE `tempreviewersassign` DISABLE KEYS */;
INSERT INTO `tempreviewersassign` VALUES (1,1,'chandy','Accept'),(2,1,'sash','Accept'),(3,2,'rohit','Accept'),(4,2,'sash','pending'),(5,3,'rohit','pending');
/*!40000 ALTER TABLE `tempreviewersassign` ENABLE KEYS */;
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
