-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: renewx
-- ------------------------------------------------------
-- Server version	8.0.41

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
-- Table structure for table `datospersonales`
--

DROP TABLE IF EXISTS `datospersonales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datospersonales` (
  `iddatospersonales` int NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(255) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `pais_origen` varchar(155) NOT NULL,
  `pais_residencia` varchar(155) NOT NULL,
  `ciudad_residencia` varchar(155) NOT NULL,
  `genero` varchar(45) NOT NULL,
  PRIMARY KEY (`iddatospersonales`),
  UNIQUE KEY `cedula` (`cedula`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datospersonales`
--

LOCK TABLES `datospersonales` WRITE;
/*!40000 ALTER TABLE `datospersonales` DISABLE KEYS */;
INSERT INTO `datospersonales` VALUES (1,'María González Pérez','V-12345678','Av. Principal #123, Urb. Las Acacias','+58 412 5551234','Venezuela','España','Madrid','Femenino'),(2,'Juan Carlos López Martínez','E-87654321','Calle Gran Vía 45, 3ºB','+34 91 5556789','España','España','Madrid','Masculino'),(3,'Ana Patricia Fernández','V-23456789','Carrera 15 #23-45','+57 1 5554321','Colombia','Colombia','Bogotá','Femenino'),(4,'Luis Miguel Ramírez','M-34567890','Paseo de la Reforma 505','+52 55 5558765','México','México','Ciudad de México','Masculino'),(5,'Sofía Alejandra Torres','V-45678901','Calle 72 #11-10','+57 1 5559876','Venezuela','Colombia','Bogotá','Femenino'),(6,'Carlos Andrés Herrera','P-56789012','Av. Arequipa 1234','+51 1 5556543','Perú','Perú','Lima','Masculino'),(7,'Laura Valentina Mendoza','V-67890123','Av. Corrientes 123','+54 11 5553210','Venezuela','Argentina','Buenos Aires','Femenino'),(8,'Pedro José Rojas','C-78901234','Calle 8 #5-30','+53 7 5557890','Cuba','Cuba','La Habana','Masculino'),(9,'Gabriela Isabel Silva','V-89012345','Av. Paulista 900','+55 11 5554567','Venezuela','Brasil','São Paulo','Femenino'),(10,'Jorge Enrique Castro','A-90123456','Av. 6 de Diciembre N24-156','+593 2 5551234','Argentina','Ecuador','Quito','Masculino');
/*!40000 ALTER TABLE `datospersonales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-29  8:26:42
