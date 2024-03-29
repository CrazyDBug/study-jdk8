-- 创建表
CREATE TABLE IF NOT EXISTS test_data (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         name VARCHAR(100)
    );


-- 插入数据
INSERT INTO test_data (name) VALUES ('Alice');
