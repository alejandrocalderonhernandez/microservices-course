-- data for companies
insert into company("name", founder, logo, foundation_date) values('Facebook', 'Mark Zuckerberg', 'facebook.jpg', '2004-02-04');
insert into company("name", founder, logo, foundation_date) values('Google', 'Larry Page', 'google.png', '1998-09-04');
insert into company("name", founder, logo, foundation_date) values('Amazon', 'Jeff Bezos', 'amazon.jpg', '1994-07-05');
insert into company("name", founder, logo, foundation_date) values('Microsoft', 'Bill Gates', 'microsoft.png', '1975-04-04');
insert into company("name", founder, logo, foundation_date) values('Apple', 'Steve Jobs', 'apple.jpg', '1976-04-01');
insert into company("name", founder, logo, foundation_date) values('TikTok', 'Zhang Yiming', 'tiktok.jpg', '2016-09-05');
insert into company("name", founder, logo, foundation_date) values('OnlyFans', 'Tim Stokely', 'onlyfans.png', '2016-07-01');
insert into company("name", founder, logo, foundation_date) values('Oracle', 'Lawrence J', 'oracle.png', '1977-06-16');
insert into company("name", founder, logo, foundation_date) values('Cisco', 'Leonard Bosack', 'cisco.png', '1984-12-10');
insert into company("name", founder, logo, foundation_date) values('Samsung', 'Lee Byung-chull', 'samsung.png', '1938-03-01');
insert into company("name", founder, logo, foundation_date) values('Sony', 'Masaru Ibika', 'sony.jpg', '1946-05-07');
insert into company("name", founder, logo, foundation_date) values('Nintendo', 'Fusajiro', 'nintendo.jpg','1889-09-23');

-- data for web sites
insert into web_site(id_company, "name", category, description)
values(1, 'Facebook', 'SOCIAL_NETWORK', 'Is an American online social media and social networking service owned by Facebook, Inc.');
insert into web_site(id_company, "name", category, description)
values(1, 'Instagram', 'SOCIAL_NETWORK', 'Is an American online social media and social networking service owned by Facebook, Inc.');
insert into web_site(id_company, "name", category, description)
values(1, 'Whatsapp', 'SERVICES', 'Is an American chat service owned by Facebook, Inc.');
insert into web_site(id_company, "name", category, description)
values(2, 'Gmail', 'SERVICES', 'Is an American email service owned by Google, Inc.');
insert into web_site(id_company, "name", category, description)
values(2, 'Youtube', 'STREAMING', 'Is an American online streaming service owned by Google, Inc.');
insert into web_site(id_company, "name", category, description)
values(2, 'Goggle Cloud Platform', 'CLOUD_COMPUTING', 'Is an American cloud computing service owned by Google, Inc.');
insert into web_site(id_company, "name", category, description)
values(3, 'Amazon Store', 'SERVICES', 'Is an American store service owned by Amazon, Inc.');
insert into web_site(id_company, "name", category, description)
values(3, 'AWS', 'CLOUD_COMPUTING', 'Is an American online streaming service owned by Amazon, Inc.');
insert into web_site(id_company, "name", category, description)
values(3, 'Amazon Prime', 'CLOUD_COMPUTING', 'Is an American online streaming service owned by Amazon, Inc.');
insert into web_site(id_company, "name", category, description)
values(4, 'Windows', 'SERVICES', 'Is an American SO owned by Microsoft, Inc.');
insert into web_site(id_company, "name", category, description)
values(4, 'Xbox', 'DEVICES', 'Is a video console');
insert into web_site(id_company, "name", category, description)
values(5, 'Iphone', 'DEVICES', 'Is a product by apple');
insert into web_site(id_company, "name", category, description)
values(5, 'Mac', 'DEVICES', 'Is a product by apple');
insert into web_site(id_company, "name", category, description)
values(5, 'Ipad', 'DEVICES', 'Is a product by apple');
insert into web_site(id_company, "name", category, description)
values(6, 'TikTok', 'STREAMING', 'Is a service streaming');
insert into web_site(id_company, "name", category, description)
values(7, 'OnlyFans', 'SERVICES', 'Is a service streaming');
insert into web_site(id_company, "name", category, description)
values(8, 'Java', 'SERVICES', 'Is a language program');
insert into web_site(id_company, "name", category, description)
values(8, 'OracleCloud', 'CLOUD_COMPUTING', 'Is a cloud computing');
insert into web_site(id_company, "name", category, description)
values(9, 'Cisco networks', 'SERVICES', 'Is a service networks');
insert into web_site(id_company, "name", category, description)
values(10, 'Smartphone', 'DEVICES', 'Is a communication devices');
insert into web_site(id_company, "name", category, description)
values(11, 'Playstation', 'DEVICES', 'Is a video console');
insert into web_site(id_company, "name", category, description)
values(12, 'Nintendo', 'DEVICES', 'Is a video console');