--�������ű����
CREATE TABLE news_tile (id INT AUTO_INCREMENT PRIMARY KEY COMMENT '����',
title VARCHAR(255) COMMENT '����',
create_time DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
url VARCHAR(255) COMMENT '��Ӧ�����ӵ�ַ' );
