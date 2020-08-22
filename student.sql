/*
 Navicat Premium Data Transfer

 Source Server         : Sakura
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : sakura

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 23/08/2020 01:45:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sno` int(11) NULL DEFAULT NULL,
  `sname` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sage` int(11) NULL DEFAULT NULL,
  `ssex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sheight` int(11) NULL DEFAULT NULL,
  `sweidht` int(11) NULL DEFAULT NULL,
  `sbirthday` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spsw` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sflag` int(11) NULL DEFAULT 1,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 1001, '张三', 18, '男', 173, 120, '1999-01-01', '1001', 1);
INSERT INTO `student` VALUES (2, 1002, '李四', 18, '男', 170, 135, '1999-02-02', '1002', 1);
INSERT INTO `student` VALUES (3, 1003, '王五', 20, '男', 160, 150, '1999-03-03', '1003', 1);
INSERT INTO `student` VALUES (4, 1004, '赵六', 19, '女', 180, 200, '1999-04-04', '1004', 1);
INSERT INTO `student` VALUES (5, 1005, 'Sakura', 18, '男', 178, 120, '1999-05-05', '1005', 1);
INSERT INTO `student` VALUES (6, 1006, 'Erii', 17, '女', 165, 90, '1999-06-06', '1006', 1);
INSERT INTO `student` VALUES (7, 1007, 'qwer', 23, '女', 190, 100, '1999-07-07', '1007', 1);
INSERT INTO `student` VALUES (10, 645651, 'jkhfskdjf', 155, 'nv', 5165, 512, '1222-13-14', 'aushd', 1);

SET FOREIGN_KEY_CHECKS = 1;
