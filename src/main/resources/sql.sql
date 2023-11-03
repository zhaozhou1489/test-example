CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
                        `code` varchar(50) NOT NULL DEFAULT '' COMMENT '用户code',
                        `name` varchar(100) NOT NULL DEFAULT '' COMMENT '用户名称',
                        `birthday` varchar(20) NOT NULL DEFAULT '' COMMENT '生日',
                        `gender` varchar(10) NOT NULL DEFAULT 'male' COMMENT '性别',
                        `country` varchar(20) NOT NULL DEFAULT '' COMMENT '国家',
                        `create_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建时间',
                        `update_time` bigint(20) NOT NULL DEFAULT '0' COMMENT '更新时间',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4




insert  into `user`(`id`,`code`,`name`,`birthday`,`gender`,`country`,`create_time`,`update_time`) values
(1,'111','Tom Cat','2022-12-11','male','CHN',1692703850673,1692703850673),
(2,'222','Cat Dog','2022-12-12','female','USA',1692703850673,1692703850673),
(3,'333','Dog Cow','2022-12-13','male','USA',1692703850673,1692703850673),
(4,'444','unknown','2022-12-14','male','CHN',1692703850673,1692703850673);
