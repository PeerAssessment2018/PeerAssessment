-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2018 at 08:14 AM
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
-- Database: `peer_assessment`
--

-- --------------------------------------------------------

--
-- Table structure for table `author_coursecreated`
--

CREATE TABLE `author_coursecreated` (
  `id` int(11) NOT NULL,
  `author_id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `author_data`
--

CREATE TABLE `author_data` (
  `id` int(11) NOT NULL,
  `username` varchar(150) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(254) NOT NULL,
  `password` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `courseware_studentmodule`
--

CREATE TABLE `courseware_studentmodule` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL,
  `question_id` varchar(255) NOT NULL,
  `state` longtext NOT NULL,
  `self_assessed_grade` int(11) DEFAULT NULL
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

--
-- Dumping data for table `option_details`
--

INSERT INTO `option_details` (`id`, `course_id`, `question_id`, `criterion_id`, `option_id`, `option_description`, `option_points`) VALUES
(5, 'course 1', 'ques', 'c1', 'oc1', 'oc1d', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pa_grade`
--

CREATE TABLE `pa_grade` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `anonymous_assesser_id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL,
  `question_id` varchar(255) NOT NULL,
  `criteria_id` varchar(255) NOT NULL,
  `grade_points` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pa_grade`
--

INSERT INTO `pa_grade` (`id`, `user_id`, `anonymous_assesser_id`, `course_id`, `question_id`, `criteria_id`, `grade_points`) VALUES
(1, 1, 234, 'course1', 'ques', 'c2', 1),
(2, 1, 234, 'course1', 'ques', ' c1 ', 2),
(3, 1, 234, 'course1', 'ques', 'c3', 3),
(4, 1, 256, 'course1', 'ques', 'c2', 4),
(5, 1, 256, 'course1', 'ques', ' c1 ', 5),
(6, 1, 256, 'course1', 'ques', 'c3', 6);

-- --------------------------------------------------------

--
-- Table structure for table `question_details`
--

CREATE TABLE `question_details` (
  `id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL,
  `question_id` text NOT NULL,
  `no_assessors` int(11) NOT NULL,
  `no_assessment` int(11) NOT NULL,
  `criterion_id` varchar(255) DEFAULT NULL,
  `criterion_prompt` varchar(255) DEFAULT NULL,
  `no_of_options` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question_details`
--

INSERT INTO `question_details` (`id`, `course_id`, `question_id`, `no_assessors`, `no_assessment`, `criterion_id`, `criterion_prompt`, `no_of_options`) VALUES
(1, 'course1', 'ques', 3, 3, 'c2', 'c2d', 2),
(2, 'course1', 'ques', 3, 3, ' c1 ', 'c1d ', 1),
(3, 'course1', 'ques', 3, 3, 'c3', 'c3d', 3);

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

--
-- Dumping data for table `student_anonymoususerid`
--

INSERT INTO `student_anonymoususerid` (`id`, `user_id`, `anonymous_user_id`, `course_id`) VALUES
(5, 7, '484574', 'hell1'),
(6, 7, '856873', 'hell2'),
(7, 7, '993441', 'hell3');

-- --------------------------------------------------------

--
-- Table structure for table `student_courseenrollment`
--

CREATE TABLE `student_courseenrollment` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `course_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_courseenrollment`
--

INSERT INTO `student_courseenrollment` (`id`, `user_id`, `course_id`) VALUES
(10, 7, 'hell1'),
(11, 7, 'hell2'),
(12, 7, 'hell3'),
(13, 7, 'hell1'),
(14, 7, 'hell2'),
(15, 7, 'hell3');

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
-- Dumping data for table `student_data`
--

INSERT INTO `student_data` (`id`, `username`, `first_name`, `last_name`, `email`, `password`) VALUES
(7, 'asdfg', 'asd', 'fg', 'qwe@gm.com', '12@wd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `author_coursecreated`
--
ALTER TABLE `author_coursecreated`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `author_data`
--
ALTER TABLE `author_data`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`);

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

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `author_coursecreated`
--
ALTER TABLE `author_coursecreated`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `author_data`
--
ALTER TABLE `author_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `courseware_studentmodule`
--
ALTER TABLE `courseware_studentmodule`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `option_details`
--
ALTER TABLE `option_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pa_grade`
--
ALTER TABLE `pa_grade`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `question_details`
--
ALTER TABLE `question_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `student_anonymoususerid`
--
ALTER TABLE `student_anonymoususerid`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `student_courseenrollment`
--
ALTER TABLE `student_courseenrollment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `student_data`
--
ALTER TABLE `student_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
