<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>SoPact - Making an impact through social connection</title>
    
    <link href="https://fonts.googleapis.com/css?family=Salsa|Bungee+Inline|Open+Sans" rel="stylesheet">


    <link rel="stylesheet" href="assets/main.css" type="text/css" />
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
        integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>

    <script src="assets/process-forms.js"></script>
</head>
<body>

    <div class="site-wrapper">
    
        <div class="header-wrapper">
            <h1>Find Your Cause</h1>
            <h2>Matching you with organizations that you care about.</h2>
        </div>

        <div class="page-wrapper">

            <div class="area-wrapper">
                <h3>Start by selecting your top 3 causes</h3>

                <div id="top-3-message"></div>

                <form id="register-interests" action="register-activist.php" method="POST">

                    <fieldset>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="animal-rights" value="Animal Rights" class="input-box checkbox-max-3"> <label for="animal-rights" class="label-for-check">Animal Rights</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="gender-equality" value="Gender Equality" class="input-box checkbox-max-3"> <label for="gender-equality" class="label-for-check">Gender Equality</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="housing" value="Housing" class="input-box checkbox-max-3"> <label for="housing" class="label-for-check">Housing</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="poverty" value="Poverty" class="input-box checkbox-max-3"> <label for="poverty" class="label-for-check">Poverty</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="hunger" value="Hunger" class="input-box checkbox-max-3"> <label for="hunger" class="label-for-check">Hunger</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="healthcare" value="Healthcare" class="input-box checkbox-max-3"> <label for="healthcare" class="label-for-check">Healthcare</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="children" value="Children" class="input-box checkbox-max-3"> <label for="children" class="label-for-check">Children</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="performing-arts" value="Performing Arts" class="input-box checkbox-max-3"> <label for="performing-arts" class="label-for-check">Performing Arts</label>
                        </div>
                        <div class="checkbox-wrapper">
                            <input type="checkbox" name="interests[]" id="environmental-awareness" value="Environmental Awareness" class="input-box checkbox-max-3"> <label for="environmental-awareness" class="label-for-check">Environmental Awareness</label>
                        </div>
                    </fieldset>

                    <input type="submit" value="Get Matched">

                </form>
            </div>

            <div class="area-wrapper">
                <div class="area">
                    <h4>Are you a nonprofit?</h4>
                    <p><a href="register-nonprofit.php">Register your nonprofit to start finding supporters and activists.</a></p>
                </div>
                <div class="area">
                    <h4>Already connected?</h4>
                    <p><a href="dashboard.php">Log into your account.</a></p>
                </div>
            </div>

        </div>
    </div>
	
</body>
</html>