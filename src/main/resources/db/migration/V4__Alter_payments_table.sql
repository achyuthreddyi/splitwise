ALTER TABLE payments
    DROP CONSTRAINT payments_userid_fkey;
ALTER TABLE payments
    ADD CONSTRAINT ka_new
        FOREIGN KEY (userid) references users(id)
        ON DELETE CASCADE
