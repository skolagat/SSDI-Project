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
-- Table structure for table `reviewerdetails`
--

DROP TABLE IF EXISTS `reviewerdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reviewerdetails` (
  `firstname` varchar(40) NOT NULL,
  `lastname` varchar(40) NOT NULL,
  `username` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `primary_area_of_interest` varchar(40) NOT NULL,
  `secondary_of_interest` varchar(40) NOT NULL,
  `chairname` varchar(30) NOT NULL,
  PRIMARY KEY (`email`),
  KEY `username` (`username`),
  KEY `test_idx` (`chairname`),
  CONSTRAINT `reviewerdetails_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  CONSTRAINT `test` FOREIGN KEY (`chairname`) REFERENCES `login` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviewerdetails`
--

LOCK TABLES `reviewerdetails` WRITE;
/*!40000 ALTER TABLE `reviewerdetails` DISABLE KEYS */;
INSERT INTO `reviewerdetails` VALUES ('chandar','sankar','chandy','chandrachudeswaran@gmail.com','big data','network','chandar'),('Rohit','Bansod','rohit','rabansod.15@gmail.com','big data','mining','chandar'),('Sashank','Santhanam','sash','sashank.6592@gmail.com','big data','data mining','chandar');
/*!40000 ALTER TABLE `reviewerdetails` ENABLE KEYS */;
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
