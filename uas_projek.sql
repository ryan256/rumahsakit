-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2018 at 05:16 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 5.6.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas_projek`
--

-- --------------------------------------------------------

--
-- Table structure for table `datadokter`
--

CREATE TABLE `datadokter` (
  `kode_dokter` int(10) NOT NULL,
  `nama_dokter` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `alamat_dokter` varchar(50) DEFAULT NULL,
  `kota_dokter` varchar(50) DEFAULT NULL,
  `notelp_dokter` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datadokter`
--

INSERT INTO `datadokter` (`kode_dokter`, `nama_dokter`, `jenis_kelamin`, `alamat_dokter`, `kota_dokter`, `notelp_dokter`) VALUES
(22, 'bb', 'LAKI-LAKI', 'hh', 'uu', '67678');

-- --------------------------------------------------------

--
-- Table structure for table `datapasien`
--

CREATE TABLE `datapasien` (
  `kode_pasien` int(10) NOT NULL,
  `nama_pasien` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `umur_pasien` int(10) DEFAULT NULL,
  `alamat_pasien` varchar(50) DEFAULT NULL,
  `notelp_pasien` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datapasien`
--

INSERT INTO `datapasien` (`kode_pasien`, `nama_pasien`, `jenis_kelamin`, `umur_pasien`, `alamat_pasien`, `notelp_pasien`) VALUES
(11, 'aa', 'LAKI-LAKI', 34, 'jj', '098989');

-- --------------------------------------------------------

--
-- Table structure for table `dataperawat`
--

CREATE TABLE `dataperawat` (
  `kode_perawat` int(10) NOT NULL,
  `nama_perawat` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `alamat_perawat` varchar(50) DEFAULT NULL,
  `kota_perawat` varchar(50) DEFAULT NULL,
  `notelp_perawat` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dataperawat`
--

INSERT INTO `dataperawat` (`kode_perawat`, `nama_perawat`, `jenis_kelamin`, `alamat_perawat`, `kota_perawat`, `notelp_perawat`) VALUES
(33, 'ghg', 'LAKI-LAKI', 'yuyu', 'rrt', '7878');

-- --------------------------------------------------------

--
-- Table structure for table `dataresep`
--

CREATE TABLE `dataresep` (
  `kode_resep` int(10) NOT NULL,
  `nama_resep` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dataresep`
--

INSERT INTO `dataresep` (`kode_resep`, `nama_resep`) VALUES
(677, 'puyer');

-- --------------------------------------------------------

--
-- Table structure for table `dataruangan`
--

CREATE TABLE `dataruangan` (
  `kode_ruangan` int(10) NOT NULL,
  `nama_ruangan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dataruangan`
--

INSERT INTO `dataruangan` (`kode_ruangan`, `nama_ruangan`) VALUES
(44, 'rrr');

-- --------------------------------------------------------

--
-- Table structure for table `rawatinap`
--

CREATE TABLE `rawatinap` (
  `kode_inap` int(10) NOT NULL,
  `kode_ruangan` int(10) DEFAULT NULL,
  `nama_ruangan` varchar(50) DEFAULT NULL,
  `kode_dokter` int(10) DEFAULT NULL,
  `nama_dokter` varchar(50) DEFAULT NULL,
  `kode_pasien` int(10) DEFAULT NULL,
  `nama_pasien` varchar(50) DEFAULT NULL,
  `kode_perawat` int(10) DEFAULT NULL,
  `nama_perawat` varchar(50) DEFAULT NULL,
  `tanggal_masuk` varchar(50) DEFAULT NULL,
  `tanggal_keluar` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rawatjalan`
--

CREATE TABLE `rawatjalan` (
  `kode_rawatjalan` int(10) NOT NULL,
  `kode_dokter` int(10) DEFAULT NULL,
  `nama_dokter_` varchar(50) DEFAULT NULL,
  `kode_pasien` int(10) DEFAULT NULL,
  `nama_pasien_` varchar(50) DEFAULT NULL,
  `kode_obat` int(10) DEFAULT NULL,
  `nama_obat` varchar(50) DEFAULT NULL,
  `tanggal_periksa` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datadokter`
--
ALTER TABLE `datadokter`
  ADD PRIMARY KEY (`kode_dokter`);

--
-- Indexes for table `datapasien`
--
ALTER TABLE `datapasien`
  ADD PRIMARY KEY (`kode_pasien`);

--
-- Indexes for table `dataperawat`
--
ALTER TABLE `dataperawat`
  ADD PRIMARY KEY (`kode_perawat`);

--
-- Indexes for table `dataresep`
--
ALTER TABLE `dataresep`
  ADD PRIMARY KEY (`kode_resep`);

--
-- Indexes for table `dataruangan`
--
ALTER TABLE `dataruangan`
  ADD PRIMARY KEY (`kode_ruangan`);

--
-- Indexes for table `rawatinap`
--
ALTER TABLE `rawatinap`
  ADD PRIMARY KEY (`kode_inap`),
  ADD KEY `FK_rawatinap_dataruangan` (`kode_ruangan`),
  ADD KEY `FK_rawatinap_datadokter` (`kode_dokter`),
  ADD KEY `FK_rawatinap_datapasien` (`kode_pasien`),
  ADD KEY `FK_rawatinap_dataperawat` (`kode_perawat`);

--
-- Indexes for table `rawatjalan`
--
ALTER TABLE `rawatjalan`
  ADD PRIMARY KEY (`kode_rawatjalan`),
  ADD KEY `FK_rawatjalan_datadokter` (`kode_dokter`),
  ADD KEY `FK_rawatjalan_datapasien` (`kode_pasien`),
  ADD KEY `FK_rawatjalan_dataresep` (`kode_obat`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rawatinap`
--
ALTER TABLE `rawatinap`
  ADD CONSTRAINT `FK_rawatinap_datadokter` FOREIGN KEY (`kode_dokter`) REFERENCES `datadokter` (`kode_dokter`),
  ADD CONSTRAINT `FK_rawatinap_datapasien` FOREIGN KEY (`kode_pasien`) REFERENCES `datapasien` (`kode_pasien`),
  ADD CONSTRAINT `FK_rawatinap_dataperawat` FOREIGN KEY (`kode_perawat`) REFERENCES `dataperawat` (`kode_perawat`),
  ADD CONSTRAINT `FK_rawatinap_dataruangan` FOREIGN KEY (`kode_ruangan`) REFERENCES `dataruangan` (`kode_ruangan`);

--
-- Constraints for table `rawatjalan`
--
ALTER TABLE `rawatjalan`
  ADD CONSTRAINT `FK_rawatjalan_datadokter` FOREIGN KEY (`kode_dokter`) REFERENCES `datadokter` (`kode_dokter`),
  ADD CONSTRAINT `FK_rawatjalan_datapasien` FOREIGN KEY (`kode_pasien`) REFERENCES `datapasien` (`kode_pasien`),
  ADD CONSTRAINT `FK_rawatjalan_dataresep` FOREIGN KEY (`kode_obat`) REFERENCES `dataresep` (`kode_resep`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
