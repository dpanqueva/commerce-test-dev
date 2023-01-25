INSERT INTO `brands` (`name`) VALUES ('ZARA');
INSERT INTO `brands` (`name`) VALUES ('H&M');

INSERT INTO `products` (`product_id`, `name`) VALUES ('35455', 'JEAN');

INSERT INTO `prices_list` (`value_price`) VALUES ('1');
INSERT INTO `prices_list` (`value_price`) VALUES ('2');
INSERT INTO `prices_list` (`value_price`) VALUES ('3');
INSERT INTO `prices_list` (`value_price`) VALUES ('4');
INSERT INTO `prices_list` (`value_price`) VALUES ('5');

INSERT INTO `prices` (`start_date`, `end_date`, `priority`, `price`, `curr`, `brand_id`, `prices_list_id`, `product_id`) VALUES ('2020-06-14 00:00:00', '2020-12-31 23:59:59', '0', '35.50', 'EUR', '1', '1', '35455');
INSERT INTO `prices` (`start_date`, `end_date`, `priority`, `price`, `curr`, `brand_id`, `prices_list_id`, `product_id`) VALUES ('2020-06-14 15:00:00', '2020-06-14 18:30:00', '1', '25.45', 'EUR', '1', '2', '35455');
INSERT INTO `prices` (`start_date`, `end_date`, `priority`, `price`, `curr`, `brand_id`, `prices_list_id`, `product_id`) VALUES ('2020-06-15 00:00:00', '2020-06-15 11:00:00', '1', '30.50', 'EUR', '1', '3', '35455');
INSERT INTO `prices` (`start_date`, `end_date`, `priority`, `price`, `curr`, `brand_id`, `prices_list_id`, `product_id`) VALUES ('2020-06-15 16:00:00', '2020-12-31 23:59:59', '1', '38.95', 'EUR', '1', '4', '35455');
