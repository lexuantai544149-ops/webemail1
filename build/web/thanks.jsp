<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Survey Results</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h2>Thanks for filling out the survey!</h2>
    <p>Here is the information that you entered:</p>

    <label>First Name:</label> <span>${user.firstName}</span><br>
    <label>Last Name:</label> <span>${user.lastName}</span><br>
    <label>Email:</label> <span>${user.email}</span><br>
    <label>Date of Birth:</label> <span>${user.dob}</span><br>
    <label>Heard about us:</label> <span>${user.source}</span><br>
    <label>Updates:</label> <span>${user.updates}</span><br>
    <label>Email Announcements:</label> <span>${user.emailUpdates}</span><br>
    <label>Contact Method:</label> <span>${user.contactMethod}</span><br>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>
