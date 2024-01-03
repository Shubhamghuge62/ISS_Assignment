-- Select 

SELECT * FROM Employee;
SELECT * FROM Department;
SELECT * FROM Address;
SELECT * FROM Salary;


--Select Distinct

Select Distinct(DepartmentId) from Employee;

--Where, And & Or

SELECT * FROM Employee WHERE Gender = 'M' AND DepartmentID = 1;
SELECT * FROM Employee WHERE Gender = 'F' OR DepartmentID = 2;


--Order By

SELECT * FROM Employee ORDER BY BirthDate DESC;
SELECT * FROM Employee ORDER BY BirthDate ASC;

--update

UPDATE Employee SET DepartmentID = 1 WHERE EmployeeID = 5;


-- Delete 

DELETE FROM Employee WHERE EmployeeID = 9;

-- Select Top

SELECT TOP 3 * FROM Employee;

--Like, Wildcards

SELECT * FROM Employee WHERE FirstName LIKE 'J%';

--IN

SELECT * FROM Employee WHERE DepartmentID IN (1, 2);

-- Between 

SELECT * FROM Employee WHERE BirthDate BETWEEN '1990-01-01' AND '1995-12-31';

-- Aliases

SELECT e.EmployeeID AS ID, e.FirstName AS First, e.LastName AS Last, d.DepartmentName AS Dept
FROM Employee e
JOIN Department d ON e.DepartmentID = d.DepartmentID;


-- Joins 
	---- Inner Join
	SELECT * FROM Employee INNER JOIN Department ON Employee.DepartmentID = Department.DepartmentID;

	-- Left Join
	SELECT * FROM Employee LEFT JOIN Department ON Employee.DepartmentID = Department.DepartmentID;

	-- Right Join
	SELECT * FROM Employee RIGHT JOIN Department ON Employee.DepartmentID = Department.DepartmentID;

	-- Full Join 
	SELECT * FROM Employee FULL JOIN Department ON Employee.DepartmentID = Department.DepartmentID;


-- Union

SELECT FirstName, LastName FROM Employee WHERE Gender = 'M'
UNION
SELECT FirstName, LastName FROM Employee WHERE Gender = 'F';

--Select Into

SELECT FirstName, LastName INTO NewEmployee FROM Employee WHERE DepartmentID = 1;

-- Insert Into Select 

Insert Into NewEmployee (FirstName, LastName) 
Select FirstName, LastName From Employee;

--Alter Table

Alter Table Employee 
Alter Column FirstName Varchar(50) NOT NULL;

-- Index

Create INDEX IX_EMPLOYEE ON Employee (EmployeeID, FirstName, LastName);

--Views 

Create View [ HighSalaries ] As Select * From Salary Where SalaryAmount> 80000;


--Null Values

Select * from NewEmployee where FirstName IS NULL;


-- Group By, Having
SELECT DepartmentID, AVG(SalaryAmount) AS AverageSalary
FROM Employee
JOIN Salary ON Employee.EmployeeID = Salary.EmployeeID
GROUP BY DepartmentID
HAVING AVG(SalaryAmount) > 80000;

-- Drop 
 Drop Database Shubham

--Injection 
SELECT * FROM Employee WHERE FirstName = 'John' AND LastName = 'Doe';

