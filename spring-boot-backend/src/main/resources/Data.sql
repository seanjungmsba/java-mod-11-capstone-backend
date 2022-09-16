INSERT INTO product_category(category_name) VALUES ('KETOGENIC');
INSERT INTO product_category(category_name) VALUES ('VEGAN');
INSERT INTO product_category(category_name) VALUES ('FRUITARIAN');
INSERT INTO product_category(category_name) VALUES ('CARNIVORE');
INSERT INTO product_category(category_name) VALUES ('HIGH-PROTEIN');
INSERT INTO product_category(category_name) VALUES ('LOW-CARB');

INSERT INTO role (id,name) VALUES ('1','Customer');

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0001', 'Keto Fathead Pizza', 'If you haven’t made this classic keto pizza, what are you waiting for? The whole family will love it, especially if you let them choose their own toppings.',
'assets/images/products/ketogenic/ketogenic-1.jpg', 1, 100, 12.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0002', 'Keto Fried Chicken with Broccoli', 'So simple and enjoyable! Keto fried chicken and broccoli is a perfect example of how to create a keto plate by combining a protein, a vegetable, and fat for flavor.',
'assets/images/products/ketogenic/ketogenic-2.jpg', 1, 100, 11.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0003', 'Keto Bacon Cheeseburger Wraps', 'These protein-packed bacon cheeseburger wraps will make you wonder why you ever bothered eating the bun. We’ve topped ours with mushrooms, onion, and tomatoes.',
'assets/images/products/ketogenic/ketogenic-3.jpg', 1, 100, 12.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0004',
'Keto Chicken and Eggplant Sheet-pan with Tzatziki', 'Sheet pan dishes are the darling of easy weeknight meals. Toss all of the ingredients onto a single sheet pan and let the oven do the cooking.',
'assets/images/products/ketogenic/ketogenic-4.jpg', 1, 100, 14.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0005', 'Keto Butter Burgers', 'Butter on a burger is a Midwestern staple but we ditched the bun to make it irresistibly keto. Crispy edges, juicy center, just perfect for the grill.',
'assets/images/products/ketogenic/ketogenic-5.jpg', 1, 100, 10.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0006', 'keto Chicken Skillet', 'This easy chicken skillet dish has a creamy, cheesy mushroom sauce. It’s ideal for busy evenings because it is already prepared and cooked for you to just heat up.',
'assets/images/products/ketogenic/ketogenic-6.jpg', 1, 100, 13.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0007', 'Keto Jalapeno Popper Chaffles', 'Chaffles are the go-to keto craze that can rock any flavor, sweet or savory. In this family-friendly recipe, chaffles get a spicy upgrade with layers of cream cheese, bacon, and jalapeño poppers. Best of all, they’re fun to make and to eat!',
'assets/images/products/ketogenic/ketogenic-7.jpg', 1, 100, 12.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('KETO-0008', 'Keto Lamb Sliders', 'Aromatic oregano and lemon combined with lamb, make these fragrant burgers irresistible. Serve these mini burgers wrapped in lettuce!',
'assets/images/products/ketogenic/ketogenic-8.jpg', 1, 100, 14.99, 1, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('VEG-0001', 'Lentil Bolognese', 'Rich and robust, this plant-based Lentil Bolognese is hearty, “meaty” and full of depth of flavor. Toss it with your favorite pasta, or spoon it over creamy polenta- either way, this simple nourishing vegan meal is one the whole family will enjoy.',
'assets/images/products/vegan/vegan-1.png', 1, 100, 11.99, 2, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('VEG-0002', 'Quinoa Pasta', 'An aromatic pasta dish with vegetables and quinoa - infused with Indian spices.  A quick and easy vegan dinner recipe, perfect any time of year.',
'assets/images/products/vegan/vegan-2.png', 1, 100, 12.99, 2, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('VEG-0003', 'Whole Roasted Cauliflower', 'Seasoned with Zaatar and drizzled with tahini sauce, it is a delight for the senses -bursting with Middle Eastern flavors. Easy and delicious, it serves 2 perfectly!',
'assets/images/products/vegan/vegan-3.png', 1, 100, 14.99, 2, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('VEG-0004', 'Frankies Bombay Burritos', 'This vegan burrito is bursting with so much flavor- filled with curry mashed potatoes, roasted Indian cauliflower, chickpeas, fresh spinach, cilantro mint chutney and pickled onions. Absolutely delicious! ',
'assets/images/products/vegan/vegan-4.png', 1, 100, 13.99, 2, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('VEG-0005', 'Vegan Shepherd Pie', 'topped with mushrooms and root vegetables with pillowy mashed potatoes, this is a delicious vegan main dish that is perfect for any event.',
'assets/images/products/vegan/vegan-5.png', 1, 100, 15.99, 2, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('FRU-0001', 'Apple Slices with Nut Butter', 'It’s as simple as the name suggests: slice up your apple and enjoy it with an organic, free-from-nasties nut butter. If you want an added bit of healthy indulgence, sprinkle the nut butter with cacao nibs for a chocolatey crunch.',
'assets/images/products/fruitarian/fruit-1.jpg', 1, 100, 6.99, 3, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('FRU-0002', 'Fruit Ensemble Bowl', 'Made up of strawberry, papaya, orange, grapes, grapefruits, and other citrus fruits, this bowl will give you a full of nutrients to get through the day without having to feel bloating and discomfort in your stomach!',
'assets/images/products/fruitarian/fruit-2.jpg', 1, 100, 12.99, 3, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('FRU-0003', 'Super Green Smoothie Bowl', 'They are super healthy & filling, completely customizable, nutrient dense and an edible work of art!',
'assets/images/products/fruitarian/fruit-3.jpg', 1, 100, 10.99, 3, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('FRU-0004', 'Kiwi Blueberry Pie', 'Who needs a man-made cake that is known to cause diabetes and other complications coming from excess consumption of sugar?! This cake is not only health but also taste better than any other cakes you will ever try, I guarantee!',
'assets/images/products/fruitarian/fruit-4.jpg', 1, 100, 5.99, 3, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('FRU-0005', 'Passionate Bowl', 'Passion fruit is the main ingredient behind this bowl, hence describing why we are calling it as a passionate bowl! This bowl of course is full of antioxidants and boost your immune system while helping you control your blood sugar levels!',
'assets/images/products/fruitarian/fruit-5.png', 1, 100, 5.99, 3, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('CAR-0001', 'Carnivore Breakfast Sandwich', 'This meal is delicious, full of protein and fat, and most importantly, no plants. this breakfast sandwich is a great breakfast option for keto, keto carnivore, and strict Carnivore.',
'assets/images/products/carnivore/carnivore-1.png', 1, 100, 6.99, 4, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('CAR-0002', 'Korean Steamed Egg', 'Eggs are a great source of creativity on the Carnivore Diet. We have this labelled as a breakfast dish, but you can enjoy it at any point in the day.',
'assets/images/products/carnivore/carnivore-2.png', 1, 100, 10.99, 4, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('CAR-0003', 'Carnivore Pizza', 'This carnivore pizza will be much richer in protein and add some extra fatty food to balance your nutrient intake! One thing this Pizza doesnot have is carbs – well, only in traces',
'assets/images/products/carnivore/carnivore-3.jpg', 1, 100, 15.99, 4, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('CAR-0004', 'Steak and Eggs', 'Serve steak and eggs for a hearty protein-packed weekend breakfast that’s ready in about 3 minutes of microwave oven!',
'assets/images/products/carnivore/carnivore-4.jpg', 1, 100, 18.99, 4, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('CAR-0005', 'Carnivore Pot Roast', 'This carnivore diet pot roast is one of the most delicious and satisfying meal to feed yourself for a few meals or your family.',
'assets/images/products/carnivore/carnivore-5.jpg', 1, 100, 16.99, 4, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('HP-0001', 'Spicy Shrimp Spinach Caesar Salad', 'The protein in this salad comes from crispy baked shrimp, a luxurious Caesar dressing egg yolk and anchovy paste, and a sprinkle of Parmesan cheese for good measure.',
'assets/images/products/high-protein/high-protein-1.jpg', 1, 100, 12.99, 5, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('HP-0002', 'Easy Salmon Piccata', 'If you already love chicken piccata—the briny, lemony, caper-packed Italian favorite — you will be obsessed with this speedy salmon version, which comes together entirely in one container and is perfect for weeknight dinners.',
'assets/images/products/high-protein/high-protein-2.jpg', 1, 100, 11.99, 5, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('HP-0003', 'Pan Fried Tofu with Vegetables Crispy Chickpeas', 'This meal has a bunch of plant-based sources of protein like tofu, chickpeas, and nutritional yeast to ensure a satisfying, yet totally vegetarian, dish.',
'assets/images/products/high-protein/high-protein-3.jpg', 1, 100, 13.99, 5, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('HP-0004', 'Apple Cider Chicken Skillet', 'Apples and chicken are the sweet and savory combo you did not know you needed before. This meal is definitely great all by itself, but you might also like it served alongside a whole grain like brown rice for a side dish.',
'assets/images/products/high-protein/high-protein-4.jpg', 1, 100, 12.99, 5, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('HP-0005', 'Creamy Miso-Peanut Chicken Lettuce Wraps', 'The miso-peanut sauce is the flavor star of these creamy, savory lettuce wraps as well as being a surprising source of protein. Sliced grapes add an extra sweet crunch to the mix.',
'assets/images/products/high-protein/high-protein-5.jpg', 1, 100, 16.99, 5, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('LC-0001', 'Taco Skillet', 'This Taco Skillet is made with taco meat, bell peppers, and diced tomatoes. Top with plenty of cheese, sour cream, and guacamole.',
'assets/images/products/low-carb/low-carb-1.jpg', 1, 100, 13.99, 6, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('LC-0002', 'Riced Cauliflower with Leeks, Kale and Walnuts', 'This is a healthy, flavorful side dish featuring some low-sugar vegetables. It makes a great addition to just about any meal you can think up',
'assets/images/products/low-carb/low-carb-2.jpg', 1, 100, 11.99, 6, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('LC-0003', 'Pressure-cooked Bloody Mary Pot Roast', 'When we picked up a bottle of Bloody Mary mix to make this meal, the clerk said she sometimes uses it to marinate a roast. We gave that a try and then decided to add more of the flavors that others love in a Bloody Mary.',
'assets/images/products/low-carb/low-carb-3.jpg', 1, 100, 15.99, 6, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('LC-0004', 'Chicken Cutlet with Sun-dried Tomato Cream Sauce', 'Though a chicken cutlet may be a chicken breast cut in half, this recipe shows how to make chicken cutlets with double the deliciousness and flavorful oil are packed to sauté the chicken',
'assets/images/products/low-carb/low-carb-4.jpg', 1, 100, 12.99, 6, NOW());

INSERT INTO product (sku, name, description, image_url, active, units_in_stock, unit_price, category_id, date_created)
VALUES ('LC-0005', 'Beer and Lime Chicken', 'Looking for a quick and delicious appetizer? Then try this boozy Beer and Lime chicken an make your evenings interesting!',
'assets/images/products/low-carb/low-carb-5.png', 1, 100, 15.99, 6, NOW());


INSERT INTO `country` VALUES
(1,'BR','Brazil'),
(2,'CA','Canada'),
(3,'DE','Germany'),
(4,'IN','India'),
(5,'TR','Turkey'),
(6,'US','United States'),
(7,'KR','South Korea'),
(8,'FR','France'),
(9,'UK','United Kingdom'),
(10,'IT','Italy'),
(11,'JP','Japan');

INSERT INTO `state` VALUES
(1,'Acre',1),
(2,'Alagoas',1),
(3,'Amapá',1),
(4,'Amazonas',1),
(5,'Bahia',1),
(6,'Ceará',1),
(7,'Distrito Federal',1),
(8,'Espírito Santo',1),
(9,'Goiás',1),
(10,'Maranhão',1),
(11,'Mato Grosso do Sul',1),
(12,'Mato Grosso',1),
(13,'Minas Gerais',1),
(14,'Paraná',1),
(15,'Paraíba',1),
(16,'Pará',1),
(17,'Pernambuco',1),
(18,'Piaui',1),
(19,'Rio de Janeiro',1),
(20,'Rio Grande do Norte',1),
(21,'Rio Grande do Sul',1),
(22,'Rondônia',1),
(23,'Roraima',1),
(24,'Santa Catarina',1),
(25,'Sergipe',1),
(26,'São Paulo',1),
(27,'Tocantins',1),
(28,'Alberta',2),
(29,'British Columbia',2),
(30,'Manitoba',2),
(31,'New Brunswick',2),
(32,'Newfoundland and Labrador',2),
(33,'Northwest Territories',2),
(34,'Nova Scotia',2),
(35,'Nunavut',2),
(36,'Ontario',2),
(37,'Prince Edward Island',2),
(38,'Quebec',2),
(39,'Saskatchewan',2),
(40,'Yukon',2),
(41,'Baden-Württemberg',3),
(42,'Bavaria',3),
(43,'Berlin',3),
(44,'Brandenburg',3),
(45,'Bremen',3),
(46,'Hamburg',3),
(47,'Hesse',3),
(48,'Lower Saxony',3),
(49,'Mecklenburg-Vorpommern',3),
(50,'North Rhine-Westphalia',3),
(51,'Rhineland-Palatinate',3),
(52,'Saarland',3),
(53,'Saxony',3),
(54,'Saxony-Anhalt',3),
(55,'Schleswig-Holstein',3),
(56,'Thuringia',3),
(57,'Andhra Pradesh',4),
(58,'Arunachal Pradesh',4),
(59,'Assam',4),
(60,'Bihar',4),
(61,'Chhattisgarh',4),
(62,'Goa',4),
(63,'Gujarat',4),
(64,'Haryana',4),
(65,'Himachal Pradesh',4),
(66,'Jammu & Kashmir',4),
(67,'Jharkhand',4),
(68,'Karnataka',4),
(69,'Kerala',4),
(70,'Madhya Pradesh',4),
(71,'Maharashtra',4),
(72,'Manipur',4),
(73,'Meghalaya',4),
(74,'Mizoram',4),
(75,'Nagaland',4),
(76,'Odisha',4),
(77,'Punjab',4),
(78,'Rajasthan',4),
(79,'Sikkim',4),
(80,'Tamil Nadu',4),
(81,'Telangana',4),
(82,'Tripura',4),
(83,'Uttar Pradesh',4),
(84,'Uttarakhand',4),
(85,'West Bengal',4),
(86,'Andaman and Nicobar Islands',4),
(87,'Chandigarh',4),
(88,'Dadra and Nagar Haveli',4),
(89,'Daman & Diu',4),
(90,'Lakshadweep',4),
(91,'Puducherry',4),
(92,'The Government of NCT of Delhi',4),
(93,'Alabama',6),
(94,'Alaska',6),
(95,'Arizona',6),
(96,'Arkansas',6),
(97,'California',6),
(98,'Colorado',6),
(99,'Connecticut',6),
(100,'Delaware',6),
(101,'District Of Columbia',6),
(102,'Florida',6),
(103,'Georgia',6),
(104,'Hawaii',6),
(105,'Idaho',6),
(106,'Illinois',6),
(107,'Indiana',6),
(108,'Iowa',6),
(109,'Kansas',6),
(110,'Kentucky',6),
(111,'Louisiana',6),
(112,'Maine',6),
(113,'Maryland',6),
(114,'Massachusetts',6),
(115,'Michigan',6),
(116,'Minnesota',6),
(117,'Mississippi',6),
(118,'Missouri',6),
(119,'Montana',6),
(120,'Nebraska',6),
(121,'Nevada',6),
(122,'New Hampshire',6),
(123,'New Jersey',6),
(124,'New Mexico',6),
(125,'New York',6),
(126,'North Carolina',6),
(127,'North Dakota',6),
(128,'Ohio',6),
(129,'Oklahoma',6),
(130,'Oregon',6),
(131,'Pennsylvania',6),
(132,'Rhode Island',6),
(133,'South Carolina',6),
(134,'South Dakota',6),
(135,'Tennessee',6),
(136,'Texas',6),
(137,'Utah',6),
(138,'Vermont',6),
(139,'Virginia',6),
(140,'Washington',6),
(141,'West Virginia',6),
(142,'Wisconsin',6),
(143,'Wyoming',6),
(144,'Adıyaman',5),
(145,'Afyonkarahisar',5),
(146,'Ağrı',5),
(147,'Aksaray',5),
(148,'Amasya',5),
(149,'Ankara',5),
(150,'Antalya',5),
(151,'Ardahan',5),
(152,'Artvin',5),
(153,'Aydın',5),
(154,'Balıkesir',5),
(155,'Bartın',5),
(156,'Batman',5),
(157,'Bayburt',5),
(158,'Bilecik',5),
(159,'Bingöl',5),
(160,'Bitlis',5),
(161,'Bolu',5),
(162,'Burdur',5),
(163,'Bursa',5),
(164,'Çanakkale',5),
(165,'Çankırı',5),
(166,'Çorum',5),
(167,'Denizli',5),
(168,'Diyarbakır',5),
(169,'Düzce',5),
(170,'Edirne',5),
(171,'Elazığ',5),
(172,'Erzincan',5),
(173,'Erzurum',5),
(174,'Eskişehir',5),
(175,'Gaziantep',5),
(176,'Giresun',5),
(177,'Gümüşhane',5),
(178,'Hakkâri',5),
(179,'Hatay',5),
(180,'Iğdır',5),
(181,'Isparta',5),
(182,'İstanbul',5),
(183,'İzmir',5),
(184,'Kahramanmaraş',5),
(185,'Karabük',5),
(186,'Karaman',5),
(187,'Kars',5),
(188,'Kastamonu',5),
(189,'Kayseri',5),
(190,'Kırıkkale',5),
(191,'Kırklareli',5),
(192,'Kırşehir',5),
(193,'Kilis',5),
(194,'Kocaeli',5),
(195,'Konya',5),
(196,'Kütahya',5),
(197,'Malatya',5),
(198,'Manisa',5),
(199,'Mardin',5),
(200,'Mersin',5),
(201,'Muğla',5),
(202,'Muş',5),
(203,'Nevşehir',5),
(204,'Niğde',5),
(205,'Ordu',5),
(206,'Osmaniye',5),
(207,'Rize',5),
(208,'Sakarya',5),
(209,'Samsun',5),
(210,'Siirt',5),
(211,'Sinop',5),
(212,'Sivas',5),
(213,'Şanlıurfa',5),
(214,'Şırnak',5),
(215,'Tekirdağ',5),
(216,'Tokat',5),
(217,'Trabzon',5),
(218,'Tunceli',5),
(219,'Uşak',5),
(220,'Van',5),
(221,'Yalova',5),
(222,'Yozgat',5),
(223,'Zonguldak',5),
(224,'North Chungcheong',7),
(225,'South Chungcheong',7),
(226,'Gangwon',7),
(227,'Gyeonggi',7),
(228,'North Gyeongsang',7),
(229,'South Gyeongsang',7),
(230,'North Jeolla',7),
(231,'South Jeolla',7),
(232,'Jeju Island',7),
(233,'Alsace',8),
(234,'Aquitaine',8),
(235,'Auvergne',8),
(236,'Brittany',8),
(237,'Burgundy',8),
(238,'Centre-Val de Loire',8),
(239,'Champagne-Ardenne',8),
(240,'Franche-Comte',8),
(241,'Ile-de-France',8),
(242,'Languedoc-Roussillon',8),
(243,'Limousin',8),
(244,'Lorraine',8),
(245,'Lower Normandy',8),
(246,'Midi-Pyrenees',8),
(247,'Nord-Pas-de-Calais',8),
(248,'Pays de la Loire',8),
(249,'Picardy',8),
(250,'Poitou-Charentes',8),
(251,'Provence-Alpes-Cote dAzur',8),
(252,'Rhone-Alpes',8),
(253,'Upper Normandy',8),
(254,'England',9),
(255,'Scotland',9),
(256,'Wales',9),
(257,'Northern Ireland',9),
(258,'Abruzzo',10),
(259,'Basilicata',10),
(260,'Calabria',10),
(261,'Campania',10),
(262,'Emilia-Romagna',10),
(263,'Friuli-Venezia Giulia',10),
(264,'Lazio',10),
(265,'Liguria',10),
(266,'Lombardy',10),
(267,'Marche',10),
(268,'Molise',10),
(269,'Piemonte',10),
(270,'Puglia',10),
(271,'Sardinia',10),
(272,'Sicily',10),
(273,'Trentino Alto Adige',10),
(274,'Tuscany',10),
(275,'Umbria',10),
(276,'Valle dAosta',10),
(277,'Veneto',10),
(278,'Hokkaido',11),
(279,'Tohoku',11),
(280,'Kanto',11),
(281,'Chubu',11),
(282,'Kinki',11),
(283,'Chugoku',11),
(284,'Shikoku',11),
(285,'Kyushu-Okinawa',11);