
SELECT c.CustomerID,c.DOB,l.LoanID,l.InterestRate 
FROM Customers c
JOIN Loans l 
ON c.CustomerID = l.CustomerID
/
SET SERVEROUTPUT ON;

BEGIN
    FOR res IN (
        SELECT
            c.CustomerID, 
            l.LoanID, 
            l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60
    ) LOOP
        UPDATE Loans
        SET InterestRate = res.InterestRate - 1
        WHERE LoanID = res.LoanID;

    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Interest rate updated');

END;
/
SELECT c.CustomerID,c.DOB,l.LoanID,l.InterestRate 
FROM Customers c
JOIN Loans l 
ON c.CustomerID = l.CustomerID
