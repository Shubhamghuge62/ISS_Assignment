-- Create Database

Create Database TestDB

--Create Table

	-- Employee Table
	CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    BirthDate DATE,
    Gender CHAR(1),
    DepartmentID INT,
    CONSTRAINT FK_Department FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
);

	-- Department Table

	CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100)
);

	-- Address Table
	CREATE TABLE Address (
		AddressID INT PRIMARY KEY,
		EmployeeID INT,
		Street VARCHAR(255),
		City VARCHAR(100),
		State VARCHAR(50),
		ZipCode VARCHAR(20),
		CONSTRAINT FK_Address_Employee FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
	);

	-- Salary Table 
	CREATE TABLE Salary (
		SalaryID INT PRIMARY KEY,
		EmployeeID INT,
		SalaryAmount DECIMAL(10, 2),
		SalaryDate DATE,
		CONSTRAINT FK_Salary_Employee FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
	);


-- Insert Statements 

-- Insert values into Department table
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES
    (1, 'IT Department'),
    (2, 'HR Department'),
    (3, 'Finance Department'),
    (4, 'Marketing Department'),
    (5, 'Operations Department');

-- Insert values into Employee table
INSERT INTO Employee (EmployeeID, FirstName, LastName, BirthDate, Gender, DepartmentID)
VALUES
    (1, 'John', 'Doe', '1990-05-15', 'M', 1),
    (2, 'Jane', 'Smith', '1985-08-22', 'F', 2),
    (3, 'David', 'Johnson', '1992-11-10', 'M', 1),
    (4, 'Emily', 'Davis', '1988-04-03', 'F', 3),
    (5, 'Michael', 'Brown', '1995-07-18', 'M', 4),
    (6, 'Olivia', 'Miller', '1993-02-28', 'F', 3),
    (7, 'William', 'Taylor', '1980-09-12', 'M', 2);

-- Insert values into Address table
INSERT INTO Address (AddressID, EmployeeID, Street, City, State, ZipCode)
VALUES
    (1, 1, '123 Main St', 'Anytown', 'CA', '12345'),
    (2, 2, '456 Oak Ave', 'Smallville', 'NY', '67890'),
    (3, 3, '789 Pine Blvd', 'Big City', 'TX', '54321'),
    (4, 4, '101 Elm Ln', 'Metroville', 'CA', '98765'),
    (5, 5, '202 Maple Rd', 'Urbanburg', 'IL', '24680'),
    (6, 6, '303 Cedar Dr', 'Villagetown', 'OH', '13579'),
    (7, 7, '404 Birch Ct', 'Hamletville', 'FL', '86420');

-- Insert values into Salary table
INSERT INTO Salary (SalaryID, EmployeeID, SalaryAmount, SalaryDate)
VALUES
    (1, 1, 80000.00, '2023-01-15'),
    (2, 2, 65000.00, '2023-01-20'),
    (3, 3, 90000.00, '2023-02-01'),
    (4, 4, 75000.00, '2023-02-10'),
    (5, 5, 100000.00, '2023-03-05'),
    (6, 6, 85000.00, '2023-03-15'),
    (7, 7, 70000.00, '2023-04-01');

