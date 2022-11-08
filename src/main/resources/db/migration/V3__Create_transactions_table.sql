CREATE TABLE transactions (
    id int NOT NULL,
    participantId int,
    FOREIGN KEY (id) references payments(id) ON DELETE CASCADE,
    FOREIGN KEY (participantId) references users(id) ON DELETE CASCADE,
    PRIMARY Key (id, participantId)
);