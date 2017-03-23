insert into t_category(id, parent_id, category_level, create_time, category_name) values(1,  null, 1, CURRENT_TIMESTAMP(), '家用电器');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(2,  1,    2, CURRENT_TIMESTAMP(), '电视');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(3,  2,    3, CURRENT_TIMESTAMP(), '合资品牌');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(4,  2,    3, CURRENT_TIMESTAMP(), '国产品牌');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(5,  2,    3, CURRENT_TIMESTAMP(), '互联网品牌');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(6,  1,    2, CURRENT_TIMESTAMP(), '冰箱');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(7,  6,    3, CURRENT_TIMESTAMP(), '多门');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(8,  6,    3, CURRENT_TIMESTAMP(), '对开门');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(9,  6,    3, CURRENT_TIMESTAMP(), '三门');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(10, 6,    3, CURRENT_TIMESTAMP(), '双门');

insert into t_category(id, parent_id, category_level, create_time, category_name) values(11, null, 1, CURRENT_TIMESTAMP(), '电脑办公');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(12, 11,   2, CURRENT_TIMESTAMP(), '电脑整机');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(13, 12,   3, CURRENT_TIMESTAMP(), '笔记本');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(14, 12,   3, CURRENT_TIMESTAMP(), '台式机');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(15, 12,   3, CURRENT_TIMESTAMP(), '服务器');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(16, 11,   2, CURRENT_TIMESTAMP(), '电脑配件');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(17, 11,   3, CURRENT_TIMESTAMP(), 'CPU');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(18, 11,   3, CURRENT_TIMESTAMP(), '主板');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(19, 11,   3, CURRENT_TIMESTAMP(), '内存');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(20, 11,   3, CURRENT_TIMESTAMP(), '显卡');
insert into t_category(id, parent_id, category_level, create_time, category_name) values(21, 11,   3, CURRENT_TIMESTAMP(), '硬盘');

insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(1, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/01.jpg', '商品1', '好东西1', 998,  1);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(2, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/02.jpg', '商品2', '好东西2', 99.8, 0);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(3, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/03.jpg', '商品3', '好东西3', 9.98, 1);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(4, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/04.jpg', '商品4', '好东西4', 8.98, 1);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(5, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/05.jpg', '商品5', '好东西5', 7.98, 1);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(6, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/06.jpg', '商品6', '好东西6', 6.98, 1);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(7, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/07.jpg', '商品7', '好东西7', 5.98, 1);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(8, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/08.jpg', '商品8', '好东西8', 4.98, 1);
insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(9, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/09.jpg', '商品9', '好东西9', 3.98, 1);

insert into t_product(id, create_time, image, `name`, overview, price, product_status)  values(10, CURRENT_TIMESTAMP(), 'http://image.eastseven.cn/heads/10.jpg', '商品10', '好东西10', 19.98, 1);