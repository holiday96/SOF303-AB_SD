-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 27, 2021 lúc 04:42 AM
-- Phiên bản máy phục vụ: 10.4.17-MariaDB
-- Phiên bản PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ab_sd`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `address`
--

CREATE TABLE `address` (
  `ADDRESSID` int(11) NOT NULL,
  `POSTCODE` int(11) DEFAULT NULL,
  `TOWNID` int(11) DEFAULT NULL,
  `COUNTYID` int(11) DEFAULT NULL,
  `COUNTRYID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `address`
--

INSERT INTO `address` (`ADDRESSID`, `POSTCODE`, `TOWNID`, `COUNTYID`, `COUNTRYID`) VALUES
(345, 362472, 2, 4, 3),
(457, 247893, 4, 9, 4),
(777, 383545, 2, 8, 5),
(1111, 346275, 2, 7, 9),
(2356, 248245, 3, 5, 3),
(3462, 245784, 2, 7, 4),
(4356, 345643, 2, 7, 6),
(14511, 543145, 2, 6, 8),
(22444, 247358, 2, 10, 8),
(23742, 247382, 3, 6, 7),
(24742, 245784, 2, 6, 3),
(44444, 436568, 2, 9, 5),
(44446, 247465, 1, 9, 8),
(73653, 742736, 4, 6, 4),
(87955, 878957, 4, 6, 4),
(234534, 234524, 1, 4, 5),
(456425, 527445, 4, 6, 8),
(464442, 835725, 2, 7, 4),
(2648242, 6822452, 1, 7, 5),
(3456735, 267845, 1, 6, 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `contact`
--

CREATE TABLE `contact` (
  `CONTACTID` int(11) NOT NULL,
  `FIRSTNAME` varchar(100) DEFAULT NULL,
  `MANAGERID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `contact`
--

INSERT INTO `contact` (`CONTACTID`, `FIRSTNAME`, `MANAGERID`) VALUES
(312, NULL, NULL),
(423, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `country`
--

CREATE TABLE `country` (
  `COUNTRYID` int(11) NOT NULL,
  `COUNTRYNAME` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `country`
--

INSERT INTO `country` (`COUNTRYID`, `COUNTRYNAME`) VALUES
(1, 'country không một'),
(2, 'country không hai'),
(3, 'country không ba'),
(4, 'country không bốn'),
(5, 'country không năm'),
(6, 'country không sáu'),
(7, 'country không bảy'),
(8, 'country không tám'),
(9, 'country không chín'),
(10, 'country mười'),
(11, 'country mười một');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `county`
--

CREATE TABLE `county` (
  `COUNTYID` int(11) NOT NULL,
  `COUNTRYID` int(11) NOT NULL,
  `COUNTYNAME` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `county`
--

INSERT INTO `county` (`COUNTYID`, `COUNTRYID`, `COUNTYNAME`) VALUES
(1, 1, 'county không một'),
(2, 2, 'county không hai'),
(3, 3, 'county không ba'),
(4, 4, 'county không bốn'),
(5, 5, 'county không năm'),
(6, 6, 'county không sáu'),
(7, 7, 'county không bảy'),
(8, 8, 'county không tám'),
(9, 9, 'county không chín'),
(10, 10, 'county mười');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `department`
--

CREATE TABLE `department` (
  `DEPARTMENTID` int(11) NOT NULL,
  `DIRECTORATEID` int(11) DEFAULT NULL,
  `CONTACTID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `directorate`
--

CREATE TABLE `directorate` (
  `DIRECTORATEID` int(11) NOT NULL,
  `ORGID` int(11) DEFAULT NULL,
  `CONTACTID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `govofficeregion`
--

CREATE TABLE `govofficeregion` (
  `GOVOFFICEREGIONID` int(11) NOT NULL,
  `GOVOFFICEREGIONNAME` varchar(200) DEFAULT NULL,
  `COUNTYID` int(11) DEFAULT NULL,
  `COUNTRYID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `organisation`
--

CREATE TABLE `organisation` (
  `ORGID` int(11) NOT NULL,
  `ORGNAME` varchar(100) DEFAULT NULL,
  `CONTACTID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `organisation`
--

INSERT INTO `organisation` (`ORGID`, `ORGNAME`, `CONTACTID`) VALUES
(100, 'Organisation một', 312),
(101, 'Organisation hai', 312),
(102, 'Organisation ba', 312),
(103, 'Organisation bốn', 423),
(104, 'Organisation sáu', 312),
(106, 'Organisation bảy', 423),
(107, 'Organisation tám', 312),
(108, 'Organisation chín', 423),
(109, 'Organisation mười', 312),
(110, 'Organisation mười một', 312),
(111, 'Organisation mười hai', 312),
(112, 'Organisation mười ba', 423),
(113, 'Organisation mười bốn', 312),
(114, 'Organisation mười năm', 423),
(115, 'Organisation mười sáu', 423),
(116, 'Organisation mười bảy', 312),
(117, 'Organisation mười tám', 423),
(118, 'Organisation mười chín', 312),
(119, 'Organisation hai mươi', 312),
(120, 'Organisation hai mốt', 312),
(121, 'Organisation hai hai', 423),
(122, 'Organisation hai ba', 423),
(123, 'Organisation hai tư', 312),
(124, 'Organisation hai năm', 312),
(125, 'Organisation hai sáu', 423),
(126, 'Organisation hai bảy', 312),
(127, 'Organisation hai tám', 423),
(128, 'Organisation hai chín', 312),
(129, 'Organisation ba mươi', 423),
(154, 'Organisation năm', 423);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `premise`
--

CREATE TABLE `premise` (
  `PREMISEID` int(11) NOT NULL,
  `SERVICEID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `programme`
--

CREATE TABLE `programme` (
  `PROGRAMMEID` int(11) NOT NULL,
  `CONTACTID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `referencedata`
--

CREATE TABLE `referencedata` (
  `REFID` int(11) NOT NULL,
  `REFCODE` varchar(50) DEFAULT NULL,
  `REFVALUE` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `service`
--

CREATE TABLE `service` (
  `SERVICEID` int(11) NOT NULL,
  `CONTACTID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `supportingmaterial`
--

CREATE TABLE `supportingmaterial` (
  `SUPPORTINGMATERIALID` int(11) NOT NULL,
  `ORGID` int(11) DEFAULT NULL,
  `USERID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `team`
--

CREATE TABLE `team` (
  `TEAMID` int(11) NOT NULL,
  `DEPARTMENTID` int(11) DEFAULT NULL,
  `CONTACTID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `town`
--

CREATE TABLE `town` (
  `TOWNID` int(11) NOT NULL,
  `COUNTYID` int(11) NOT NULL,
  `COUNTRYID` int(11) NOT NULL,
  `TOWNNAME` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `town`
--

INSERT INTO `town` (`TOWNID`, `COUNTYID`, `COUNTRYID`, `TOWNNAME`) VALUES
(1, 1, 1, 'town một'),
(2, 2, 2, 'town hai'),
(3, 3, 3, 'town ba'),
(4, 4, 4, 'town bốn'),
(5, 5, 5, 'town năm');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trustdistrict`
--

CREATE TABLE `trustdistrict` (
  `TRUSTDISTRICTID` int(11) NOT NULL,
  `NAME` varchar(200) DEFAULT NULL,
  `DESCRIPTION` varchar(256) DEFAULT NULL,
  `TRUSTREGIONID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trustregion`
--

CREATE TABLE `trustregion` (
  `TRUSTREGIONID` int(11) NOT NULL,
  `NAME` varchar(200) DEFAULT NULL,
  `DESCRIPTION` varchar(256) DEFAULT NULL,
  `COUNTRYID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `USERID` int(11) NOT NULL,
  `ACCOUNT` varchar(100) DEFAULT NULL,
  `EMAIL` varchar(200) DEFAULT NULL,
  `ROLE` varchar(200) DEFAULT NULL,
  `PASSWORD` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`ADDRESSID`),
  ADD KEY `FK_COUNTYADDRESS` (`COUNTYID`),
  ADD KEY `FK_COUNTRYADDRESS` (`COUNTRYID`),
  ADD KEY `FK_TOWNADDRESS` (`TOWNID`);

--
-- Chỉ mục cho bảng `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`CONTACTID`),
  ADD KEY `FK_SELF` (`MANAGERID`);

--
-- Chỉ mục cho bảng `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`COUNTRYID`);

--
-- Chỉ mục cho bảng `county`
--
ALTER TABLE `county`
  ADD PRIMARY KEY (`COUNTYID`,`COUNTRYID`),
  ADD KEY `FK_COUNTRYCOUNTY` (`COUNTRYID`);

--
-- Chỉ mục cho bảng `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DEPARTMENTID`),
  ADD KEY `FK_DIRECTORATEDEPARTMENT` (`DIRECTORATEID`),
  ADD KEY `FK_CONTACTDEPARTMENT` (`CONTACTID`);

--
-- Chỉ mục cho bảng `directorate`
--
ALTER TABLE `directorate`
  ADD PRIMARY KEY (`DIRECTORATEID`),
  ADD KEY `FK_ORGANISATIONDIRECTORATE` (`ORGID`),
  ADD KEY `FK_CONTACTDIRECTORATE` (`CONTACTID`);

--
-- Chỉ mục cho bảng `govofficeregion`
--
ALTER TABLE `govofficeregion`
  ADD PRIMARY KEY (`GOVOFFICEREGIONID`),
  ADD KEY `FK_COUNTRYGOVOFFICEREGION` (`COUNTRYID`),
  ADD KEY `FK_COUNTYGOVOFFICEREGION` (`COUNTYID`);

--
-- Chỉ mục cho bảng `organisation`
--
ALTER TABLE `organisation`
  ADD PRIMARY KEY (`ORGID`),
  ADD KEY `FK_CONTACTORGANISATION` (`CONTACTID`);

--
-- Chỉ mục cho bảng `premise`
--
ALTER TABLE `premise`
  ADD PRIMARY KEY (`PREMISEID`),
  ADD KEY `FK_SERVICEPREMISE` (`SERVICEID`);

--
-- Chỉ mục cho bảng `programme`
--
ALTER TABLE `programme`
  ADD PRIMARY KEY (`PROGRAMMEID`),
  ADD KEY `FK_CONTACTPROGRAMME` (`CONTACTID`);

--
-- Chỉ mục cho bảng `referencedata`
--
ALTER TABLE `referencedata`
  ADD PRIMARY KEY (`REFID`);

--
-- Chỉ mục cho bảng `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`SERVICEID`),
  ADD KEY `FK_CONTACTSERVICE` (`CONTACTID`);

--
-- Chỉ mục cho bảng `supportingmaterial`
--
ALTER TABLE `supportingmaterial`
  ADD PRIMARY KEY (`SUPPORTINGMATERIALID`),
  ADD KEY `FK_ORGANISATIONSUPPORTINGMATERIAL` (`ORGID`),
  ADD KEY `FK_USERSUPPORTINGMATERIAL` (`USERID`);

--
-- Chỉ mục cho bảng `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`TEAMID`),
  ADD KEY `FK_DEPARTMENTTEAM` (`DEPARTMENTID`),
  ADD KEY `FK_CONTACTTEAM` (`CONTACTID`);

--
-- Chỉ mục cho bảng `town`
--
ALTER TABLE `town`
  ADD PRIMARY KEY (`TOWNID`,`COUNTYID`,`COUNTRYID`),
  ADD KEY `FK_COUNTRYTOWN` (`COUNTRYID`),
  ADD KEY `FK_COUNTYTOWN` (`COUNTYID`);

--
-- Chỉ mục cho bảng `trustdistrict`
--
ALTER TABLE `trustdistrict`
  ADD PRIMARY KEY (`TRUSTDISTRICTID`),
  ADD KEY `FK_TRUSTREGIONTRUSTDISTRICT` (`TRUSTREGIONID`);

--
-- Chỉ mục cho bảng `trustregion`
--
ALTER TABLE `trustregion`
  ADD PRIMARY KEY (`TRUSTREGIONID`),
  ADD KEY `FK_COUNTRYTRUSTREGION` (`COUNTRYID`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`USERID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `address`
--
ALTER TABLE `address`
  MODIFY `ADDRESSID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3456736;

--
-- AUTO_INCREMENT cho bảng `contact`
--
ALTER TABLE `contact`
  MODIFY `CONTACTID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=424;

--
-- AUTO_INCREMENT cho bảng `country`
--
ALTER TABLE `country`
  MODIFY `COUNTRYID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `county`
--
ALTER TABLE `county`
  MODIFY `COUNTYID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `department`
--
ALTER TABLE `department`
  MODIFY `DEPARTMENTID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `directorate`
--
ALTER TABLE `directorate`
  MODIFY `DIRECTORATEID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `govofficeregion`
--
ALTER TABLE `govofficeregion`
  MODIFY `GOVOFFICEREGIONID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `organisation`
--
ALTER TABLE `organisation`
  MODIFY `ORGID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=155;

--
-- AUTO_INCREMENT cho bảng `premise`
--
ALTER TABLE `premise`
  MODIFY `PREMISEID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `programme`
--
ALTER TABLE `programme`
  MODIFY `PROGRAMMEID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `referencedata`
--
ALTER TABLE `referencedata`
  MODIFY `REFID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `service`
--
ALTER TABLE `service`
  MODIFY `SERVICEID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `supportingmaterial`
--
ALTER TABLE `supportingmaterial`
  MODIFY `SUPPORTINGMATERIALID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `team`
--
ALTER TABLE `team`
  MODIFY `TEAMID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `town`
--
ALTER TABLE `town`
  MODIFY `TOWNID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `trustdistrict`
--
ALTER TABLE `trustdistrict`
  MODIFY `TRUSTDISTRICTID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `trustregion`
--
ALTER TABLE `trustregion`
  MODIFY `TRUSTREGIONID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `USERID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `FK_COUNTRYADDRESS` FOREIGN KEY (`COUNTRYID`) REFERENCES `country` (`COUNTRYID`),
  ADD CONSTRAINT `FK_COUNTYADDRESS` FOREIGN KEY (`COUNTYID`) REFERENCES `county` (`COUNTYID`),
  ADD CONSTRAINT `FK_TOWNADDRESS` FOREIGN KEY (`TOWNID`) REFERENCES `town` (`TOWNID`);

--
-- Các ràng buộc cho bảng `contact`
--
ALTER TABLE `contact`
  ADD CONSTRAINT `FK_SELF` FOREIGN KEY (`MANAGERID`) REFERENCES `contact` (`CONTACTID`);

--
-- Các ràng buộc cho bảng `county`
--
ALTER TABLE `county`
  ADD CONSTRAINT `FK_COUNTRYCOUNTY` FOREIGN KEY (`COUNTRYID`) REFERENCES `country` (`COUNTRYID`);

--
-- Các ràng buộc cho bảng `department`
--
ALTER TABLE `department`
  ADD CONSTRAINT `FK_CONTACTDEPARTMENT` FOREIGN KEY (`CONTACTID`) REFERENCES `contact` (`CONTACTID`),
  ADD CONSTRAINT `FK_DIRECTORATEDEPARTMENT` FOREIGN KEY (`DIRECTORATEID`) REFERENCES `directorate` (`DIRECTORATEID`);

--
-- Các ràng buộc cho bảng `directorate`
--
ALTER TABLE `directorate`
  ADD CONSTRAINT `FK_CONTACTDIRECTORATE` FOREIGN KEY (`CONTACTID`) REFERENCES `contact` (`CONTACTID`),
  ADD CONSTRAINT `FK_ORGANISATIONDIRECTORATE` FOREIGN KEY (`ORGID`) REFERENCES `organisation` (`ORGID`);

--
-- Các ràng buộc cho bảng `govofficeregion`
--
ALTER TABLE `govofficeregion`
  ADD CONSTRAINT `FK_COUNTRYGOVOFFICEREGION` FOREIGN KEY (`COUNTRYID`) REFERENCES `country` (`COUNTRYID`),
  ADD CONSTRAINT `FK_COUNTYGOVOFFICEREGION` FOREIGN KEY (`COUNTYID`) REFERENCES `county` (`COUNTYID`);

--
-- Các ràng buộc cho bảng `organisation`
--
ALTER TABLE `organisation`
  ADD CONSTRAINT `FK_CONTACTORGANISATION` FOREIGN KEY (`CONTACTID`) REFERENCES `contact` (`CONTACTID`);

--
-- Các ràng buộc cho bảng `premise`
--
ALTER TABLE `premise`
  ADD CONSTRAINT `FK_SERVICEPREMISE` FOREIGN KEY (`SERVICEID`) REFERENCES `service` (`SERVICEID`);

--
-- Các ràng buộc cho bảng `programme`
--
ALTER TABLE `programme`
  ADD CONSTRAINT `FK_CONTACTPROGRAMME` FOREIGN KEY (`CONTACTID`) REFERENCES `contact` (`CONTACTID`);

--
-- Các ràng buộc cho bảng `service`
--
ALTER TABLE `service`
  ADD CONSTRAINT `FK_CONTACTSERVICE` FOREIGN KEY (`CONTACTID`) REFERENCES `contact` (`CONTACTID`);

--
-- Các ràng buộc cho bảng `supportingmaterial`
--
ALTER TABLE `supportingmaterial`
  ADD CONSTRAINT `FK_ORGANISATIONSUPPORTINGMATERIAL` FOREIGN KEY (`ORGID`) REFERENCES `organisation` (`ORGID`),
  ADD CONSTRAINT `FK_USERSUPPORTINGMATERIAL` FOREIGN KEY (`USERID`) REFERENCES `user` (`USERID`);

--
-- Các ràng buộc cho bảng `team`
--
ALTER TABLE `team`
  ADD CONSTRAINT `FK_CONTACTTEAM` FOREIGN KEY (`CONTACTID`) REFERENCES `contact` (`CONTACTID`),
  ADD CONSTRAINT `FK_DEPARTMENTTEAM` FOREIGN KEY (`DEPARTMENTID`) REFERENCES `department` (`DEPARTMENTID`);

--
-- Các ràng buộc cho bảng `town`
--
ALTER TABLE `town`
  ADD CONSTRAINT `FK_COUNTRYTOWN` FOREIGN KEY (`COUNTRYID`) REFERENCES `country` (`COUNTRYID`),
  ADD CONSTRAINT `FK_COUNTYTOWN` FOREIGN KEY (`COUNTYID`) REFERENCES `county` (`COUNTYID`);

--
-- Các ràng buộc cho bảng `trustdistrict`
--
ALTER TABLE `trustdistrict`
  ADD CONSTRAINT `FK_TRUSTREGIONTRUSTDISTRICT` FOREIGN KEY (`TRUSTREGIONID`) REFERENCES `trustregion` (`TRUSTREGIONID`);

--
-- Các ràng buộc cho bảng `trustregion`
--
ALTER TABLE `trustregion`
  ADD CONSTRAINT `FK_COUNTRYTRUSTREGION` FOREIGN KEY (`COUNTRYID`) REFERENCES `country` (`COUNTRYID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
