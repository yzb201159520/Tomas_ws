/*
Navicat MySQL Data Transfer

Source Server         : 本地PXX的MySQL连接
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : testspring

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2017-03-26 11:31:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_userbaseinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_userbaseinfo`;
CREATE TABLE `tb_userbaseinfo` (
  `id` int(11) NOT NULL COMMENT '主键id',
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) default NULL COMMENT '密码',
  `md5code` varchar(255) default NULL COMMENT '密码编译的md5码',
  `description` varchar(255) default NULL COMMENT '用户描述',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户基本信息表';
