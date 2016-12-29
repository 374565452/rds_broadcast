/*
Navicat MySQL Data Transfer

Source Server         : 12
Source Server Version : 50132
Source Host           : localhost:3306
Source Database       : rds

Target Server Type    : MYSQL
Target Server Version : 50132
File Encoding         : 65001

Date: 2016-07-30 15:30:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `audio_resource`
-- ----------------------------
DROP TABLE IF EXISTS `audio_resource`;
CREATE TABLE `audio_resource` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL COMMENT 'dir:目录, file:文件',
  `parent_id` int(10) DEFAULT NULL,
  `resource_status_id` int(2) NOT NULL COMMENT '状态信息，通过，未审核，退回',
  `upload_user_id` int(10) DEFAULT NULL COMMENT '上传用户',
  `operator` int(10) DEFAULT NULL COMMENT '最后操作人',
  `operate_date` datetime DEFAULT NULL COMMENT '最后操作时间',
  `operate_comment` varchar(100) DEFAULT NULL COMMENT '最后操作备注',
  `date_created` datetime DEFAULT NULL,
  `deleted` int(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2362 DEFAULT CHARSET=utf8 COMMENT='媒体资源';

-- ----------------------------
-- Records of audio_resource
-- ----------------------------

-- ----------------------------
-- Table structure for `device`
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `uid` varchar(40) NOT NULL,
  `deviceTypeUid` varchar(40) NOT NULL,
  `deviceNo` varchar(30) NOT NULL COMMENT '设备的id号，与设备中的id一致',
  `devicePropValue` varchar(50) DEFAULT NULL COMMENT '设备属性',
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `deviceStatus` varchar(16) NOT NULL COMMENT '设备状态信息，与设备状态表进行联动操作',
  `deviceFmOut` int(11) DEFAULT NULL,
  `deviceFmRecv` int(11) DEFAULT NULL,
  `deviceVol` int(11) NOT NULL DEFAULT '31' COMMENT '设备默认音量',
  `deviceIp` varchar(32) DEFAULT NULL,
  `deviceGateWay` varchar(32) DEFAULT NULL,
  `deviceMask` varchar(32) DEFAULT NULL,
  `deviceDns` varchar(32) DEFAULT NULL,
  `deviceServerIp` varchar(32) DEFAULT NULL,
  `deviceServerPort` varchar(32) DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device
-- ----------------------------

-- ----------------------------
-- Table structure for `device_status`
-- ----------------------------
DROP TABLE IF EXISTS `device_status`;
CREATE TABLE `device_status` (
  `uid` varchar(40) NOT NULL,
  `deviceStatusName` varchar(30) NOT NULL,
  `deviceStatusValue` varchar(16) NOT NULL,
  `deviceTrueName` varchar(30) DEFAULT NULL,
  `deviceErrorName` varchar(30) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `remark` text,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device_status
-- ----------------------------
INSERT INTO `device_status` VALUES ('b686c57a-b547-4d91-99be-a58aaf4aa57f', '网络连接状态', '8000000000000000', '连接', ' 未连接', '0', '设备的网络连接状态指示', '2016-07-20 17:34:10', '2016-07-20 17:34:14');

-- ----------------------------
-- Table structure for `device_type`
-- ----------------------------
DROP TABLE IF EXISTS `device_type`;
CREATE TABLE `device_type` (
  `uid` varchar(40) NOT NULL,
  `deviceTypeName` varchar(20) NOT NULL,
  `deviceTypeValue` varchar(40) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态信息，0为可用',
  `remark` text,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device_type
-- ----------------------------
INSERT INTO `device_type` VALUES ('ae5091ca-cdfa-4fa2-9b4a-ed12ab7d8428', '编码调制一体机', 'ae5091ca-cdfa-4fa2-9b4a-ed12ab7d8428', '编码调制一体机，集成编码与调制', '0', '编码调制一体机，集成编码与调制', '2016-07-20 17:38:40', '2016-07-20 17:38:46');

-- ----------------------------
-- Table structure for `sys_action`
-- ----------------------------
DROP TABLE IF EXISTS `sys_action`;
CREATE TABLE `sys_action` (
  `uid` varchar(40) NOT NULL,
  `actionKey` varchar(200) NOT NULL COMMENT '动作唯一键。key与name组成一对键值对',
  `actionName` varchar(50) NOT NULL,
  `actionUrl` varchar(50) NOT NULL,
  `level` int(11) NOT NULL,
  `parentUid` varchar(50) NOT NULL,
  `actionType` varchar(30) NOT NULL COMMENT '操作类型，应该从字典表中来取值。动作类型可分为菜单，一级菜单，二级菜单，动作按钮，动作链接等',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '动作状态，0为可用，1为不可用。默认为0',
  `remark` text,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_action
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_dict`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `uid` varchar(40) COLLATE utf8_bin NOT NULL COMMENT '编号',
  `dictValue` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '数据值',
  `dictName` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '标签名',
  `dictType` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '类型',
  `description` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '描述',
  `parentUid` varchar(40) COLLATE utf8_bin DEFAULT '0' COMMENT '父级编号',
  `createBy` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '创建者',
  `createDate` datetime NOT NULL COMMENT '创建时间',
  `updateBy` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '更新者',
  `updateDate` datetime NOT NULL COMMENT '更新时间',
  `remark` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`uid`),
  KEY `sys_dict_value` (`dictValue`),
  KEY `sys_dict_label` (`dictName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='字典表';

-- ----------------------------
-- Records of sys_dict
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `uid` varchar(40) NOT NULL DEFAULT '导航菜单编号',
  `menuKey` varchar(200) NOT NULL COMMENT '菜单唯一键，其中key与name组成唯一键',
  `menuName` varchar(50) NOT NULL COMMENT '菜单名称',
  `menuUrl` varchar(100) DEFAULT NULL COMMENT '菜单链接',
  `parentId` varchar(40) DEFAULT '0',
  `iconRemark` varchar(100) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL COMMENT '前端菜单、后台菜单',
  `status` int(4) NOT NULL DEFAULT '0',
  `remark` varchar(255) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('2dc31491-6a35-4ef0-aef9-96b8609fd4c9', 'index_menu', '首页', '#/device/list', '0', 'glyphicon glyphicon-th-large', null, '0', '首页菜单', '2016-07-27 09:21:12', '2016-07-27 09:21:19');
INSERT INTO `sys_menu` VALUES ('32db4732-4e65-4bc8-83ba-244c2f3e382f', 'device_manager', ' 设备管理', '#deviceManager', '0', 'glyphicon glyphicon-cog', null, '0', '设备管理主菜单，所有设备相关的操作菜单都是此菜单的子菜单', '2016-07-27 09:23:58', '2016-07-27 09:24:01');
INSERT INTO `sys_menu` VALUES ('8bcd7b8c-f440-40c8-a542-b901c58e2f4a', 'device_list', ' 设备列表', '#/device/list', '32db4732-4e65-4bc8-83ba-244c2f3e382f', 'glyphicon glyphicon-th-list', null, '0', '设备列表子菜单', '2016-07-27 09:25:49', '2016-07-27 09:25:52');
INSERT INTO `sys_menu` VALUES ('928d28c3-a65c-41dd-aacf-f68c9d9da981', 'broadcast_manager', ' 播控管理', '#broadcastManager', '0', 'glyphicon glyphicon-credit-card', null, '0', '播控管理主菜单，所以播控管理相关的操作菜单都是这个菜单的子菜单', '2016-07-27 09:28:35', '2016-07-27 09:28:39');
INSERT INTO `sys_menu` VALUES ('b741f7cd-7a7d-4c47-926a-aaf013e7a099', 'media_list', '媒体资源管理', '#/media/list', '928d28c3-a65c-41dd-aacf-f68c9d9da981', 'glyphicon glyphicon-globe', null, '0', '媒体资源管理子菜单', '2016-07-27 09:31:05', '2016-07-27 09:31:08');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `uid` varchar(40) NOT NULL,
  `roleName` varchar(30) NOT NULL,
  `roleType` varchar(30) NOT NULL COMMENT '应该是数据字典中的值---对应于字典中的某个值',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态信息，表示是否可用。0为可用。1为不可用。',
  `remark` text,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_roleaction`
-- ----------------------------
DROP TABLE IF EXISTS `sys_roleaction`;
CREATE TABLE `sys_roleaction` (
  `uid` varchar(40) NOT NULL,
  `actionUid` varchar(40) NOT NULL,
  `roleUid` varchar(40) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roleaction
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_rolemenu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_rolemenu`;
CREATE TABLE `sys_rolemenu` (
  `uid` varchar(40) NOT NULL,
  `roleUid` varchar(40) NOT NULL,
  `menuUid` varchar(40) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_rolemenu
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `uid` varchar(40) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(40) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '用户信息状态，0为可用，1为锁住，2为停用。200为超级管理员用户',
  `telphone` varchar(20) DEFAULT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `remark` text,
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('f4f6cda2-331b-4dc5-8ecb-43fad7251da9', 'administrator', '1b3231655cebb7a1f783eddf27d254ca', '200', null, null, '超级管理员用户，不可删除、更改', '2016-07-29 15:10:07', '2016-07-29 15:10:09');

-- ----------------------------
-- Table structure for `sys_userrole`
-- ----------------------------
DROP TABLE IF EXISTS `sys_userrole`;
CREATE TABLE `sys_userrole` (
  `uid` varchar(40) NOT NULL,
  `userUid` varchar(40) NOT NULL,
  `roleUid` varchar(40) NOT NULL,
  PRIMARY KEY (`uid`),
  KEY `useruid` (`userUid`),
  KEY `roleuid` (`roleUid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_userrole
-- ----------------------------
