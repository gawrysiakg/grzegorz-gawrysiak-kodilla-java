INSERT INTO POSTS (USER_ID, BODY)
VALUES ('1', 'Test post exercise 16.5');

UPDATE POSTS
SET BODY = 'To delete'
WHERE ID = 7;

DELETE FROM POSTS
WHERE BODY = 'To delete';

COMMIT;