-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04-Nov-2019 às 15:32
-- Versão do servidor: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `newhotel`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `hospedes`
--

CREATE TABLE `hospedes` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `CPF` char(11) NOT NULL,
  `RG` varchar(10) NOT NULL,
  `SEXO` char(1) NOT NULL,
  `DATANASC` datetime NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `TEL` varchar(50) DEFAULT NULL,
  `CEL` varchar(50) DEFAULT NULL,
  `ENDERECO` varchar(255) NOT NULL,
  `NUM` int(11) NOT NULL,
  `CEP` char(8) NOT NULL,
  `CIDADE` varchar(255) NOT NULL,
  `UF` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `hospedes`
--

INSERT INTO `hospedes` (`CODIGO`, `NOME`, `CPF`, `RG`, `SEXO`, `DATANASC`, `EMAIL`, `TEL`, `CEL`, `ENDERECO`, `NUM`, `CEP`, `CIDADE`, `UF`) VALUES
(1, 'teste', '22222222222', '555555555', 'F', '2000-08-24 00:00:00', 'teste', '55555555', '55555555', 'zxczxczxcz', 2, '55555555', 'adadasd', 'AC');

-- --------------------------------------------------------

--
-- Estrutura da tabela `quartos`
--

CREATE TABLE `quartos` (
  `CODIGO` int(11) NOT NULL,
  `DESCRICAO` varchar(255) NOT NULL,
  `VALOR` int(11) NOT NULL,
  `QUANTPESSOAS` int(11) NOT NULL,
  `QUANTQUARTOS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `quartos`
--

INSERT INTO `quartos` (`CODIGO`, `DESCRICAO`, `VALOR`, `QUANTPESSOAS`, `QUANTQUARTOS`) VALUES
(5, 'teste', 4, 5, 65);

-- --------------------------------------------------------

--
-- Estrutura da tabela `recepcionistas`
--

CREATE TABLE `recepcionistas` (
  `CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) NOT NULL,
  `CPF` char(11) NOT NULL,
  `RG` varchar(10) NOT NULL,
  `SEXO` char(1) NOT NULL,
  `DATANASC` datetime NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `TEL` varchar(50) DEFAULT NULL,
  `CEL` varchar(50) DEFAULT NULL,
  `ENDERECO` varchar(255) NOT NULL,
  `NUM` int(11) NOT NULL,
  `CEP` char(8) NOT NULL,
  `CIDADE` varchar(255) NOT NULL,
  `UF` char(2) NOT NULL,
  `SENHA` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `recepcionistas`
--

INSERT INTO `recepcionistas` (`CODIGO`, `NOME`, `CPF`, `RG`, `SEXO`, `DATANASC`, `EMAIL`, `TEL`, `CEL`, `ENDERECO`, `NUM`, `CEP`, `CIDADE`, `UF`, `SENHA`) VALUES
(1, 'candida', '12345678912', '123456789', 'F', '2000-08-24 00:00:00', 'candida@gmail.com', '12345678', '985210123', 'Rua Tal', 456, '01234567', 'São Paulo', 'SP', 'candida'),
(2, 'luis', '12345678912', '12345678X', '', '2000-08-24 00:00:00', 'luis@gmail.com', '12345678', '985210123', 'Rua Tal', 456, '01234567', 'São Paulo', 'SP', 'luis'),
(4, 'teste', '55555555555', '555555555', 'F', '2000-08-24 00:00:00', 'teste', '55555555', '55555555', 'gadfgasdfasdfa', 2, '55555555', 'teste', 'AC', 'teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `reservass`
--

CREATE TABLE `reservass` (
  `CODIGO` int(11) NOT NULL,
  `COD_HOSPEDE` int(11) NOT NULL,
  `DATAEN` datetime NOT NULL,
  `DATASA` datetime NOT NULL,
  `TIPOQUARTO` varchar(255) NOT NULL,
  `NPESSOAS` int(11) NOT NULL,
  `VALOR` varchar(10) NOT NULL,
  `PAGAMENTO` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `reservass`
--

INSERT INTO `reservass` (`CODIGO`, `COD_HOSPEDE`, `DATAEN`, `DATASA`, `TIPOQUARTO`, `NPESSOAS`, `VALOR`, `PAGAMENTO`) VALUES
(1, 1, '2019-12-31 00:00:00', '2019-12-31 00:00:00', 'jjjjjj', 5, '5', '5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hospedes`
--
ALTER TABLE `hospedes`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `quartos`
--
ALTER TABLE `quartos`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `recepcionistas`
--
ALTER TABLE `recepcionistas`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indexes for table `reservass`
--
ALTER TABLE `reservass`
  ADD PRIMARY KEY (`CODIGO`),
  ADD KEY `COD_HOSPEDE` (`COD_HOSPEDE`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hospedes`
--
ALTER TABLE `hospedes`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `quartos`
--
ALTER TABLE `quartos`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `recepcionistas`
--
ALTER TABLE `recepcionistas`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `reservass`
--
ALTER TABLE `reservass`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `reservass`
--
ALTER TABLE `reservass`
  ADD CONSTRAINT `reservass_ibfk_1` FOREIGN KEY (`COD_HOSPEDE`) REFERENCES `hospedes` (`CODIGO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
