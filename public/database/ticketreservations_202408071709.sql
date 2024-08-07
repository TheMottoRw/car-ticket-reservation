-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: localhost    Database: ticketreservations
-- ------------------------------------------------------
-- Server version	8.0.36-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `destinations`
--

DROP TABLE IF EXISTS `destinations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destinations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `company_id` int DEFAULT NULL,
  `departure` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `arrival` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `price` int DEFAULT NULL,
  `created_at` bigint DEFAULT NULL,
  `updated_at` bigint DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `deleted_at` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destinations`
--

LOCK TABLES `destinations` WRITE;
/*!40000 ALTER TABLE `destinations` DISABLE KEYS */;
INSERT INTO `destinations` VALUES (1,3,'Muhanga','Kigali',1760,1720257511,1720257511,0,1720258885),(2,3,'Nyamagabe','Ruhango',1720,1720258033,1720258777,0,1720260711),(3,4,'Kigali','Nyagatare',4500,1720262856,1720262856,0,1720262856),(4,4,'Huye','Kigali',2700,1721572299,1721572299,0,1721572299),(5,4,'Musanze','Rubavu',1200,1721572314,1721572314,0,1721572314);
/*!40000 ALTER TABLE `destinations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driving`
--

DROP TABLE IF EXISTS `driving`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driving` (
  `id` int NOT NULL AUTO_INCREMENT,
  `company_id` int DEFAULT NULL,
  `destination_id` int DEFAULT NULL,
  `bus_plate_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `departure_date` bigint DEFAULT NULL,
  `departure_time` time DEFAULT NULL,
  `passenger_limit` int DEFAULT NULL,
  `driver_id` int DEFAULT NULL,
  `status` enum('arrived','pending') COLLATE utf8mb4_general_ci DEFAULT 'pending',
  `created_at` bigint DEFAULT NULL,
  `updated_at` bigint DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `deleted_at` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `destination_id` (`destination_id`),
  KEY `driver_id` (`driver_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driving`
--

LOCK TABLES `driving` WRITE;
/*!40000 ALTER TABLE `driving` DISABLE KEYS */;
/*!40000 ALTER TABLE `driving` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `passenger_id` int DEFAULT NULL,
  `schedule_id` int DEFAULT NULL,
  `pickup_station` int DEFAULT NULL,
  `price` int DEFAULT '0',
  `status` enum('active','cancelled') COLLATE utf8mb4_general_ci DEFAULT 'active',
  `created_at` bigint DEFAULT NULL,
  `updated_at` bigint DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `deleted_at` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `passenger_id` (`passenger_id`),
  KEY `schedule_id` (`schedule_id`),
  KEY `pickup_station` (`pickup_station`),
  CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`passenger_id`) REFERENCES `users` (`id`),
  CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`schedule_id`) REFERENCES `schedules` (`id`),
  CONSTRAINT `reservations_ibfk_3` FOREIGN KEY (`pickup_station`) REFERENCES `stations` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
INSERT INTO `reservations` VALUES (1,6,1,4,4500,'active',1722950357,1722950357,0,1722951987);
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedules`
--

DROP TABLE IF EXISTS `schedules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedules` (
  `id` int NOT NULL AUTO_INCREMENT,
  `company_id` int DEFAULT NULL,
  `destination_id` int DEFAULT NULL,
  `bus_plate_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `departure_date` bigint DEFAULT NULL,
  `departure_time` time DEFAULT NULL,
  `passenger_limit` int DEFAULT NULL,
  `driver_id` int DEFAULT NULL,
  `status` enum('open','closed') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT 'closed',
  `created_at` bigint DEFAULT NULL,
  `updated_at` bigint DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `deleted_at` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `destination_id` (`destination_id`),
  KEY `driver_id` (`driver_id`),
  CONSTRAINT `schedules_ibfk_1` FOREIGN KEY (`destination_id`) REFERENCES `destinations` (`id`),
  CONSTRAINT `schedules_ibfk_2` FOREIGN KEY (`driver_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedules`
--

LOCK TABLES `schedules` WRITE;
/*!40000 ALTER TABLE `schedules` DISABLE KEYS */;
INSERT INTO `schedules` VALUES (1,4,3,'RAB12ST',1724793300,NULL,22,7,'closed',1720265840,1723023000,0,1720265840),(2,4,3,'RAD23T',1721916000,NULL,30,NULL,'closed',1720267114,1720267114,1,1720267182),(3,4,4,'RAD 210 Q',1723742940,NULL,25,7,'closed',1721572353,1723022993,0,1721572353),(4,4,5,'RAE011F',1726768800,NULL,18,7,'closed',1721572377,1723022986,0,1721572377),(5,4,5,'RAD12S',1726156800,NULL,15,7,'closed',1722953996,1723022979,0,1722953996);
/*!40000 ALTER TABLE `schedules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stations`
--

DROP TABLE IF EXISTS `stations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `destination_id` int DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `previous` int DEFAULT NULL,
  `created_at` bigint DEFAULT NULL,
  `updated_at` bigint DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `deleted_at` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `destination_id` (`destination_id`),
  KEY `previous` (`previous`),
  CONSTRAINT `stations_ibfk_1` FOREIGN KEY (`destination_id`) REFERENCES `destinations` (`id`),
  CONSTRAINT `stations_ibfk_2` FOREIGN KEY (`previous`) REFERENCES `stations` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stations`
--

LOCK TABLES `stations` WRITE;
/*!40000 ALTER TABLE `stations` DISABLE KEYS */;
INSERT INTO `stations` VALUES (1,3,'Kayonza',NULL,1720263400,1720263400,1,1720263894),(2,3,'Kabuga',NULL,1720263904,1720264610,1,1720264621),(3,3,'Kayonza',6,1720263960,1722954325,0,1720263960),(4,3,'Rwamagana',3,1722946724,1722946724,0,1722946724),(5,3,'Nyabugogo',NULL,1722954133,1722954232,0,1722954133),(6,3,'Kabuga',5,1722954305,1722954305,0,1722954305),(7,3,'Kirehe',4,1722955134,1722955134,0,1722955134);
/*!40000 ALTER TABLE `stations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_type` enum('admin','company','passenger','driver') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT 'passenger',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `is_verified` tinyint(1) DEFAULT '0',
  `reset_verification_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '',
  `reset_verification_code_expiration` int DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `address` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
  `last_login` bigint DEFAULT NULL,
  `company_id` int DEFAULT NULL,
  `created_at` bigint DEFAULT NULL,
  `updated_at` bigint DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `deleted_at` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `company_id` (`company_id`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Administrator','admin@yopmail.com','0780000001','admin','$2a$12$YSfNNYEcYuObHEfVuGXrLutSmrTo74APxMcdgWbMcdmUoVpsPVy.G',1,'201287',1720251154,'active',NULL,1722946645,NULL,1720249290,1720249290,0,1720249290),(2,'Tundra','tundra@yopmail.com','0726154856','company','$2a$12$Z7v1FFkopS6nSBU0OgrGxOjNRpCLIA6gCGCzShwFQd/dFo2Okq55m',1,'iSSL5C',1720252033,'active',NULL,0,NULL,1720250233,1720250233,0,1720250233),(3,'Management  Keran Trippier','keran@yopmail.com','0726153272','company','$2a$12$aADRXFte.bH.os7HaFqUo.RoJRHqa4aWk.9Z4bY3l7eti8Rfmbf7m',1,'NYPiY1',1720252087,'active',NULL,1720250300,NULL,1720250287,1720250287,0,1720250287),(4,'CRVentures','crv@yopmail.com','0726153263','company','$2a$12$JeXSgthP3f3493/HOmR8C.xTuW8Xs7VjPw5FDe.IixsHuO5AtuF/m',1,'C7uWkj',1720262187,'active',NULL,1723022329,NULL,1720260387,1720260387,0,1720260864),(5,'Karere','karere@yopmail.com','0726152478','driver','$2a$12$5ZLyP/K4ZTCMNCOBei9L0.8C2qlB1sr/CO0274QYVGY7XlO5UuOR2',1,'C6ji47',1722364862,'active',NULL,0,NULL,1722363062,1722363062,0,1722363062),(6,'Asua','asua@yopmail.com','0726153048','passenger','$2a$12$c9ncHm0/HtpAMbqlhK0Cue.432SVknpUVNTejygOXqSU4B2.lnX9S',1,'hh0qDl',1722950533,'active',NULL,1723042856,NULL,1722948733,1722948733,0,1722948733),(7,'Patrick byiringiro','patrick@yopmail.com','0726156487','driver','$2a$12$S3P2sHIyQ7/v3Ng4M6IHNee20BIMZQ.Z0gCJQepselZUnK8DH0L0q',1,'mdosfK',1722955686,'active',NULL,1723037591,4,1722953886,1722953886,0,1722953886);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-07 17:10:07
