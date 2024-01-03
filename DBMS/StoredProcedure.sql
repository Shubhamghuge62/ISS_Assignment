-- stored procedure that retrieves the employee information for a given department

CREATE PROCEDURE GetEmployeesByDepartment
    @departmentIDParam INT
AS
BEGIN
    SELECT * FROM Employee
    WHERE DepartmentID = @departmentIDParam;
END;


--Calling The stored procedure

EXEC GetEmployeesByDepartment @departmentIDParam = 2;


