CREATE TABLE `users` (
                         `id` int NOT NULL AUTO_INCREMENT,
                         `name` varchar(255) DEFAULT NULL,
                         `email` varchar(255) DEFAULT NULL,
                         `phone` varchar(255) DEFAULT NULL,
                         `user_type` enum('admin','company','passenger') DEFAULT NULL,
                         `password` varchar(255) DEFAULT NULL,
                         `is_verified` tinyint(1) DEFAULT '0',
                         `reset_verification_code` varchar(255) DEFAULT '',
                         `reset_verification_code_expiration` int DEFAULT NULL,
                         `status` varchar(255) DEFAULT NULL,
                         `address` text,
                         `last_login` bigint DEFAULT NULL,
                         `created_at` bigint DEFAULT NULL,
                         `updated_at` bigint DEFAULT NULL,
                         `is_deleted` tinyint(1) DEFAULT '0',
                         `deleted_at` bigint DEFAULT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `destinations` (
                                `id` int NOT NULL AUTO_INCREMENT,
                                `company_id` int DEFAULT NULL,
                                `departure` varchar(255) DEFAULT NULL,
                                `arrival` varchar(255) DEFAULT NULL,
                                `price` int DEFAULT NULL,
                                `created_at` bigint DEFAULT NULL,
                                `updated_at` bigint DEFAULT NULL,
                                `is_deleted` tinyint(1) DEFAULT '0',
                                `deleted_at` bigint DEFAULT NULL,
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `stations` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `destination_id` int DEFAULT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            `previous` int DEFAULT NULL,
                            `created_at` bigint DEFAULT NULL,
                            `updated_at` bigint DEFAULT NULL,
                            `is_deleted` tinyint(1) DEFAULT '0',
                            `deleted_at` bigint DEFAULT NULL,
                            PRIMARY KEY (`id`),
                            FOREIGN KEY (destination_id) REFERENCES destinations(id),
                            FOREIGN KEY (previous) REFERENCES stations(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `schedules` (
                             `id` int NOT NULL AUTO_INCREMENT,
                             `company_id` int DEFAULT NULL,
                             `destination_id` int DEFAULT NULL,
                             `bus_plate_no` varchar(255),
                             `departure_date` date,
                             `departure_time` time,
                             `passenger_limit` int,
                             `status` enum("open","closed") default "closed",
                             `created_at` bigint DEFAULT NULL,
                             `updated_at` bigint DEFAULT NULL,
                             `is_deleted` tinyint(1) DEFAULT '0',
                             `deleted_at` bigint DEFAULT NULL,
                             PRIMARY KEY (`id`),
                             FOREIGN KEY (destination_id) REFERENCES destinations(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `reservations` (
                                `id` int NOT NULL AUTO_INCREMENT,
                                `passenger_id` int DEFAULT NULL,
                                `schedule_id` int DEFAULT NULL,
                                `pickup_station` int DEFAULT NULL,
                                `created_at` bigint DEFAULT NULL,
                                `updated_at` bigint DEFAULT NULL,
                                `is_deleted` tinyint(1) DEFAULT '0',
                                `deleted_at` bigint DEFAULT NULL,
                                PRIMARY KEY (`id`),
                                FOREIGN KEY (passenger_id) REFERENCES users(id),
                                FOREIGN KEY (schedule_id) REFERENCES schedules(id),
                                FOREIGN KEY (pickup_station) REFERENCES stations(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
