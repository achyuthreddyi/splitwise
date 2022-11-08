CREATE TABLE payments (
    id int PRIMARY KEY NOT NULL,
    amount float,
    userid int,
    FOREIGN KEY (userid) references users(id)
);

--    ADD CONSTRAINT
--    FOREIGN KEY (userid) references users(id)
--    ON DELETE CASCADE
