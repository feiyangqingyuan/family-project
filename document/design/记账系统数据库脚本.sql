-- 用户表
CREATE TABLE `book_keeping`.`user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) NOT NULL COMMENT '名称',
  `login_name` varchar(20) NULL COMMENT '登录名',
  `login_password` varchar(20) NULL COMMENT '登录密码',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` bigint(20) NULL COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_by` bigint(20) NULL COMMENT '修改人',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除，0=未删除，1=已删除',
  PRIMARY KEY (`id`)
);

-- 消费记录表
CREATE TABLE `book_keeping`.`expenses_record`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `amount` decimal NOT NULL DEFAULT 0 COMMENT '金额',
  `description` varchar(50) NULL COMMENT '描述',
  `consumption_date` date NOT NULL COMMENT '消费日期',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` bigint(20) NULL COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_by` bigint(20) NULL COMMENT '修改人',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除，0=未删除，1=已删除',
  PRIMARY KEY (`id`),
  INDEX `idx_consumption_date`(`consumption_date`) USING BTREE COMMENT '消费日期索引'
);