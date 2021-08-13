CREATE TABLE `trans_order` (
                               `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键 id',
                               `order_no` varchar(32) NOT NULL COMMENT '订单号',
                               `user_id` varchar(32) NOT NULL COMMENT '用户id',
                               `order_amount` bigint NOT NULL COMMENT '交易金额',
                               `orderStatus` tinyint NOT NULL COMMENT '订单状态',
                               `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
                               `update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
                               PRIMARY KEY (`id`) USING BTREE,
                               UNIQUE KEY `uniq_order_no` (`order_no`) USING BTREE COMMENT '用户唯一索引'
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单表';

INSERT INTO trans_order (id, order_no, user_id, order_amount, orderStatus, create_time, update_time) VALUES (1, '10000001', '1001', 100, 1, '2021-08-13 19:12:42.429', '2021-08-13 19:12:42.429');
INSERT INTO trans_order (id, order_no, user_id, order_amount, orderStatus, create_time, update_time) VALUES (2, '10000002', '1001', 200, 1, '2021-08-14 19:12:42.429', '2021-08-13 19:16:11.766');
INSERT INTO trans_order (id, order_no, user_id, order_amount, orderStatus, create_time, update_time) VALUES (3, '10000003', '1001', 300, 1, '2021-08-15 19:12:42.429', '2021-08-13 19:16:11.776');
INSERT INTO trans_order (id, order_no, user_id, order_amount, orderStatus, create_time, update_time) VALUES (4, '10000004', '1001', 400, 1, '2021-08-16 19:12:42.429', '2021-08-13 19:16:11.757');
INSERT INTO trans_order (id, order_no, user_id, order_amount, orderStatus, create_time, update_time) VALUES (5, '10000005', '1001', 500, 1, '2021-08-17 19:12:42.429', '2021-08-13 19:16:11.771');


CREATE TABLE `user` (
                        `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键 id',
                        `user_id` varchar(32) NOT NULL COMMENT '用户id',
                        `balance` bigint NOT NULL COMMENT '用户余额',
                        `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
                        `update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
                        PRIMARY KEY (`id`) USING BTREE,
                        UNIQUE KEY `uniq_user_id` (`user_id`) USING BTREE COMMENT '用户唯一索引',
                        KEY `idx_create_time` (`create_time`) COMMENT '创建时间',
                        KEY `idx_update_time` (`update_time`) COMMENT '更新时间'
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表'