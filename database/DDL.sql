create database reminder;
use reminder;

create table `task` (
	`task_no` int primary key auto_increment,
    `title` varchar(200) not null,
    `description` varchar(500),
    `date_reminder` datetime not null,
    `status` int,
		`delete_flag` tinyint(1)
);

create table `setting` (
	`setting_id` int primary key,
	`noti_time` int not null,
    `record_per_page` int default 10,
    `date_format` varchar(20),
    `mode` int default 0
);

create table `status` (
	`id` int primary key,
    `color_code` varchar(20) unique
);
