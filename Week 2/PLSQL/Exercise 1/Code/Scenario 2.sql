SET SERVEROUTPUT ON;
SELECT * FROM Customers;
/

BEGIN
    FOR res IN (
        SELECT CustomerID, Balance
        FROM Customers
    ) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = res.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'N'
            WHERE CustomerID = res.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- View data after update
SELECT * FROM Customers;
