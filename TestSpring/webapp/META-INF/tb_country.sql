/*
Navicat MySQL Data Transfer

Source Server         : 本地PXX的MySQL连接
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : testspring

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2017-10-29 18:33:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_country
-- ----------------------------
DROP TABLE IF EXISTS `tb_country`;
CREATE TABLE `tb_country` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `location` varchar(255) default NULL,
  `totalPeopleNum` int(11) default NULL,
  `createTime` datetime default NULL,
  `localAddress` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_country
-- ----------------------------
INSERT INTO `tb_country` VALUES ('1', 'sdg', 'dfh', '56', '2017-10-27 23:55:43', '{eastdis=\"123\",northdis=\"kopl\",higher=\"89\",temperature=123}');
INSERT INTO `tb_country` VALUES ('2', 'sdgdhfgjf', 'fdshdfh', '897', '2017-10-29 00:27:29', '{\"eastdis\":\"123\",\"northdis\":\"tutyu\",\"higher\":\"dsg\",\"temperature\":123}');
INSERT INTO `tb_country` VALUES ('3', 'sdgdhfgjf', 'fdshdfh', '897', '2017-10-29 00:28:18', '{\"eastdis\":\"123\",\"northdis\":\"tutyu\",\"higher\":\"dsg\",\"temperature\":123}');

-- ----------------------------
-- Table structure for tb_students
-- ----------------------------
DROP TABLE IF EXISTS `tb_students`;
CREATE TABLE `tb_students` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `classname` varchar(255) default NULL,
  `teacherId` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_students
-- ----------------------------
INSERT INTO `tb_students` VALUES ('1', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('2', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('3', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('4', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('5', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('6', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('7', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('8', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('9', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('10', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('11', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('12', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('13', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('14', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('15', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('16', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('17', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('18', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('19', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('20', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('21', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('22', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('23', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('24', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('25', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('26', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('27', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('28', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('29', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('30', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('31', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('32', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('33', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('34', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('35', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('36', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('37', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('38', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('39', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('40', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('41', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('42', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('43', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('44', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('45', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('46', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('47', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('48', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('49', 'VVVVVVV', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('50', 'PPPPPP', 'fdhdfhd', '1');
INSERT INTO `tb_students` VALUES ('51', 'asdf', 'OOOOOOOO', '1');
INSERT INTO `tb_students` VALUES ('52', 'asdf', 'LLLLLLLLLLLL', '1');
INSERT INTO `tb_students` VALUES ('53', 'asdf', 'fdhdfhd', '2');
INSERT INTO `tb_students` VALUES ('54', 'asdf', 'fdhdfhd', '2');

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `age` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------
INSERT INTO `tb_teacher` VALUES ('1', '123', '45');
INSERT INTO `tb_teacher` VALUES ('2', 'hjlkl', '12');
INSERT INTO `tb_teacher` VALUES ('3', '123', '67');
INSERT INTO `tb_teacher` VALUES ('4', 'hjlkl', '24');
INSERT INTO `tb_teacher` VALUES ('5', '123', '45');
INSERT INTO `tb_teacher` VALUES ('6', 'hjlkl', '12');
INSERT INTO `tb_teacher` VALUES ('7', '123', '67');
INSERT INTO `tb_teacher` VALUES ('8', 'hjlkl', '24');
INSERT INTO `tb_teacher` VALUES ('9', '123', '45');
INSERT INTO `tb_teacher` VALUES ('10', 'hjlkl', '12');
INSERT INTO `tb_teacher` VALUES ('11', '123', '67');
INSERT INTO `tb_teacher` VALUES ('12', 'hjlkl', '24');

-- ----------------------------
-- Table structure for tb_userbaseinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_userbaseinfo`;
CREATE TABLE `tb_userbaseinfo` (
  `id` int(11) NOT NULL auto_increment COMMENT '主键id',
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) default NULL COMMENT '密码',
  `md5code` varchar(255) default NULL COMMENT '密码编译的md5码',
  `description` varchar(255) default NULL COMMENT '用户描述',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户基本信息表';

-- ----------------------------
-- Records of tb_userbaseinfo
-- ----------------------------
INSERT INTO `tb_userbaseinfo` VALUES ('1', 'wqrqw', 'eqre', 'werwer', 'werwer');
INSERT INTO `tb_userbaseinfo` VALUES ('2', 'eewr', 'werw', 'werwe', 'werwer');

-- ----------------------------
-- Table structure for test_users
-- ----------------------------
DROP TABLE IF EXISTS `test_users`;
CREATE TABLE `test_users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `email` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_users
-- ----------------------------
INSERT INTO `test_users` VALUES ('1', '223', '12312', '12312312');
INSERT INTO `test_users` VALUES ('2', 'sdf', 'dfsgdsf', 'dfgdsfg');
INSERT INTO `test_users` VALUES ('3', 'dsfgdf', 'dfhfgj', 'gkhgjkgh');
INSERT INTO `test_users` VALUES ('4', 'jktyut', 'werxcvb', 'hjkjklop');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `email` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '223', '12312', '12312312');
INSERT INTO `users` VALUES ('2', 'sdf', 'dfsgdsf', 'dfgdsfg');
INSERT INTO `users` VALUES ('3', 'dsfgdf', 'dfhfgj', 'gkhgjkgh');
INSERT INTO `users` VALUES ('4', 'jktyut', 'werxcvb', 'hjkjklop');
