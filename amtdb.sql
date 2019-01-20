-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : db
-- Généré le :  Dim 20 jan. 2019 à 11:29
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `amtdb`
--

-- --------------------------------------------------------

--
-- Structure de la table `application`
--

INSERT INTO `application` (`id_application`, `name`, `token`) VALUES
(1, 'decisio', 'abc');

-- --------------------------------------------------------

--
-- Structure de la table `badge`
--
--
-- Déchargement des données de la table `badge`
--

INSERT INTO `badge` (`id_badge`, `name`, `idx_application`) VALUES
(1, 'Master', 1);

-- --------------------------------------------------------

--
-- Structure de la table `event`
--

--
-- Déchargement des données de la table `event`
--

INSERT INTO `event` (`id_event`, `event_type`, `timestamp`, `user_id`, `idx_application`) VALUES
(1, 'Contribution', 'auj', 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `event_properties`
--

-- --------------------------------------------------------

--
-- Structure de la table `point_scale`
--

--
-- Déchargement des données de la table `point_scale`
--

INSERT INTO `point_scale` (`id_point_scale`, `name`, `idx_application`) VALUES
(1, 'Karma', 1),
(2, 'Power', 1);

-- --------------------------------------------------------

--
-- Structure de la table `property`
--

-- --------------------------------------------------------

--
-- Structure de la table `rule`
--

--
-- Déchargement des données de la table `rule`
--

INSERT INTO `rule` (`id_rule`, `event_type`, `name`, `target`, `idx_application`, `idx_point_scale`, `idx_badge`) VALUES
(1, 'Contribution', 'Karma master', 3, 1, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

-- --------------------------------------------------------


COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
