
SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE TransferFunds (
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = from_account
    FOR UPDATE; -- Concurrency

    IF v_balance < amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    -- Debit 
    UPDATE Accounts
    SET Balance = Balance - amount,
        LastModified = SYSDATE
    WHERE AccountID = from_account;

    -- Credit 
    UPDATE Accounts
    SET Balance = Balance + amount,
        LastModified = SYSDATE
    WHERE AccountID = to_account;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from Account ' || from_account || ' to Account ' || to_account);
END;
/
BEGIN
    DBMS_OUTPUT.PUT_LINE('Before Transfer');
END;
/
SELECT * FROM ACCOUNTS;

/

BEGIN
    TransferFunds(2, 1, 500); 
    DBMS_OUTPUT.PUT_LINE('Transaction Successful');
    DBMS_OUTPUT.PUT_LINE('After Transfer');
END;
/
SELECT * FROM ACCOUNTS;



