/*
SQLyog Community v13.1.3  (64 bit)
MySQL - 5.7.10-log : Database - portfolio
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`portfolio` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `portfolio`;

/*Table structure for table `about_me_entity` */

DROP TABLE IF EXISTS `about_me_entity`;

CREATE TABLE `about_me_entity` (
  `about_me_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `photo_file_path` longtext,
  `portfolio_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`about_me_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `about_me_entity` */

insert  into `about_me_entity`(`about_me_id`,`description`,`is_active`,`photo_file_path`,`portfolio_user_id`) values 
(1,'','\0','C:/user/1.jpg',1);

/*Table structure for table `about_me_nav_entity` */

DROP TABLE IF EXISTS `about_me_nav_entity`;

CREATE TABLE `about_me_nav_entity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `about_me_id` bigint(20) DEFAULT NULL,
  `about_me_name` varchar(255) DEFAULT NULL,
  `description` varchar(4000) DEFAULT NULL,
  `imgae_url` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `about_me_nav_entity` */

insert  into `about_me_nav_entity`(`id`,`about_me_id`,`about_me_name`,`description`,`imgae_url`,`is_active`) values 
(1,1,'About','Currently in a vacational degree regarding multisupport IT development, in work-study, I am a young student wishing to specialize in web and mobile development. I focus my studies in this area, guided by my desire to learn and my curiosity. As a passionate, I like to actively participate in the activities of a company, but also create personal projects, with the aim of increase my skills.\n\nWeb and mobile development appeared as obvious during my schooling. Creating ever more sustainable web applications, concerned about the user experience, is very important for me. Web and mobile technologies are changing our lives, and I want to be part of this change.\n\nIf you want to learn more about me, or get in touch, don\'t hesitate! You can explore this website nor download my CV! :)','',''),
(2,1,'Language','If you want to learn more about me, or get in touch, don\'t hesitate! You can explore this website nor download my CV! :)','',''),
(3,1,'Strength','Emotional intelligence: I am empathic, friendly and always optimistic\nRelationship intelligence: Team spirit, always acts to maintain positive cooperation\nCuriosity: I always like to learn more about every possible subjects\nPunctuality and good time management\nResolving ability: I like to find the simplest solution to meet a need, whether alone or teaming','',''),
(4,1,'Hobbies','- Play violin -\nI play violin since 2016.\n\nI participated in charities such as \"Octobre rose\" (Pink October). Also on stage, during senior meals on Christmas holidays, and some concerts in bars!\n\n- Travel / Culture -\nI would like to travel all around the world, other countries and their own culture fascinate me. Without forgetting the culinary culture ;p\n\n- Baking -\nSpeaking about food, who doesn\'t love cakes? Yule logs, verrines, choux buns, macaroons, I love baking!','','\0');

/*Table structure for table `competences_entity` */

DROP TABLE IF EXISTS `competences_entity`;

CREATE TABLE `competences_entity` (
  `competence_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `portfolio_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`competence_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `competences_entity` */

insert  into `competences_entity`(`competence_id`,`description`,`is_active`,`name`,`portfolio_user_id`) values 
(1,'Competences discription','\0','Competences',1);

/*Table structure for table `education_detail_entity` */

DROP TABLE IF EXISTS `education_detail_entity`;

CREATE TABLE `education_detail_entity` (
  `education_detail_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `education_id` bigint(20) DEFAULT NULL,
  `educational_description` varchar(5000) DEFAULT NULL,
  `end_year` int(11) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `start_year` int(11) DEFAULT NULL,
  PRIMARY KEY (`education_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `education_detail_entity` */

insert  into `education_detail_entity`(`education_detail_id`,`education_id`,`educational_description`,`end_year`,`is_active`,`name`,`start_year`) values 
(1,1,'I am a diligent Bachelor of Computer Applications (BCA) student, deeply passionate about the dynamic world of technology. Equipped with a solid understanding of programming languages like Java, C++, Python, and SQL, I thrive in problem-solving and software development. Through collaborative projects and coursework, I ve honed my skills in web development, database management, and algorithm design. My commitment to continuous learning drives me to stay updated with the latest advancements in the field. With a blend of technical expertise and a collaborative spirit, I m poised to make impactful contributions in the realm of computer science.',2007,'\0','BCA',2003),
(2,1,'I am a dedicated 12th-grade student with a keen interest in exploring the world of knowledge and discovery. Eager to excel in academics and beyond, I approach every challenge with enthusiasm and determination. With a strong foundation in subjects like mathematics, science, and literature, I strive to expand my horizons and pursue my passions. Whether it\'s through participating in extracurricular activities, engaging in community service, or delving into independent projects, I am committed to personal growth and academic excellence. As I prepare to embark on the next chapter of my journey, I am excited to embrace new opportunities and make meaningful contributions to the world around me.',2003,'\0','12th',2002),
(3,1,'I am a dedicated 10th-grade student with a keen interest in exploring the world of knowledge and discovery. Eager to excel in academics and beyond, I approach every challenge with enthusiasm and determination. With a strong foundation in subjects like mathematics, science, and literature, I strive to expand my horizons and pursue my passions. Whether it\'s through participating in extracurricular activities, engaging in community service, or delving into independent projects, I am committed to personal growth and academic excellence. As I prepare to embark on the next chapter of my journey, I am excited to embrace new opportunities and make meaningful contributions to the world around me.',2001,'\0','10th',2000);

/*Table structure for table `education_entity` */

DROP TABLE IF EXISTS `education_entity`;

CREATE TABLE `education_entity` (
  `education_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `education_description` varchar(255) DEFAULT NULL,
  `enable` bit(1) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `port_pofolio_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`education_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `education_entity` */

insert  into `education_entity`(`education_id`,`education_description`,`enable`,`is_active`,`name`,`port_pofolio_id`) values 
(1,'Fill about education and ','\0','\0','Education Section',1);

/*Table structure for table `education_entity_educationdetail_list` */

DROP TABLE IF EXISTS `education_entity_educationdetail_list`;

CREATE TABLE `education_entity_educationdetail_list` (
  `education_entity_education_id` bigint(20) NOT NULL,
  `educationdetail_list_education_detail_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_onpf42dldd3mstvyi343dxqfk` (`educationdetail_list_education_detail_id`),
  KEY `FKg1ppripug79hbrtqf3rad08wu` (`education_entity_education_id`),
  CONSTRAINT `FKcanyf2wn1t4hd1x1ouhg2rnng` FOREIGN KEY (`educationdetail_list_education_detail_id`) REFERENCES `education_detail_entity` (`education_detail_id`),
  CONSTRAINT `FKg1ppripug79hbrtqf3rad08wu` FOREIGN KEY (`education_entity_education_id`) REFERENCES `education_entity` (`education_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `education_entity_educationdetail_list` */

/*Table structure for table `experience_category_entity` */

DROP TABLE IF EXISTS `experience_category_entity`;

CREATE TABLE `experience_category_entity` (
  `experience_category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) DEFAULT NULL,
  `experience_id` bigint(20) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  PRIMARY KEY (`experience_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `experience_category_entity` */

insert  into `experience_category_entity`(`experience_category_id`,`category_name`,`experience_id`,`is_active`) values 
(1,'Projects',1,'\0'),
(2,'Experience',1,'\0');

/*Table structure for table `experience_details_entity` */

DROP TABLE IF EXISTS `experience_details_entity`;

CREATE TABLE `experience_details_entity` (
  `experience_detail_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `experience_category_id` bigint(20) DEFAULT NULL,
  `experiencedescription` varchar(255) DEFAULT NULL,
  `img` longtext,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`experience_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `experience_details_entity` */

insert  into `experience_details_entity`(`experience_detail_id`,`experience_category_id`,`experiencedescription`,`img`,`is_active`,`name`) values 
(1,1,'This is a portfolio site created for client\nhtml','','\0','Something1'),
(2,1,'This is a portfolio site created for client\nhtml','','\0','Something2'),
(3,1,'This is a portfolio site created for client\nhtml','','\0','Something3'),
(4,2,'This is a portfolio site created for client\nhtml','','\0','Something4'),
(5,2,'This is a portfolio site created for client\nhtml','','\0','Something5');

/*Table structure for table `experience_entity` */

DROP TABLE IF EXISTS `experience_entity`;

CREATE TABLE `experience_entity` (
  `experience_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `portfolio_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`experience_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `experience_entity` */

insert  into `experience_entity`(`experience_id`,`is_active`,`name`,`portfolio_id`) values 
(1,'','Experience',1);

/*Table structure for table `portfolio_user_entity` */

DROP TABLE IF EXISTS `portfolio_user_entity`;

CREATE TABLE `portfolio_user_entity` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `photo_profile` longtext,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `portfolio_user_entity` */

insert  into `portfolio_user_entity`(`user_id`,`description`,`email`,`is_active`,`name`,`photo_profile`) values 
(1,'IT Student, Web and Mobile developer','Nic@test.com','\0','Nicolas Wadoux','https://www.gravatar.com/avatar/4798617496366fdde2c1c3b69d9293e9?s=250&d=mm&r=x');

/*Table structure for table `skill_category_entity` */

DROP TABLE IF EXISTS `skill_category_entity`;

CREATE TABLE `skill_category_entity` (
  `skill_category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `competence_id` bigint(20) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `skill_category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`skill_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `skill_category_entity` */

insert  into `skill_category_entity`(`skill_category_id`,`competence_id`,`is_active`,`skill_category`) values 
(1,1,'\0','Web'),
(2,1,'\0','Data Base'),
(3,1,'\0','Programming'),
(4,1,'\0','Others');

/*Table structure for table `skill_category_entity_skill_list` */

DROP TABLE IF EXISTS `skill_category_entity_skill_list`;

CREATE TABLE `skill_category_entity_skill_list` (
  `skill_category_entity_skill_category_id` bigint(20) NOT NULL,
  `skill_list_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_o44j03aebo4oyrqidxxn3h9av` (`skill_list_id`),
  KEY `FKrorhajhqd7r4d75da0y80svr1` (`skill_category_entity_skill_category_id`),
  CONSTRAINT `FK8qgvpjfskee7mpkxx8sgvdasw` FOREIGN KEY (`skill_list_id`) REFERENCES `skill_entity` (`id`),
  CONSTRAINT `FKrorhajhqd7r4d75da0y80svr1` FOREIGN KEY (`skill_category_entity_skill_category_id`) REFERENCES `skill_category_entity` (`skill_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `skill_category_entity_skill_list` */

/*Table structure for table `skill_entity` */

DROP TABLE IF EXISTS `skill_entity`;

CREATE TABLE `skill_entity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `skill_category_id` bigint(20) DEFAULT NULL,
  `skill_rate` bigint(20) DEFAULT NULL,
  `skillname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `skill_entity` */

insert  into `skill_entity`(`id`,`description`,`is_active`,`skill_category_id`,`skill_rate`,`skillname`) values 
(1,NULL,'\0',1,80,'HTML/JS/CSS'),
(2,NULL,'\0',1,60,'Angular'),
(3,NULL,'\0',1,70,'NodeJS'),
(4,NULL,'\0',2,80,'MySql'),
(5,NULL,'\0',2,40,'PgSql'),
(6,NULL,'\0',2,50,'PL/SQL'),
(7,NULL,'\0',2,20,'Oracle'),
(8,NULL,'\0',3,90,'C#'),
(9,NULL,'\0',3,20,'Kotlin(Android)'),
(10,NULL,'\0',3,70,'Java'),
(11,NULL,'\0',3,60,'UML'),
(12,NULL,'\0',4,90,'Scrum'),
(13,NULL,'\0',4,90,'GIT/SVN'),
(14,NULL,'\0',4,90,'PhotoShop');

/*Table structure for table `social_network_entity` */

DROP TABLE IF EXISTS `social_network_entity`;

CREATE TABLE `social_network_entity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `portfolio_id` bigint(20) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `social_network_entity` */

insert  into `social_network_entity`(`id`,`is_active`,`name`,`portfolio_id`,`url`) values 
(1,'\0','LinkedIn',1,'http://linkedin.com'),
(2,'\0','Facebook',1,'http://Facebook.com'),
(3,'\0','Insta',1,'http://Insta.com');

/*Table structure for table `upload_file_entity` */

DROP TABLE IF EXISTS `upload_file_entity`;

CREATE TABLE `upload_file_entity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) DEFAULT NULL,
  `file_path` varchar(255) DEFAULT NULL,
  `portfolio_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `upload_file_entity` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
