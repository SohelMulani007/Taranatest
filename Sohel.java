<html>

<head>

</head>

<body>
    <script>
        function displaymessage() {
            //retrieve the value from textbox and store it in name variable
            name = document.getElementById("nm").value
                //document.write("Hello " + name);
            document.getElementById("mydiv").innerHTML = "Hello " + name;
            //to clear the contents of textbox programatically
            document.getElementById("nm").value = "";
        }
    </script>
    <input type="text" name="nm" id="nm">
    <button type="button" name="btn" onclick="displaymessage()">click me</button>
    <div id="mydiv"></div>
</body>

</html>