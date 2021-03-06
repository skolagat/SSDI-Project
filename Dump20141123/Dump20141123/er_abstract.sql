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
-- Table structure for table `abstract`
--

DROP TABLE IF EXISTS `abstract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `abstract` (
  `id` int(11) NOT NULL,
  `conferenceid` int(11) NOT NULL,
  `authorusername` varchar(40) NOT NULL,
  `title` varchar(30) NOT NULL,
  `keywords` varchar(30) NOT NULL,
  `abstract` varchar(1200) NOT NULL,
  `status` varchar(30) NOT NULL,
  `comments` varchar(40) DEFAULT NULL,
  `Date_submitted` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `conferenceid` (`conferenceid`),
  KEY `authorusername` (`authorusername`),
  CONSTRAINT `abstract_ibfk_1` FOREIGN KEY (`conferenceid`) REFERENCES `listofconferences` (`id`),
  CONSTRAINT `abstract_ibfk_2` FOREIGN KEY (`authorusername`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abstract`
--

LOCK TABLES `abstract` WRITE;
/*!40000 ALTER TABLE `abstract` DISABLE KEYS */;
INSERT INTO `abstract` VALUES (1,1,'csankar1','Robotics','Line Follower','Robot','Accept','','2015-11-15'),(2,1,'csankar1','abcq','wqserty','vscrty','Reject','  ','2015-11-15'),(3,1,'csankar1','zvdsv','ddfd','dvdv','Accept','','2014-11-22'),(4,1,'csankar1','gerg','grgr','frfr','underreview','','2014-11-22'),(5,1,'csankar1','qwer','dsafa','badkad','Accept','','2014-11-22');
/*!40000 ALTER TABLE `abstract` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-23 22:25:39
