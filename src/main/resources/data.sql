DROP TABLE IF EXISTS mall_user;

CREATE TABLE mall_user
(
    id             INT AUTO_INCREMENT PRIMARY KEY,
    username       VARCHAR(255) NOT NULL,
    password       VARCHAR(255) NOT NULL,
    email          VARCHAR(255) NULL,
    `created_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
);
