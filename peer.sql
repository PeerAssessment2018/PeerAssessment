-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2018 at 10:19 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `peer`
--

-- --------------------------------------------------------

--
-- Table structure for table `courseware_studentmodule`
--

CREATE TABLE `courseware_studentmodule` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL,
  `question_id` varchar(255) NOT NULL,
  `state` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `option_details`
--

CREATE TABLE `option_details` (
  `id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL,
  `question_id` varchar(255) NOT NULL,
  `criterion_id` varchar(255) NOT NULL,
  `option_id` varchar(255) NOT NULL,
  `option_description` varchar(255) NOT NULL,
  `option_points` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pa_grade`
--

CREATE TABLE `pa_grade` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `anonymous_assesser_id` int(11) NOT NULL,
  `question_id` varchar(255) NOT NULL,
  `crieteria_id` varchar(255) NOT NULL,
  `grade_points` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `question_details`
--

CREATE TABLE `question_details` (
  `id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL,
  `question_id` varchar(255) NOT NULL,
  `criterion_id` varchar(255) NOT NULL,
  `criterion_prompt` varchar(255) NOT NULL,
  `no_of_options` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_anonymoususerid`
--

CREATE TABLE `student_anonymoususerid` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `anonymous_user_id` varchar(32) NOT NULL,
  `course_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_courseenrollment`
--

CREATE TABLE `student_courseenrollment` (
  `id` int(11) NOT NULL,
  `user-id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_data`
--

CREATE TABLE `student_data` (
  `id` int(11) NOT NULL,
  `username` varchar(150) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(254) NOT NULL,
  `password` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courseware_studentmodule`
--
ALTER TABLE `courseware_studentmodule`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `option_details`
--
ALTER TABLE `option_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pa_grade`
--
ALTER TABLE `pa_grade`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `question_details`
--
ALTER TABLE `question_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_anonymoususerid`
--
ALTER TABLE `student_anonymoususerid`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `anonymous_user_id` (`anonymous_user_id`),
  ADD UNIQUE KEY `course_id` (`course_id`);

--
-- Indexes for table `student_courseenrollment`
--
ALTER TABLE `student_courseenrollment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_data`
--
ALTER TABLE `student_data`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
