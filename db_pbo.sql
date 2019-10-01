/*
SQLyog Professional v12.4.1 (64 bit)
MySQL - 10.1.22-MariaDB : Database - db_pbo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_pbo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_pbo`;

/*Table structure for table `tb_catatan` */

DROP TABLE IF EXISTS `tb_catatan`;

CREATE TABLE `tb_catatan` (
  `idcatatan` int(5) NOT NULL AUTO_INCREMENT,
  `catatan` varchar(200) DEFAULT NULL,
  `tanggalbuat` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idcatatan`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tb_catatan` */

insert  into `tb_catatan`(`idcatatan`,`catatan`,`tanggalbuat`) values 
(1,'jangan lupa besok libur','5/10/18 1:16 PM'),
(2,'sekarang libur','5/10/18 1:25 PM'),
(3,'kapan?','5/10/18 1:35 PM'),
(4,'besok','5/10/18 1:37 PM'),
(5,'','5/10/18 1:39 PM'),
(6,'OK','5/10/18 1:45 PM');

/*Table structure for table `tb_gender` */

DROP TABLE IF EXISTS `tb_gender`;

CREATE TABLE `tb_gender` (
  `idgender` int(5) NOT NULL AUTO_INCREMENT,
  `gender` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idgender`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tb_gender` */

insert  into `tb_gender`(`idgender`,`gender`) values 
(1,'Laki - Lai'),
(2,'Perempuan');

/*Table structure for table `tb_level` */

DROP TABLE IF EXISTS `tb_level`;

CREATE TABLE `tb_level` (
  `idlevel` int(5) NOT NULL AUTO_INCREMENT,
  `level` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idlevel`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `tb_level` */

insert  into `tb_level`(`idlevel`,`level`) values 
(11,'admin'),
(13,'operator');

/*Table structure for table `tb_pengunjung` */

DROP TABLE IF EXISTS `tb_pengunjung`;

CREATE TABLE `tb_pengunjung` (
  `idpengunjung` int(5) NOT NULL AUTO_INCREMENT,
  `namapengunjung` varchar(30) DEFAULT NULL,
  `jam` varchar(5) DEFAULT NULL,
  `menit` varchar(5) DEFAULT NULL,
  `detik` varchar(5) DEFAULT NULL,
  `biaya` varchar(10) DEFAULT NULL,
  `waktuMulai` varchar(20) DEFAULT NULL,
  `waktuBerakhir` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idpengunjung`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `tb_pengunjung` */

insert  into `tb_pengunjung`(`idpengunjung`,`namapengunjung`,`jam`,`menit`,`detik`,`biaya`,`waktuMulai`,`waktuBerakhir`) values 
(1,'basir',NULL,NULL,NULL,NULL,NULL,NULL),
(2,'hafidz',NULL,NULL,NULL,NULL,NULL,NULL),
(3,'shofi',NULL,NULL,NULL,NULL,NULL,NULL),
(4,'rika',NULL,NULL,NULL,NULL,NULL,NULL),
(5,'rukan','0','1','0','500',NULL,NULL),
(6,'rudi','0','1','2','500','5/10/18 12:01 PM',NULL),
(7,'nana','0','7','0','3500','5/10/18 12:07 PM','5/10/18 12:07 PM'),
(8,'basirudin','0','51','2','25500','5/10/18 12:09 PM','5/10/18 12:12 PM');

/*Table structure for table `tb_users` */

DROP TABLE IF EXISTS `tb_users`;

CREATE TABLE `tb_users` (
  `iduser` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `kontak` varchar(13) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `gender` int(5) DEFAULT NULL,
  `level` int(5) DEFAULT NULL,
  PRIMARY KEY (`iduser`),
  KEY `gender` (`gender`),
  KEY `level` (`level`),
  CONSTRAINT `gender` FOREIGN KEY (`gender`) REFERENCES `tb_gender` (`idgender`),
  CONSTRAINT `level` FOREIGN KEY (`level`) REFERENCES `tb_level` (`idlevel`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tb_users` */

insert  into `tb_users`(`iduser`,`username`,`password`,`kontak`,`alamat`,`gender`,`level`) values 
(1,'admin','admin','082332','banyuwangi',1,11),
(2,'operator','operator','085335','jember',1,13);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
