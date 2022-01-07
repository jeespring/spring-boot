DROP TABLE IF EXISTS t_order_0,t_order_1,t_order_item_0,t_order_item_1;

CREATE TABLE `t_order_0` (
                             `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
                             `user_id` bigint NOT NULL DEFAULT '0' COMMENT '用户Id',
                             `amount` bigint NOT NULL DEFAULT '0' COMMENT '订单金额',
                             `address` varchar(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '收获地址',
                             `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                             `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                             PRIMARY KEY (`id`),
                             KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_order_1` (
                             `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
                             `user_id` bigint NOT NULL DEFAULT '0' COMMENT '用户Id',
                             `amount` bigint NOT NULL DEFAULT '0' COMMENT '订单金额',
                             `address` varchar(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '收获地址',
                             `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                             `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                             PRIMARY KEY (`id`),
                             KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_order_item_0` (
                                  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
                                  `order_id` bigint NOT NULL DEFAULT '0' COMMENT '订单Id',
                                  `user_id` bigint NOT NULL DEFAULT '0' COMMENT '用户Id',
                                  `commodity_code` varchar(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '商品编码',
                                  `commodity_name` varchar(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '商品名称',
                                  `price` bigint NOT NULL DEFAULT '0' COMMENT '商品价格',
                                  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                  PRIMARY KEY (`id`),
                                  KEY `idx_user_id` (`user_id`),
                                  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_order_item_1` (
                                  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
                                  `order_id` bigint NOT NULL DEFAULT '0' COMMENT '订单Id',
                                  `user_id` bigint NOT NULL DEFAULT '0' COMMENT '用户Id',
                                  `commodity_code` varchar(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '商品编码',
                                  `commodity_name` varchar(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '商品名称',
                                  `price` bigint NOT NULL DEFAULT '0' COMMENT '商品价格',
                                  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                  PRIMARY KEY (`id`),
                                  KEY `idx_user_id` (`user_id`),
                                  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;