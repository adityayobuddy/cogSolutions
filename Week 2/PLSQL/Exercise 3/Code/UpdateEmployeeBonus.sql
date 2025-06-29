SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept_name IN VARCHAR2,
    bonus_percent IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE LOWER(Department) = LOWER(dept_name);

    DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || dept_name);
END;
/
BEGIN
    DBMS_OUTPUT.PUT_LINE('Bonus not applied');
END;
/
SELECT Employeeid,Name,Salary,Department as dept FROM Employees;
/
BEGIN
    UpdateEmployeeBonus('HR', -45);
    DBMS_OUTPUT.PUT_LINE('Bonus applied');
END;
/
SELECT Employeeid,Name,Salary,Department as dept FROM Employees;
