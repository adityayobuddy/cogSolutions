SET SERVEROUTPUT ON;

SELECT * FROM Loans;

BEGIN
    FOR res IN (
        SELECT l.LoanID, l.CustomerID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || res.LoanID || 
                             ' for ' || res.Name || 
                             ' is due on ' || TO_CHAR(res.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/

SELECT * FROM Loans;
/
--UPDATE Loans
--SET EndDate = DATE '2025-07-13'
--        