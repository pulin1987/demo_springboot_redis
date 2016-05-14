
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `userId` varchar(32) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `isdeleted` int(1) NOT NULL DEFAULT '0' COMMENT '0未删除,1已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_userId` (`userId`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '064DA69C671C422C9EC66BD6ED1C35E6', '赵家人', '20', '大天朝', '0');
INSERT INTO `user` VALUES ('2', '00756AFF07394D139B1F2F1D148BD6BE', '雷不死', '22', '北京市昌平区', '0');
INSERT INTO `user` VALUES ('3', '02253B338D28476EB709ED9D740FE19B', '王二小', '1112', '陕西省西安市雁塔区', '0');
