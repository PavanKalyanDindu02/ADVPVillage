<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.example.Adavipalem.Model.Temple" %> <!-- Import your Temple class -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Temples</title>
    <style>
            table {
                width: 100%;
                max-width: 900px;
                margin: 0 auto;
                border-collapse: collapse;
                background-color: #fff;
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            }
            .container {
                        display: flex;
                        justify-content: center;  /* Align horizontally */
                        align-items: center;      /* Align vertically */
                        height: 100vh;            /* Take full height of the viewport */
                    }
                    .centered-div {
                        width: 600px;
                        height: 400px;
                        background-color: lightblue;
                        text-align: center;  /* Optional: To center text inside the div */
                    }

    </style>
</head>
<body>
<h1>Welcome to adavialem Temples</h1>
    <table>
        <thead>
            <tr>
                <th>Temple_ID</th>
                <th>Temple_name</th>
                <th>Contact</th>
                <th>Address</th>
                <th>About</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Temple> temples = (List<Temple>) request.getAttribute("temples");  // Retrieve temples list from request
                for (Temple temple : temples) {
            %>
                <tr>
                    <td><%= temple.getTemple_ID() %></td>
                    <td><%= temple.getTemple_name() %></td>
                    <td><%= temple.getContact() %></td>
                    <td><%= temple.getAddress() %></td>
                    <td><%= temple.getAbout() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
<div class = "container">
    <div class = "centered-div">
        <form action="/Adavipalem/addTemple" method ="post" align = "center">
            Enter the Temple ID <input type="number" name = "Temple_ID"><br>
            Enter the Temple Name <input type= "text" name = "Temple_name"><br>
            Enter the Contact <input type = "text" name = "Contact"><br>
            Enter the Address <input type = "text" name = "Address"><br>
            Enter the About <input type = "text" name = "About"><br>
            <input type = "submit">
        </form>
    </div>
</div>
</body>
</html>