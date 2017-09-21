/*
Navicat MySQL Data Transfer

Source Server         : LocalHostMySQL
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : testspring

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-03-27 22:25:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_operate_log
-- ----------------------------
DROP TABLE IF EXISTS `tb_operate_log`;
CREATE TABLE `tb_operate_log` (
  `logId` int(11) NOT NULL AUTO_INCREMENT COMMENT '日志编号',
  `class` varchar(500) DEFAULT NULL COMMENT '类名',
  `method` varchar(255) DEFAULT NULL COMMENT '方法名',
  `createTime` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `logLevel` varchar(255) DEFAULT NULL COMMENT '日志级别',
  `logMsg` text COMMENT '日志信息',
  `userType` varchar(255) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`logId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户操作日志信息表';
