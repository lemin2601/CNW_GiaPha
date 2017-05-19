-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 19, 2017 lúc 07:20 SA
-- Phiên bản máy phục vụ: 10.1.21-MariaDB
-- Phiên bản PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `db_giapha`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `active_user`
--

CREATE TABLE `active_user` (
  `id_user` bigint(20) NOT NULL,
  `key_user` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `active_user`
--

INSERT INTO `active_user` (`id_user`, `key_user`, `id`) VALUES
(1, '0A3648-FCE262-CD2430-B4D7EA-96BEB4-1D0C87-846F', 1495118429122),
(1, '0A3648-FCE262-CD2430-B4D7EA-96BEB4-1D0C87-846F', 1495118436604),
(1, '0A3648-FCE262-CD2430-B4D7EA-96BEB4-1D0C87-846F', 1495119080561),
(1495121675657, '5F79DC-D23583-9F6156-696F20-4ADB9A-B2BCBF-6DC9', 1495121675730),
(1495121703867, '5F79DC-D23583-9F6156-696F20-4ADB9A-B2BCBF-6DC9', 1495121703901);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `genealogy`
--

CREATE TABLE `genealogy` (
  `id` bigint(20) NOT NULL,
  `name` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `note` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `marry`
--

CREATE TABLE `marry` (
  `id_male` int(11) NOT NULL,
  `id_female` int(11) NOT NULL,
  `active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `marry`
--

INSERT INTO `marry` (`id_male`, `id_female`, `active`) VALUES
(4, 3, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `people`
--

CREATE TABLE `people` (
  `id` bigint(20) NOT NULL,
  `first_name` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `alias` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birth_day` date NOT NULL,
  `dead_day` date DEFAULT NULL,
  `sex` tinyint(1) NOT NULL,
  `address` text COLLATE utf8_unicode_ci,
  `id_gia_pha` bigint(20) NOT NULL,
  `img` varchar(150) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `people`
--

INSERT INTO `people` (`id`, `first_name`, `last_name`, `alias`, `birth_day`, `dead_day`, `sex`, `address`, `id_gia_pha`, `img`) VALUES
(0, 'Ông', 'Tổ', NULL, '2000-01-01', '2000-02-02', 1, 'Đà Nẵng', 0, ''),
(1, 'Bà', 'Tổ', NULL, '2000-02-02', '2000-03-03', 0, 'Quảng Nam', 0, ''),
(2, 'Con', 'Trai', 'con', '1995-02-02', '1995-05-20', 1, 'Đà Nẵng', 0, ''),
(3, 'Con', 'Gái', 'con gái', '1995-01-30', '2000-06-20', 0, 'Đà Nẵng', 0, ''),
(4, 'Chồn', '1', 'chong', '1995-01-30', '1999-01-20', 1, 'Quảng Nam', 0, '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `relationship`
--

CREATE TABLE `relationship` (
  `id` bigint(11) NOT NULL,
  `id_father` bigint(11) NOT NULL,
  `id_mother` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `relationship`
--

INSERT INTO `relationship` (`id`, `id_father`, `id_mother`) VALUES
(2, 1, 0),
(3, 1, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `username` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `pass` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `roles` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `username`, `pass`, `email`, `roles`) VALUES
(1, 'admin', 'admin', 'admin@gmail.com', 5),
(1495112440219, '1', '1', '1', 0),
(1495112478350, '12', '12', '12', 0),
(1495112524772, 'b', 'bpass', 'b@gmail.com', 0),
(1495112608719, 'c', 'ca', 'c@', 0),
(1495112651025, 'bv', 'vv', 'v', 0),
(1495116607512, 'a', 'a', 'a', 0),
(1495116634084, 'ab', 'a', 'ab', 0),
(1495116689957, 'abc', 'a', 'abc', 0),
(1495116791022, 'u', 'p', 'e', 0),
(1495116856351, 'u1', 'p', 'e1', 0),
(1495116863159, 'u1', 'p', 'e1', 0),
(1495116868374, 'u1', 'p', 'e1', 0),
(1495116885024, 'u1', 'p', 'e1', 0),
(1495116930507, 'a1', 'a', 'a1', 0),
(1495121675657, 'u1', 'p', 'e1', 0),
(1495121703867, 'u1', 'p', 'e1', 0),
(1495122032637, 'lemin2601', 'trungdinh1', 'lemin2601@gmail.com', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user_genealogy`
--

CREATE TABLE `user_genealogy` (
  `id_user` int(11) NOT NULL,
  `id_genealogy` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `active_user`
--
ALTER TABLE `active_user`
  ADD PRIMARY KEY (`id_user`,`id`);

--
-- Chỉ mục cho bảng `genealogy`
--
ALTER TABLE `genealogy`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `marry`
--
ALTER TABLE `marry`
  ADD PRIMARY KEY (`id_male`,`id_female`);

--
-- Chỉ mục cho bảng `people`
--
ALTER TABLE `people`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_gia_pha` (`id_gia_pha`);

--
-- Chỉ mục cho bảng `relationship`
--
ALTER TABLE `relationship`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_father` (`id_father`),
  ADD KEY `id_mother` (`id_mother`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `user_genealogy`
--
ALTER TABLE `user_genealogy`
  ADD PRIMARY KEY (`id_user`,`id_genealogy`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
