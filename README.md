# clab_criptomonedas
Aplicación CLUI de Creación, Lectura, Actualización y Borrado de una tabla utilizando JDBC_servidor_HTTPS_Sprring

Depende de:
- Modelos: https://github.com/EAG-es/modelos
- Modelos_comunicaciones: https://github.com/EAG-es/modelos_comunicaciones

El servidor se es una aplicación construida con proyecto de JDBC_servidor_HTTPS_Spring: https://github.com/EAG-es/jdbc_servidor_https_spring

La base de datos que se ha utilizado en MySQL es:
```
-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 23-03-2023 a las 13:16:29
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `criptomonedas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `criptomonedas`
--

CREATE TABLE `criptomonedas` (
  `id_criptomoneda` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `simbolo` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `capitalizacion_de_mercado` int(15) NOT NULL,
  `aporte_circulante` int(15) NOT NULL,
  `capitalizacion_total_diluida` int(15) DEFAULT NULL,
  `aporte_total` int(15) DEFAULT NULL,
  `aporte_maximo` int(15) DEFAULT NULL,
  `dominancia` decimal(11,2) NOT NULL,
  `total_valor_bloqueado` int(15) DEFAULT NULL,
  `fecha_actualizacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `criptomonedas`
--

INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('1inch', '1INCH', 428305643, 834307434, 772353093, 1500000000, NULL, '0.00', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Aave', 'AAVE', 1068011393, 14093193, 1216041238, 16000000, 16000000, '0.09', 2147483647, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Algorand', 'ALGO', 1494275926, 2147483647, 2104763955, 2147483647, 2147483647, '0.13', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('ApeCoin', 'APE', 1489561909, 368593750, 2147483647, 1000000000, 1000000000, '0.01', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Aptos', 'APT', 2131410488, 177305846, 2147483647, 1024588456, NULL, '0.18', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Avalanche', 'AVAX', 2147483647, 325628087, 2147483647, 421690807, 720000000, '0.47', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Axie Infinity', 'AXS', 985292726, 115605573, 2147483647, 270000000, 270000000, '0.09', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Binance', 'BUSD', 2147483647, 2147483647, 2147483647, 2147483647, NULL, '0.70', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Bitcoin', 'BTC', 2147483647, 19323650, 2147483647, 19323650, 21000000, '46.50', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Bitcoin Cash', 'BCH', 2147483647, 19342650, 2147483647, 19342650, 21000000, '0.21', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Bitcoin SV', 'BSV', 692932671, 19266077, 754034463, 19266077, 21000000, '0.06', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('BitDAO', 'BIT', 1112281658, 2090946169, 2147483647, 2147483647, 2147483647, '0.10', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('BitTorrent(New)', 'BTT', 579354180, 2147483647, 603533866, 2147483647, NULL, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('BNB', 'BNB', 2147483647, 157890831, 2147483647, 159979964, NULL, '4.54', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Cardano', 'ADA', 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, '1.01', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Casper', 'CSPR', 392066970, 2147483647, 419115882, 2147483647, NULL, '0.03', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Chainlink', 'LINK', 2147483647, 517099970, 2147483647, 1000000000, 1000000000, '0.31', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Chiliz', 'CHZ', 788523033, 2147483647, 1046319239, 2147483647, 2147483647, '0.07', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Conflux', 'CFX', 1072605256, 2147483647, 2147483647, 2147483647, NULL, '0.01', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Convex', 'CVX', 407093907, 75624227, 538984559, 97696475, 100000000, '0.04', 2147483647, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Cosmos', 'ATOM', 2147483647, 286370297, NULL, NULL, NULL, '0.29', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Cronos', 'CRO', 1763339775, 2147483647, 2111412127, 2147483647, 2147483647, '0.15', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Curve DAO', 'CRV', 711625189, 748845617, 2147483647, 1919359466, 2147483647, '0.06', 2147483647, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Dai', 'DAI', 2147483647, 2147483647, 2147483647, 2147483647, NULL, '0.48', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Dash', 'DASH', 617530104, 11120725, 1049510635, 11193081, 18900000, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Decentraland', 'MANA', 1102668334, 1855084192, 1309377932, 2147483647, NULL, '0.10', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Dogecoin', 'DOGE', 2147483647, 2147483647, 2147483647, 2147483647, NULL, '8.22', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('dYdX', 'DYDX', 389936081, 156256174, 2147483647, 1000000000, 1000000000, '0.03', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('eCash', 'XEC', 598232972, 2147483647, 652393704, 2147483647, 2147483647, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Enjin', 'ENJ', 392899846, 1000000000, 394610591, 1000000000, 1000000000, '0.03', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('EOS', 'EOS', 1244286624, 1085939027, 1247527463, 1084371464, NULL, '0.11', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Ethereum', 'ETH', 2147483647, 122373866, 2147483647, 122373866, NULL, '18.44', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Ethereum Classic', 'ETC', 2147483647, 140017863, 2147483647, 210700000, 210700000, '0.24', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Fantom', 'FTM', 1286260944, 2147483647, 1467946775, 2147483647, 2147483647, '0.11', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Fei', 'FEI', 418973236, 424996178, 416576526, 426116733, NULL, '0.04', 6, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Filecoin', 'FIL', 2147483647, 407406997, 2147483647, 407406997, NULL, '0.20', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Flare', 'FLR', 374560386, 2147483647, 2147483647, 2147483647, NULL, '0.03', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Flow', 'FLOW', 1076215071, 1036200000, 1475923960, 1417972341, NULL, '0.09', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Frax', 'FXS', 585087960, 74538974, 791195471, 99822984, NULL, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('GateToken', 'GT', 573871259, 108265077, 1587273127, 300000000, NULL, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Gemini Dollar', 'GUSD', 610502554, 607049883, 615189934, 611139703, NULL, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('GMX', 'GMX', 660269495, 8561294, 697796108, 8998119, NULL, '0.06', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Hedera', 'HBAR', 1834536910, 2147483647, 2147483647, 2147483647, 2147483647, '0.16', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Huobi', 'HT', 660760772, 162233844, 2043530253, 203980445, 500000000, '0.01', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Immutable', 'IMX', 1096922493, 868583515, 2147483647, 2000000000, 2000000000, '0.10', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Internet', 'ICP', 1514107393, 296409656, 2147483647, 497127602, NULL, '0.13', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('IOTA', 'MIOTA', 586404672, 2147483647, 588157891, 2147483647, 2147483647, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Kava', 'KAVA', 410012274, 449640535, 352514443, 382198521, NULL, '0.04', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Klaytn', 'KLAY', 702504292, 2147483647, 2147483647, 2147483647, NULL, '0.06', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('KuCoin', 'KCS', 915619782, 98379861, 1584224224, 145879861, 170118638, '0.08', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Lido DAO', 'LDO', 1969215266, 857380920, 2147483647, 1000000000, 1000000000, '0.17', 2147483647, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Litecoin', 'LTC', 2147483647, 72495277, 2147483647, 84000000, 84000000, '0.50', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Loopring', 'LRC', 450364819, 1330133546, 468496159, 1373873437, 1374513896, '0.00', 112455191, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('MAGIC', 'MAGIC', 384456051, 212272806, 630644191, 339645510, 347714007, '0.03', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Maker', 'MKR', 650881219, 977631, 671750844, 977631, 1005577, '0.06', 2147483647, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Mask', 'MASK', 408216173, 76150000, 540273099, 100000000, 100000000, '0.04', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Mina', 'MINA', 682047287, 870927271, 801133981, 1014298013, NULL, '0.06', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Monero', 'XMR', 2147483647, 18255217, 2147483647, 18255217, NULL, '0.24', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('MultiversX', 'EGLD', 1083503980, 25159321, 1352240645, 25164473, 31415926, '0.09', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('NEAR', 'NEAR', 1707654365, 866021029, 1983607287, 1000000000, 1000000000, '0.15', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Neo', 'NEO', 855669640, 70538831, 1216533027, 100000000, 100000000, '0.07', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Nexo', 'NEXO', 385725843, 560000011, 690056612, 1000000000, 1000000000, '0.03', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('OKB', 'OKB', 2147483647, 60000000, 2147483647, 300000000, NULL, '0.24', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Optimism', 'OP', 781481793, 314844141, 2147483647, 2147483647, 2147483647, '0.07', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Osmosis', 'OSMO', 398916173, 492590761, 811168270, 325000000, 1000000000, '0.03', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('PancakeSwap', 'CAKE', 698047096, 183032425, 2147483647, 375201630, 750000000, '0.06', 2147483647, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Pax', 'USDP', 878827365, 878084065, 879445917, 878084065, NULL, '0.08', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('PAX Gold', 'PAXG', 533393240, 271264, 533731771, 271264, NULL, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Polkadot', 'DOT', 2147483647, 1168040227, 2147483647, 1294463897, NULL, '0.61', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Polygon', 'MATIC', 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, '0.83', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Quant', 'QNT', 1520761223, 12072738, 1880782401, 14881364, 14881364, '0.13', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Render', 'RNDR', 474575222, 361444954, 714502189, 530962615, 536870912, '0.04', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Rocket Pool', 'RPL', 770851382, 19257026, 766781826, 19257026, 19113413, '0.07', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Shiba Inu', 'SHIB', 2147483647, 2147483647, 2147483647, 2147483647, NULL, '0.53', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('SingularityNET', 'AGIX', 565604102, 1205321857, 942311357, 1260840662, 2000000000, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Solana', 'SOL', 2147483647, 383612006, 2147483647, 539312705, NULL, '0.73', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Stacks', 'STX', 1641324133, 1367216935, 2147483647, 1352464600, 1818000000, '0.14', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Stellar', 'XLM', 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, '0.20', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Synthetix', 'SNX', 728116232, 253624960, 887436649, 315996212, 308069419, '0.06', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Terra Classic', 'LUNC', 736437710, 2147483647, 857312218, 2147483647, NULL, '0.06', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Tether', 'USDT', 2147483647, 2147483647, 2147483647, 2147483647, NULL, '6.63', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Tezos', 'XTZ', 1074688384, 931311099, 1101505042, 952591301, NULL, '0.09', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('The Graph', 'GRT', 1317829355, 2147483647, 1580212908, 2147483647, NULL, '0.11', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('The Sandbox', 'SAND', 963653208, 1499470108, 1938403585, 2147483647, 2147483647, '0.08', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Theta', 'THETA', 1012549333, 1000000000, 1014040814, 1000000000, 1000000000, '0.09', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('THORChain', 'RUNE', 458173055, 327056566, 702211929, 498475594, 500000000, '0.04', 119477302, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Toncoin', 'TON', 2147483647, 1221401181, 2147483647, 2147483647, 2147483647, '0.25', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('TRON', 'TRX', 2147483647, 2147483647, 2147483647, 2147483647, NULL, '0.51', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('TrueUSD', 'TUSD', 2028592671, 2029652239, 2028712309, 2029652239, NULL, '0.17', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Trust Wallet', 'TWT', 498586936, 416649900, 1199704302, 999668148, 1000000000, '0.00', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Uniswap', 'UNI', 2147483647, 762209327, 2147483647, 1000000000, 1000000000, '0.41', 1135796068, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('UNUS', 'LEO', 2147483647, 953954130, 2147483647, 985239504, NULL, '0.28', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('USD', 'USDC', 2147483647, 2147483647, 2147483647, 2147483647, NULL, '3.04', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('USDD', 'USDD', 722468761, 725332036, 722087631, 725332036, NULL, '0.06', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('VeChain', 'VET', 1646964785, 2147483647, 1977546199, 2147483647, 2147483647, '0.14', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Wrapped', 'WBTC', 2147483647, 150251, 2147483647, 150251, NULL, '0.36', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('XDC', 'XDC', 594281328, 2147483647, 1619677914, 2147483647, NULL, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('XRP', 'XRP', 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, '1.70', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Zcash', 'ZEC', 562186991, 16328269, 726077229, 16328269, 21000000, '0.05', NULL, '2023-03-21 11:22:02');
INSERT INTO `criptomonedas` (`id_criptomoneda`, `simbolo`, `capitalizacion_de_mercado`, `aporte_circulante`, `capitalizacion_total_diluida`, `aporte_total`, `aporte_maximo`, `dominancia`, `total_valor_bloqueado`, `fecha_actualizacion`) VALUES('Zilliqa', 'ZIL', 434729899, 2147483647, 578319980, 2147483647, 2147483647, '0.04', NULL, '2023-03-21 11:22:02');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `criptomonedas`
--
ALTER TABLE `criptomonedas`
  ADD PRIMARY KEY (`id_criptomoneda`);
COMMIT;

```