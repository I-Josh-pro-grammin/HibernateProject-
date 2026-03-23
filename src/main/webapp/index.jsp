<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Management System</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background-color: #f4f7f6;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            margin-bottom: 5px;
            color: #666;
            font-weight: 500;
        }

        input[type="text"] {
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
            transition: border-color 0.3s;
        }

        input[type="text"]:focus {
            border-color: #007bff;
            outline: none;
        }

        button {
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #0056b3;
        }

        .view-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #007bff;
            text-decoration: none;
        }

        .view-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Add New Student</h2>

    <form method="post" action="students">
        <label for="firstName">First Name</label>
        <input type="text" id="firstName" name="firstName" required placeholder="Enter first name"/>

        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName" required placeholder="Enter last name"/>

        <label for="schoolName">School Name</label>
        <input type="text" id="schoolName" name="schoolName" required placeholder="Enter school name"/>

        <label for="academicYear">Academic Year</label>
        <input type="text" id="academicYear" name="academicYear" required placeholder="e.g., 2023-2024"/>

        <label for="laptopDesc">Laptop Description</label>
        <input type="text" id="laptopDesc" name="laptopDesc" placeholder="e.g., Dell XPS 13"/>

        <button type="submit">Save Student</button>
    </form>

    <a href="students" class="view-link">View All Students</a>
</div>

</body>
</html>
