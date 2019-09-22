/*
Navicat MySQL Data Transfer

Source Server         : db_xph
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : ssmtemplate1

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-09-22 22:12:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(255) DEFAULT NULL,
  `roleDesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('1', 'USER', '普通用户');
INSERT INTO `roles` VALUES ('2', 'ADMIN', '管理员');
INSERT INTO `roles` VALUES ('3', 'SADMIN', '超级管理员');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '1716143223', '1716143223', '1');
INSERT INTO `users` VALUES ('2', '3113', '3113', '1');
INSERT INTO `users` VALUES ('3', '123456', '123456', '0');
INSERT INTO `users` VALUES ('5', 'xupenghui', '1716143223', '1');
INSERT INTO `users` VALUES ('8', '徐鹏辉', '123456', '1');
