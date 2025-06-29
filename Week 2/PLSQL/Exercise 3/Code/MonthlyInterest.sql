SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS

BEGIN
   
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE LOWER(AccountType) = 'savings';
    DBMS_OUTPUT.PUT_LINE('interest added to all savings accounts.');


END;
/
SET SERVEROUTPUT ON;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Before adding interest');
END;
/
SELECT * FROM ACCOUNTS;
/
SET SERVEROUTPUT ON;
BEGIN
    ProcessMonthlyInterest;
    DBMS_OUTPUT.PUT_LINE('After adding interest');
END;

/
SELECT * FROM ACCOUNTS;


