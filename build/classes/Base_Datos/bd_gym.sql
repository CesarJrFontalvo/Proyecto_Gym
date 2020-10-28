-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 30-10-2018 a las 17:23:07
-- Versión del servidor: 5.7.21
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_gym`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblempleado`
--

DROP TABLE IF EXISTS `tblempleado`;
CREATE TABLE IF NOT EXISTS `tblempleado` (
  `empId` int(11) NOT NULL,
  `empNombres` varchar(30) NOT NULL,
  `empApellidos` varchar(30) NOT NULL,
  `empDireccion` varchar(70) NOT NULL,
  `empTelefono` varchar(30) NOT NULL,
  `empCorreo` varchar(50) NOT NULL,
  `empContrasena` varchar(50) NOT NULL,
  `empFecha_Nac` varchar(12) NOT NULL,
  `empIdRol` int(11) NOT NULL,
  PRIMARY KEY (`empId`),
  KEY `id_Rol` (`espIdRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblempl_esp`
--

DROP TABLE IF EXISTS `tblempl_esp`;
CREATE TABLE IF NOT EXISTS `tblempl_esp` (
  `empId` int(11) NOT NULL,
  `espId` int(11) NOT NULL,
  KEY `id_Empleado` (`empId`,`espId`),
  KEY `id_Esp` (`espId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblespecializaciones`
--

DROP TABLE IF EXISTS `tblespecializaciones`;
CREATE TABLE IF NOT EXISTS `tblespecializaciones` (
  `espId` int(11) NOT NULL,
  `espNombre` varchar(30) NOT NULL,
  `espDescripcion` varchar(200) NOT NULL,
  PRIMARY KEY (`espId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblroles`
--

DROP TABLE IF EXISTS `tblroles`;
CREATE TABLE IF NOT EXISTS `tblroles` (
  `rolId` int(11) NOT NULL,
  `rolNombre` varchar(30) NOT NULL,
  `rolPermisos` varchar(200) NOT NULL,
  PRIMARY KEY (`rolId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblrutinas`
--

DROP TABLE IF EXISTS `tblrutinas`;
CREATE TABLE IF NOT EXISTS `tblrutinas` (
  `rutId` int(11) NOT NULL,
  `rutNombre` varchar(30) NOT NULL,
  `rutDescripcion` varchar(500) NOT NULL,
  PRIMARY KEY (`rutId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblrut_sesiones`
--

DROP TABLE IF EXISTS `tblrut_sesiones`;
CREATE TABLE IF NOT EXISTS `tblrut_sesiones` (
  `id_Rutinas` int(11) NOT NULL,
  `id_Sesiones` int(11) NOT NULL,
  KEY `id_Rutinas` (`id_Rutinas`,`id_Sesiones`),
  KEY `id_Sesiones` (`id_Sesiones`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblsesiones`
--

DROP TABLE IF EXISTS `tblsesiones`;
CREATE TABLE IF NOT EXISTS `tblsesiones` (
  `sesId` int(11) NOT NULL,
  `empId` int(11) NOT NULL,
  `usuId` int(11) NOT NULL,
  `sesFecha_inicio` varchar(12) NOT NULL,
  `sesHora_inicio` varchar(5) NOT NULL,
  `sesFecha_fin` varchar(12) NOT NULL,
  `sesHora_fin` varchar(5) NOT NULL,
  `sesDescripcion` varchar(200) NOT NULL,
  PRIMARY KEY (`sesId`),
  KEY `Usuario_id` (`usuId`,`empId`),
  KEY `Empleado_id` (`empId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblusuarios`
--

DROP TABLE IF EXISTS `tblusuarios`;
CREATE TABLE IF NOT EXISTS `tblusuarios` (
  `usuId` int(11) NOT NULL,
  `usuNombres` varchar(30) NOT NULL,
  `usuApellidos` varchar(30) NOT NULL,
  `usuDireccion` varchar(70) NOT NULL,
  `usuTelefono` varchar(30) NOT NULL,
  `usuCorreo` varchar(50) NOT NULL,
  `usuContrasena` varchar(50) NOT NULL,
  `usuFecha_Nac` varchar(12) NOT NULL,
  PRIMARY KEY (`usuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblvaloraciones`
--

DROP TABLE IF EXISTS `tblvaloraciones`;
CREATE TABLE IF NOT EXISTS `tblvaloraciones` (
  `valId` int(11) NOT NULL,
  `valDenominacion` varchar(200) NOT NULL,
  `valRegistro_Medico` varchar(50) NOT NULL,
  `usuId` int(11) NOT NULL,
  PRIMARY KEY (`valId`),
  KEY `id_Usuario` (`usuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tblempleado`
--
ALTER TABLE `tblempleado`
  ADD CONSTRAINT `tblempleado_ibfk_1` FOREIGN KEY (`espIdRol`) REFERENCES `tblroles` (`rolId`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tblempl_esp`
--
ALTER TABLE `tblempl_esp`
  ADD CONSTRAINT `tblempl_esp_ibfk_1` FOREIGN KEY (`espId`) REFERENCES `tblespecializaciones` (`espId`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tblempl_esp_ibfk_2` FOREIGN KEY (`empId`) REFERENCES `tblempleado` (`empId`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tblrut_sesiones`
--
ALTER TABLE `tblrut_sesiones`
  ADD CONSTRAINT `tblrut_sesiones_ibfk_1` FOREIGN KEY (`id_Sesiones`) REFERENCES `tblsesiones` (`sesId`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tblrut_sesiones_ibfk_2` FOREIGN KEY (`id_Rutinas`) REFERENCES `tblrutinas` (`rutId`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tblsesiones`
--
ALTER TABLE `tblsesiones`
  ADD CONSTRAINT `tblsesiones_ibfk_1` FOREIGN KEY (`usuId`) REFERENCES `tblusuarios` (`usuId`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tblsesiones_ibfk_2` FOREIGN KEY (`empId`) REFERENCES `tblempleado` (`empId`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tblvaloraciones`
--
ALTER TABLE `tblvaloraciones`
  ADD CONSTRAINT `tblvaloraciones_ibfk_1` FOREIGN KEY (`usuId`) REFERENCES `tblusuarios` (`usuId`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
