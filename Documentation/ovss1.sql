-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: ovss1
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `adminID` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `userid` int DEFAULT NULL,
  PRIMARY KEY (`adminID`),
  KEY `FK9rwwfg97n6j2o56ndw01g5bej` (`userid`),
  CONSTRAINT `FK9rwwfg97n6j2o56ndw01g5bej` FOREIGN KEY (`userid`) REFERENCES `login` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Amit','Patil',53);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `area` (
  `areaID` int NOT NULL AUTO_INCREMENT,
  `areaNM` varchar(45) DEFAULT NULL,
  `cityID` int DEFAULT NULL,
  PRIMARY KEY (`areaID`),
  KEY `cityID_idx` (`cityID`),
  CONSTRAINT `cityID` FOREIGN KEY (`cityID`) REFERENCES `city` (`cityID`),
  CONSTRAINT `FKnwg15eeqiij6lf58j4a17tjg9` FOREIGN KEY (`cityID`) REFERENCES `city` (`cityID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
INSERT INTO `area` VALUES (1,'Chinchwad',1),(2,'Thane',2),(7,'kondhwa',1),(8,'katraj',1),(9,'kothrud',1),(10,'swargate',1);
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) DEFAULT NULL,
  `category_desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `category_name_UNIQUE` (`category_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Two Wheeler','For all two wheeler vehicles'),(2,'Four wheeler','For all four wheeler vehicles');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city` (
  `cityID` int NOT NULL AUTO_INCREMENT,
  `cityNM` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cityID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'Pune'),(2,'Mumbai');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customerID` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `middlename` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `userID` int DEFAULT NULL,
  `areaID` int DEFAULT NULL,
  PRIMARY KEY (`customerID`),
  UNIQUE KEY `contact_UNIQUE` (`contact`),
  KEY `useID_idx` (`userID`),
  KEY `areaID_idx` (`areaID`),
  CONSTRAINT `areaID` FOREIGN KEY (`areaID`) REFERENCES `area` (`areaID`),
  CONSTRAINT `FKpxb3mp6d3m81llqsmfl99esjo` FOREIGN KEY (`areaID`) REFERENCES `area` (`areaID`),
  CONSTRAINT `FKsuuqkmo6d3e6y2td3dij373ec` FOREIGN KEY (`userID`) REFERENCES `login` (`UserID`),
  CONSTRAINT `useID` FOREIGN KEY (`userID`) REFERENCES `login` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (27,'Rutuja','Sanjay','Malwadkar','718321','Pune',49,7),(32,'Rohan','Amar','Jagtap','912767','Pune',54,7),(33,'Akash','Vijay','Jadhav','234234','Pimpri',55,1),(34,'Adarsh','Vikram','Pawar','23432','Chinchwad',57,1),(35,'Madhuri','Rajesh','Shirke','873534','Pimpri',58,1),(36,'Shivani','Vitthal','Gawade','564242','Katraj',59,8),(37,'Omkar','Dnyaneshwar','Badhe','524131','Pune',61,8);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `empid` int NOT NULL AUTO_INCREMENT,
  `ownerID` int DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `joindate` date DEFAULT NULL,
  `userID` int DEFAULT NULL,
  PRIMARY KEY (`empid`),
  UNIQUE KEY `contact_UNIQUE` (`contact`),
  KEY `ownerID_idx` (`ownerID`),
  KEY `userID_idx` (`userID`),
  CONSTRAINT `FK8momei3jcvmi6c6qnabj62vvu` FOREIGN KEY (`ownerID`) REFERENCES `owner` (`ownerID`),
  CONSTRAINT `FKhrco5lw2xkbmmkksw3v886ry` FOREIGN KEY (`userID`) REFERENCES `login` (`UserID`),
  CONSTRAINT `owner_ID2` FOREIGN KEY (`ownerID`) REFERENCES `owner` (`ownerID`),
  CONSTRAINT `user_ID1` FOREIGN KEY (`userID`) REFERENCES `login` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (4,1,'Saurabh','Jagtap','Pune','7507','2022-03-10',50),(5,1,'Rohan','Bhoir','Pune','432432','2022-03-11',54),(6,3,'Vikram','Navale','Dighi','131123','2022-01-04',56),(7,5,'Shreyas','Mane','Chinchwad','755234','2022-01-09',60),(8,5,'Aditya','Gonjari','Wakad','453414','2021-10-01',62);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedbacks`
--

DROP TABLE IF EXISTS `feedbacks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedbacks` (
  `feedbackID` int NOT NULL AUTO_INCREMENT,
  `customerID` int DEFAULT NULL,
  `ownerID` int DEFAULT NULL,
  `feedback_text` varchar(45) DEFAULT NULL,
  `created_on` date DEFAULT NULL,
  PRIMARY KEY (`feedbackID`),
  KEY `customerID_idx` (`customerID`),
  KEY `ownerID_idx` (`ownerID`),
  CONSTRAINT `customer_ID2` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`),
  CONSTRAINT `owner_ID1` FOREIGN KEY (`ownerID`) REFERENCES `owner` (`ownerID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedbacks`
--

LOCK TABLES `feedbacks` WRITE;
/*!40000 ALTER TABLE `feedbacks` DISABLE KEYS */;
INSERT INTO `feedbacks` VALUES (1,27,1,'Amazing Service','2022-01-01'),(2,32,1,'Upto Expection','2021-11-03'),(3,27,3,'Poor Service','2021-10-04'),(4,32,3,'Not Great Service','2021-11-23'),(5,33,4,'Reasonable Pricing','2021-09-08'),(6,34,4,'Nice Pricing','2021-08-07'),(7,35,1,'Affordable Pricing','2021-05-03'),(8,36,4,'Great Service','2022-04-05'),(9,37,4,'Very Much Satisfied with the service provided','2021-03-06'),(10,27,5,'Great Service','2021-05-09'),(11,32,5,'Poor Service','2022-02-01'),(12,33,5,'Not Satisfied','2021-10-11'),(13,34,5,'Poor Service Provide','2021-11-11'),(14,35,5,'Disappointed with the service provided','2022-03-04'),(15,36,5,'I will not reccomment thid garage','2022-03-04'),(16,37,5,'Poor Service','2022-03-04'),(17,27,4,'Appreciate the service provided','2022-02-05'),(18,32,4,'I will reccommend this garage','2022-01-09'),(19,33,1,'Great Service','2021-11-11'),(20,34,1,'Very Much Satisfied with the service provided','2021-03-06'),(21,35,1,'Affordable Pricing','2021-05-09'),(22,36,1,'Appreciate the service provided','2021-03-06'),(23,37,1,'Great Service','2022-04-05'),(24,33,3,'I will not reccomment thid garage','2022-03-04'),(25,34,3,'Poor Service','2022-02-05'),(26,35,3,'Not Satisfied','2022-03-04'),(27,36,3,'Disappointed with the service provided','2022-01-09'),(28,37,3,'I will not reccomment thid garage','2021-05-09');
/*!40000 ALTER TABLE `feedbacks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `invoiceID` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `order_id` int DEFAULT NULL,
  `customerID` int DEFAULT NULL,
  `totalBill` float DEFAULT NULL,
  PRIMARY KEY (`invoiceID`),
  KEY `customerID_idx` (`customerID`),
  KEY `customer_ID_idx` (`customerID`),
  KEY `order_id_idx` (`order_id`),
  CONSTRAINT `customer_ID1` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`),
  CONSTRAINT `order_id` FOREIGN KEY (`order_id`) REFERENCES `service_request` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `UserID` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `isactive` int DEFAULT NULL,
  `questionID` int DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  `user_type` varchar(45) NOT NULL,
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `questionID_idx` (`questionID`),
  CONSTRAINT `FKaiasgbcnkqvc69tdqt046kjus` FOREIGN KEY (`questionID`) REFERENCES `questions` (`questionID`),
  CONSTRAINT `questionID` FOREIGN KEY (`questionID`) REFERENCES `questions` (`questionID`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (31,'shwetagarage@gmail.com','shweta',1,2,'raj','owner'),(32,'highfighauto@gmail.com','highfighauto123',1,1,'singing','owner'),(49,'rutuja@gmail.com','rutuja',1,1,'cricket','customer'),(50,'saurabh@gmail.com','saurabh',1,1,'football','employee'),(51,'harshal@gmail.com','harshal',1,1,'cricket','owner'),(53,'amit@gmail.com','amit',1,1,'crcket','admin'),(54,'rohan@gmail.com','rohan',1,1,'cricket','employee'),(55,'akash@gmail.com','akash',1,1,'cricket','customer'),(56,'vikram@gmail.com','vikram',1,1,'Hockey','employee'),(57,'adarsh@gmail.com','adarsh',1,1,'football','customer'),(58,'madhuri@gmail.com','madhuri',1,1,'tennis','customer'),(59,'shivani@gmail.com','shivani',1,1,'badminton','customer'),(60,'shreyas@gmail.com','shreyas',1,1,'football','employee'),(61,'omkar@gmail.com','omkar',1,1,'cricket','customer'),(62,'aditya@gmail.com','aditya',1,1,'hockey','employee');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `owner`
--

DROP TABLE IF EXISTS `owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `owner` (
  `ownerID` int NOT NULL AUTO_INCREMENT,
  `owner_name` varchar(45) DEFAULT NULL,
  `address_line1` varchar(45) DEFAULT NULL,
  `address_line2` varchar(45) DEFAULT NULL,
  `areaID` int DEFAULT NULL,
  `pincode` int DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `userID` int DEFAULT NULL,
  PRIMARY KEY (`ownerID`),
  UNIQUE KEY `contact_UNIQUE` (`contact`),
  KEY `areaID_idx` (`areaID`),
  KEY `userID_idx` (`userID`),
  CONSTRAINT `areaID1` FOREIGN KEY (`areaID`) REFERENCES `area` (`areaID`),
  CONSTRAINT `userID` FOREIGN KEY (`userID`) REFERENCES `login` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owner`
--

LOCK TABLES `owner` WRITE;
/*!40000 ALTER TABLE `owner` DISABLE KEYS */;
INSERT INTO `owner` VALUES (1,'Auto Services','Shop no-02,bharti building','Katraj,pune',1,411048,'18000088',32),(3,'Royal service station','Block-17,gandhi road','Kondhwa,pune',7,411047,'856224522',31),(4,'High Figh Auto Garage','Block-28,military road','Kondhwa, pune',7,411047,'88888888',32),(5,'Modern Auto Services','Pune','Pune',2,411043,'2323',51);
/*!40000 ALTER TABLE `owner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `questionID` int NOT NULL AUTO_INCREMENT,
  `question` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`questionID`),
  UNIQUE KEY `question_UNIQUE` (`question`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (2,'What is best friend name'),(4,'What is the capital of India '),(5,'What is your favorite color'),(1,'What is your hobby'),(3,'Where are you from');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `service_id` int NOT NULL AUTO_INCREMENT,
  `service_name` varchar(45) DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  PRIMARY KEY (`service_id`),
  UNIQUE KEY `service_name_UNIQUE` (`service_name`),
  KEY `category_id_idx` (`category_id`),
  CONSTRAINT `category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'Bike washing',1),(2,'Bike servicing',1),(3,'Car washing',2),(4,'Car servicing',2),(5,'Car Polishing',2),(6,'Wheel alignment',2),(7,'Engine Oil',2),(8,'Battery Change',2),(9,'Replacement of   Seat Cover',2),(10,'Replacement of seat cover',1),(11,'Brake Repair',2),(12,'Car AC Repair',2),(13,'Indicator Replacement',1),(14,'Mirror Replacement',2);
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_details`
--

DROP TABLE IF EXISTS `service_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_details` (
  `servicedetID` int NOT NULL AUTO_INCREMENT,
  `service_id` int DEFAULT NULL,
  `ownerID` int DEFAULT NULL,
  `price` float DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`servicedetID`),
  KEY `service_id_idx` (`service_id`),
  KEY `ownerID_idx` (`ownerID`),
  CONSTRAINT `ownerID` FOREIGN KEY (`ownerID`) REFERENCES `owner` (`ownerID`),
  CONSTRAINT `service_id` FOREIGN KEY (`service_id`) REFERENCES `service` (`service_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_details`
--

LOCK TABLES `service_details` WRITE;
/*!40000 ALTER TABLE `service_details` DISABLE KEYS */;
INSERT INTO `service_details` VALUES (1,1,1,400,'For bike washing'),(2,2,1,700,'For bike sevicing'),(3,1,1,350,'For bike washing'),(4,2,1,650,'For car washing'),(5,3,4,600,'For car wahing'),(6,4,4,400,'For car servicing'),(7,7,4,4900,'For Car engin oil'),(8,2,5,2500,'Serviceing'),(9,6,3,1500,'For Wheel Alignment and safety'),(10,6,1,1700,'For Wheel Alignment and safety'),(11,7,1,800,'Engine oil change'),(12,7,5,850,'Engine oil change'),(13,8,3,2500,'Battery Change'),(14,8,4,3000,'Battery Change'),(15,8,1,2700,'Battery Change'),(16,8,5,3000,'Battery Change'),(17,9,1,1200,'Seat Cover Change'),(18,9,3,1300,'Seat Cover Change'),(19,9,4,1000,'Seat Cover Change'),(20,9,5,1100,'Seat Cover Change'),(21,11,1,600,'Brake Repair'),(22,11,3,650,'Brake Repair'),(23,11,4,500,'Brake Repair'),(24,11,5,700,'Brake Repair'),(25,12,1,1300,'Car AC Repair'),(26,12,3,1350,'Car AC Repair'),(27,12,4,1400,'Car AC Repair'),(28,12,5,1200,'Car AC Repair'),(29,13,1,1600,'Indicator Replacement'),(30,13,3,1700,'Indicator Replacement'),(31,13,4,1600,'Indicator Replacement'),(32,13,5,1500,'Indiactor Replacement'),(33,14,1,1200,'Mirror Replacement'),(34,14,3,1250,'Mirror Replacement'),(35,14,4,1400,'Mirror Replacement'),(36,14,5,1350,'Mirror Replacement');
/*!40000 ALTER TABLE `service_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_request`
--

DROP TABLE IF EXISTS `service_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_request` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `customerID` int DEFAULT NULL,
  `ownerID` int DEFAULT NULL,
  `vehicleID` int DEFAULT NULL,
  `emp_id` int DEFAULT NULL,
  `order_status` varchar(45) DEFAULT NULL,
  `requested_date` date DEFAULT NULL,
  `servicing_date` date DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `customerID_idx` (`customerID`),
  KEY `ownerID_idx` (`ownerID`),
  KEY `vehicleID_idx` (`vehicleID`),
  KEY `emp_id_idx` (`emp_id`),
  CONSTRAINT `customer_ID4` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`),
  CONSTRAINT `emp_id` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`empid`),
  CONSTRAINT `owner_ID3` FOREIGN KEY (`ownerID`) REFERENCES `owner` (`ownerID`),
  CONSTRAINT `vehicle_ID3` FOREIGN KEY (`vehicleID`) REFERENCES `vehicle_details` (`vehicleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_request`
--

LOCK TABLES `service_request` WRITE;
/*!40000 ALTER TABLE `service_request` DISABLE KEYS */;
INSERT INTO `service_request` VALUES (4,27,4,14,NULL,'Not Assigned','2022-04-13','2022-04-13');
/*!40000 ALTER TABLE `service_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_request_details`
--

DROP TABLE IF EXISTS `service_request_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_request_details` (
  `ser_req_det_id` int NOT NULL AUTO_INCREMENT,
  `order_id` int DEFAULT NULL,
  `service_id` int DEFAULT NULL,
  PRIMARY KEY (`ser_req_det_id`),
  KEY `order_id_idx` (`order_id`),
  KEY `service_id_idx` (`service_id`),
  CONSTRAINT `order_id3` FOREIGN KEY (`order_id`) REFERENCES `service_request` (`order_id`),
  CONSTRAINT `service_id3` FOREIGN KEY (`service_id`) REFERENCES `service` (`service_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_request_details`
--

LOCK TABLES `service_request_details` WRITE;
/*!40000 ALTER TABLE `service_request_details` DISABLE KEYS */;
INSERT INTO `service_request_details` VALUES (8,4,3),(9,4,4),(10,4,7);
/*!40000 ALTER TABLE `service_request_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `stockID` int NOT NULL AUTO_INCREMENT,
  `stock_name` varchar(45) DEFAULT NULL,
  `stock_price` float DEFAULT NULL,
  `stock_qty` int DEFAULT NULL,
  PRIMARY KEY (`stockID`),
  UNIQUE KEY `stock_name_UNIQUE` (`stock_name`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,'Tyres',10000,13),(2,'Cable Cutters',2000,7),(3,'Pneumatic Hanger',24000,2),(4,'Screw Drivers',200,7),(5,'Battery Chargerl',1500,4),(6,'Welding Machine',1500,6),(7,'Hammer',200,3),(8,'Grease',250,5),(9,'Tyre Changer',2000,3),(10,'Vehicle Washer',2000,5),(11,'Vacuum Cleaner',2000,4),(12,'Cusion Accessories',3000,5);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_details`
--

DROP TABLE IF EXISTS `vehicle_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_details` (
  `vehicleID` int NOT NULL AUTO_INCREMENT,
  `customerID` int DEFAULT NULL,
  `vehiclenumber` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `vehicle_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vehicleID`),
  UNIQUE KEY `vehiclenumber_UNIQUE` (`vehiclenumber`),
  KEY `customerID_idx` (`customerID`),
  CONSTRAINT `customerID` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`),
  CONSTRAINT `FKc35db9cy6npm85th0ga44b4yt` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_details`
--

LOCK TABLES `vehicle_details` WRITE;
/*!40000 ALTER TABLE `vehicle_details` DISABLE KEYS */;
INSERT INTO `vehicle_details` VALUES (14,27,'MH-12 GH 6455','bajaj','pulsar','two wheeler'),(15,27,'MH-14 FF1234','TVS','Apache','two wheeler');
/*!40000 ALTER TABLE `vehicle_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-14 17:47:08
