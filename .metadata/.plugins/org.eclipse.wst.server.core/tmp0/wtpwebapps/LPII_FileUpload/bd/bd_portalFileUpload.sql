CREATE DATABASE  IF NOT EXISTS `portal` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `portal`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: portal
-- ------------------------------------------------------
-- Server version	5.6.23-log

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
-- Table structure for table `tb_acceso`
--

DROP TABLE IF EXISTS `tb_acceso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_acceso` (
  `cod_men` smallint(6) NOT NULL DEFAULT '0',
  `cod_usu` smallint(6) NOT NULL DEFAULT '0',
  PRIMARY KEY (`cod_men`,`cod_usu`),
  KEY `cod_usu` (`cod_usu`),
  CONSTRAINT `tb_acceso_ibfk_1` FOREIGN KEY (`cod_men`) REFERENCES `tb_menu` (`cod_men`),
  CONSTRAINT `tb_acceso_ibfk_2` FOREIGN KEY (`cod_usu`) REFERENCES `tb_usuario` (`cod_usu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_acceso`
--

LOCK TABLES `tb_acceso` WRITE;
/*!40000 ALTER TABLE `tb_acceso` DISABLE KEYS */;
INSERT INTO `tb_acceso` VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(1,2),(2,2),(3,2),(4,2),(6,2),(2,3),(4,3),(2,4),(4,4);
/*!40000 ALTER TABLE `tb_acceso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_categoria`
--

DROP TABLE IF EXISTS `tb_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_categoria` (
  `cod_cat` smallint(6) NOT NULL AUTO_INCREMENT,
  `des_cat` varchar(30) DEFAULT NULL,
  `est_cat` char(1) DEFAULT NULL,
  PRIMARY KEY (`cod_cat`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_categoria`
--

LOCK TABLES `tb_categoria` WRITE;
/*!40000 ALTER TABLE `tb_categoria` DISABLE KEYS */;
INSERT INTO `tb_categoria` VALUES (1,'Pulsera','1'),(2,'Aretes','1'),(3,'Anillos','1');
/*!40000 ALTER TABLE `tb_categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_cliente` (
  `cod_cli` smallint(6) NOT NULL AUTO_INCREMENT,
  `nom_cli` varchar(30) DEFAULT NULL,
  `ape_cli` varchar(50) DEFAULT NULL,
  `sex_cli` varchar(1) DEFAULT NULL,
  `log_cli` varchar(15) DEFAULT NULL,
  `pas_cli` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`cod_cli`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (1,'Luis','Alayo Salazar','M','luis1','luis1'),(2,'Charo','Camargo Salazar','M','aaaa1','bbbb1'),(3,'Esther','Villar Dezza','M','cccc1','cccc1'),(4,'Ruby','Canturin Sandoval','F','bbbb1','bbbb1'),(5,'Alejandro','Turin Urquizo','M','mmmm','mmmm');
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_comentario`
--

DROP TABLE IF EXISTS `tb_comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_comentario` (
  `cod_com` smallint(6) NOT NULL AUTO_INCREMENT,
  `cod_pro` smallint(6) DEFAULT NULL,
  `dir_com` varchar(30) DEFAULT NULL,
  `pun_com` varchar(30) DEFAULT NULL,
  `des_com` text,
  PRIMARY KEY (`cod_com`),
  KEY `cod_pro` (`cod_pro`),
  CONSTRAINT `tb_comentario_ibfk_1` FOREIGN KEY (`cod_pro`) REFERENCES `tb_producto` (`cod_pro`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_comentario`
--

LOCK TABLES `tb_comentario` WRITE;
/*!40000 ALTER TABLE `tb_comentario` DISABLE KEYS */;
INSERT INTO `tb_comentario` VALUES (1,1,'usuario@hotmail.com','images/puntuacion/4.gif','Esta joya es excelente, la verdad conbina con todo:sonrisa: :sonrisa: '),(2,2,'usuario@hotmail.com','images/puntuacion/5.gif','Realmente el diseo es grandioso :sonrisa: :sonrisa: :beso: '),(3,3,'usuario@hotmail.com','images/puntuacion/1.gif','No sirve :confuso: :enfadado: '),(4,4,'usuario@hotmail.com','images/puntuacion/5.gif','Es excelente :risa: :risa: :risa: '),(5,1,'usuario@hotmail.com','images/puntuacion/5.gif','Me ayudo Mucho'),(6,1,'usuario@hotmail.com','images/puntuacion/2.gif','No sirve :enfadado: :enfadado: '),(7,2,'usuario@hotmail.com','images/puntuacion/2.gif','No sirve :enfadado: :enfadado: '),(8,2,'usuario@hotmail.com','images/puntuacion/5.gif','Excelente :beso: :beso: :beso: ');
/*!40000 ALTER TABLE `tb_comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_detalle_pedido`
--

DROP TABLE IF EXISTS `tb_detalle_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_detalle_pedido` (
  `cod_ped` smallint(6) NOT NULL DEFAULT '0',
  `cod_pro` smallint(6) NOT NULL DEFAULT '0',
  `pre_pro` double DEFAULT NULL,
  `can_pro` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`cod_ped`,`cod_pro`),
  KEY `cod_pro` (`cod_pro`),
  CONSTRAINT `tb_detalle_pedido_ibfk_1` FOREIGN KEY (`cod_ped`) REFERENCES `tb_pedido` (`cod_ped`),
  CONSTRAINT `tb_detalle_pedido_ibfk_2` FOREIGN KEY (`cod_pro`) REFERENCES `tb_producto` (`cod_pro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_detalle_pedido`
--

LOCK TABLES `tb_detalle_pedido` WRITE;
/*!40000 ALTER TABLE `tb_detalle_pedido` DISABLE KEYS */;
INSERT INTO `tb_detalle_pedido` VALUES (1,1,320,3),(1,2,150,2),(1,3,470,1),(1,4,640,1),(2,1,320,2),(2,2,150,2),(2,3,470,1),(2,4,640,1),(3,1,320,3),(3,2,150,3),(3,3,470,2),(3,4,640,1),(4,1,320,2),(4,2,150,1),(4,3,470,2),(4,4,640,1),(5,1,320,2),(5,2,150,3),(5,3,470,3),(5,4,640,1),(6,1,320,1),(6,2,150,2),(6,3,470,2),(6,4,640,1),(7,1,320,3),(7,2,150,3),(7,3,470,3),(7,4,640,2),(8,1,320,1),(8,2,150,2),(8,3,470,1),(8,4,640,2),(9,1,320,1),(9,2,150,3),(9,3,470,3),(9,4,640,1),(10,1,320,2),(10,2,150,3),(10,3,470,1),(10,4,640,2),(11,1,320,1),(11,2,150,2),(11,3,470,3),(11,4,640,3),(12,1,320,1),(12,2,150,2),(12,3,470,1),(12,4,640,3),(13,1,320,1),(13,2,150,2),(13,3,470,1),(13,4,640,3),(14,1,320,1),(14,2,150,2),(14,3,470,1),(14,4,640,3),(15,1,320,2),(15,2,150,1),(15,3,470,2),(15,4,640,1),(16,1,320,3),(16,2,150,3),(16,3,470,1),(16,4,640,2),(17,1,320,1),(17,2,150,1),(17,3,470,3),(17,4,640,1),(18,1,320,2),(18,2,150,1),(18,3,470,1),(18,4,640,3),(19,1,320,2),(19,2,150,1),(19,3,470,3),(19,4,640,1),(20,1,320,2),(20,2,150,3),(20,3,470,1),(20,4,640,1),(21,1,320,3),(21,2,150,1),(21,3,470,2),(21,4,640,3),(22,1,320,1),(22,2,150,1),(22,3,470,3),(22,4,640,2),(23,1,320,1),(23,2,150,3),(23,3,470,1),(23,4,640,3),(24,1,320,2),(24,2,150,1),(24,3,470,3),(24,4,640,1),(25,1,320,2),(25,2,150,3),(25,3,470,1),(25,4,640,1),(26,1,320,2),(26,2,150,3),(26,3,470,1),(26,4,640,1),(27,1,320,3),(27,2,150,2),(27,3,470,1),(27,4,640,3),(28,1,320,1),(28,2,150,2),(28,3,470,3),(28,4,640,1),(29,1,320,1),(29,2,150,3),(29,3,470,2),(29,4,640,1),(30,1,320,3),(30,2,150,3),(30,3,470,1),(30,4,640,2),(31,1,320,3),(31,2,150,3),(31,3,470,1),(31,4,640,1),(32,1,320,2),(32,2,150,1),(32,3,470,3),(32,4,640,3),(33,1,320,1),(33,2,150,2),(33,3,470,3),(33,4,640,3),(34,1,320,1),(34,2,150,3),(34,3,470,1),(34,4,640,3),(35,1,320,2),(35,2,150,1),(35,3,470,3),(35,4,640,2),(36,1,320,2),(36,2,150,3),(36,3,470,1),(36,4,640,1),(37,1,320,3),(37,2,150,2),(37,3,470,1),(37,4,640,3),(38,1,320,2),(38,2,150,1),(38,3,470,3),(38,4,640,3),(39,1,320,2),(39,2,150,1),(39,3,470,3),(39,4,640,2),(40,1,320,3),(40,2,150,1),(40,3,470,3),(40,4,640,2),(41,1,320,1),(41,2,150,3),(41,3,470,1),(41,4,640,3),(42,1,320,2),(42,2,150,1),(42,3,470,3),(42,4,640,2),(43,1,320,3),(43,2,150,1),(43,3,470,2),(43,4,640,1),(44,1,320,3),(44,2,150,1),(44,3,470,2),(44,4,640,1),(45,1,320,3),(45,2,150,1),(45,3,470,2),(45,4,640,3),(46,1,320,1),(46,2,150,2),(46,3,470,3),(46,4,640,1),(47,1,320,3),(47,2,150,1),(47,3,470,3),(47,4,640,2),(48,1,320,1),(48,2,150,3),(48,3,470,2),(48,4,640,3);
/*!40000 ALTER TABLE `tb_detalle_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_menu`
--

DROP TABLE IF EXISTS `tb_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_menu` (
  `cod_men` smallint(6) NOT NULL AUTO_INCREMENT,
  `des_men` varchar(30) DEFAULT NULL,
  `url_men` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`cod_men`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_menu`
--

LOCK TABLES `tb_menu` WRITE;
/*!40000 ALTER TABLE `tb_menu` DISABLE KEYS */;
INSERT INTO `tb_menu` VALUES (1,'Producto','intranetProducto.jsp'),(2,'Categoria','intranetCategoria.jsp'),(3,'Usuario','intranetUsuario.jsp'),(4,'Pedido','intranetPedido.jsp'),(5,'Boleta','intranetBoleta.jsp'),(6,'Factura','intranetFactura.jsp');
/*!40000 ALTER TABLE `tb_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_pedido`
--

DROP TABLE IF EXISTS `tb_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_pedido` (
  `cod_ped` smallint(6) NOT NULL AUTO_INCREMENT,
  `fec_ped` date DEFAULT NULL,
  `cod_cli` smallint(6) DEFAULT NULL,
  `est_ped` char(1) DEFAULT NULL,
  PRIMARY KEY (`cod_ped`),
  KEY `cod_cli` (`cod_cli`),
  CONSTRAINT `tb_pedido_ibfk_1` FOREIGN KEY (`cod_cli`) REFERENCES `tb_cliente` (`cod_cli`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_pedido`
--

LOCK TABLES `tb_pedido` WRITE;
/*!40000 ALTER TABLE `tb_pedido` DISABLE KEYS */;
INSERT INTO `tb_pedido` VALUES (1,'2006-01-03',2,'P'),(2,'2006-01-04',1,'P'),(3,'2006-01-10',1,'P'),(4,'2006-01-20',1,'P'),(5,'2006-02-01',1,'P'),(6,'2006-02-10',2,'P'),(7,'2006-02-10',2,'P'),(8,'2006-02-18',2,'P'),(9,'2006-03-01',2,'P'),(10,'2006-03-07',1,'P'),(11,'2006-03-10',1,'P'),(12,'2006-03-15',1,'P'),(13,'2006-04-01',2,'P'),(14,'2006-04-07',2,'P'),(15,'2006-04-10',1,'P'),(16,'2006-04-15',1,'P'),(17,'2006-05-01',1,'P'),(18,'2006-05-07',2,'P'),(19,'2006-05-10',1,'P'),(20,'2006-05-15',1,'P'),(21,'2006-06-01',2,'P'),(22,'2006-06-07',2,'P'),(23,'2006-06-10',1,'P'),(24,'2006-06-15',1,'P'),(25,'2006-07-01',1,'P'),(26,'2006-07-07',2,'P'),(27,'2006-07-10',2,'P'),(28,'2006-07-15',1,'P'),(29,'2006-08-01',1,'P'),(30,'2006-08-07',1,'P'),(31,'2006-08-10',2,'P'),(32,'2006-08-15',2,'P'),(33,'2006-09-01',1,'P'),(34,'2006-09-07',1,'P'),(35,'2006-09-10',3,'P'),(36,'2006-09-15',3,'P'),(37,'2006-10-01',1,'P'),(38,'2006-10-07',3,'P'),(39,'2006-10-10',3,'P'),(40,'2006-10-15',1,'P'),(41,'2006-11-01',1,'P'),(42,'2006-11-07',3,'P'),(43,'2006-11-10',1,'P'),(44,'2006-11-15',3,'P'),(45,'2006-12-01',1,'P'),(46,'2006-12-07',3,'P'),(47,'2006-12-10',2,'P'),(48,'2006-12-15',2,'P');
/*!40000 ALTER TABLE `tb_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_producto`
--

DROP TABLE IF EXISTS `tb_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_producto` (
  `cod_pro` smallint(6) NOT NULL AUTO_INCREMENT,
  `nom_pro` varchar(50) DEFAULT NULL,
  `des_pro` text,
  `pre_pro` double DEFAULT NULL,
  `stk_pro` int(11) DEFAULT NULL,
  `cod_cat` smallint(6) DEFAULT NULL,
  `est_pro` char(1) DEFAULT NULL,
  `img_pro` varchar(100) DEFAULT NULL,
  `file_pro` longblob,
  PRIMARY KEY (`cod_pro`),
  KEY `cod_cat` (`cod_cat`),
  CONSTRAINT `tb_producto_ibfk_1` FOREIGN KEY (`cod_cat`) REFERENCES `tb_categoria` (`cod_cat`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_producto`
--

LOCK TABLES `tb_producto` WRITE;
/*!40000 ALTER TABLE `tb_producto` DISABLE KEYS */;
INSERT INTO `tb_producto` VALUES (1,'Pulsera del lazuli de Lapis, Enigma','Showcased en un punto ancho, pulido, tres piedras preciosas irradian misterio azul profundo.  Neeru Goel combina el encanto natural del lazuli de los lapis con plata esterlina.  Las colmenas argent afilan la pulsera en negrilla, trayendo estilo indio tradicional a un diseo encantador.',320,20,1,'1','images/items/b01_1.jpg',NULL),(2,'Pulsera de Amethyst,Dewdrops lilac','Los dewdrops de la piedra preciosa confieren una elegancia cristalina a las flores en esta pulsera hermosa.  Diseos y mano-artes de Beenu el pedazo en plata esterlina con los amethysts chispeantes.  El puno de encaje hace un accesorio mesmerizing para la preparacin con estilo.',150,50,1,'1','images/items/b02_1.jpg',NULL),(3,'Aretes de la malaquita,fuerza de la vida','La malaquita verde implica vida, mientras que la gema seala hacia arriba en un gesto del crecimiento.  Wararat Supasirisuk crea los pendientes del atontamiento de la plata esterlina brillante (0,925).  La malaquita se piensa extensamente para promover la purificacin y sueos curativos as como el dibujo hacia fuera de energa negativa.',470,15,2,'1','images/items/e08_1.jpg',NULL),(4,'Anillo,libelula de plata ','Altsimo en gossamer se va volando, las liblulas anuncian la llegada del verano en los jardines de Balinese.  Rusdiarta forma un par como pendientes.  Suspendido en los alambres esterlinas, las criaturas de plata se parecen bailar.',640,35,2,'1','images/items/e09_1.jpg',NULL);
/*!40000 ALTER TABLE `tb_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_usuario` (
  `cod_usu` smallint(6) NOT NULL AUTO_INCREMENT,
  `log_usu` varchar(15) DEFAULT NULL,
  `pas_usu` varchar(15) DEFAULT NULL,
  `nom_usu` varchar(30) DEFAULT NULL,
  `ape_usu` varchar(50) DEFAULT NULL,
  `eda_usu` smallint(6) DEFAULT NULL,
  `est_usu` char(1) DEFAULT NULL,
  PRIMARY KEY (`cod_usu`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
INSERT INTO `tb_usuario` VALUES (1,'pepe','pepe','Juan','Perez',30,'1'),(2,'maria','maria','Maria','Fernandez',28,'1'),(3,'sonia','sonia','Sonia','Fabiola',35,'1'),(4,'pedro','pedro','Pedro','Ayala',40,'1');
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-29 18:16:03
