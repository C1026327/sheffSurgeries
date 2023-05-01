<!doctype html>
<html>
<head>
    <meta name="layout content="main"/>
    <title>Receptionist Home Page</title>
</head>
<body>
    <div id="content" role="main">
        <div class="first">
            <h1>Patient Management</h1>
            <p></p>
            <button type="button" class="btn btn-success">
                <g:link controller="Patient" action="create">Add a new Patient</g:link>
            </button>
        </div>

        <div class="second">
            <h1>Appointment Management</h1>
            <p></p>
            <button type="button" class="btn btn-success">
                <g:link controller="Appointment" action="create">Create a new Appointment</g:link>
            </button>
        </div>
    </div>
</body>
</html>