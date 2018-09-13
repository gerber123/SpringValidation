<%--
  Created by IntelliJ IDEA.
  User: gerber
  Date: 12.09.2018
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Kreator</title>
    <style>
        .error{color:RED}
    </style>
</head>
<body>
        <form:form action="creatingProcess" modelAttribute="knight">
            Knight Name: <form:input path="firstName"/>
            <form:errors path="firstName" cssClass="error"/>
            <br><br>
            Guild Name: <form:input path="guildName"/>
            <form:errors path="guildName" cssClass="error"/>
            <br><br>
            Knight Age: <form:input path="age"/>
            <form:errors path="age" cssClass="error"/>
            <br><br>
            Village postal Code: <form:input path="postalCode"/>
            <form:errors path="age" cssClass="error"/>
            <br><br>
            Blood Code: <form:input path="bloodCode"/>
            <form:errors path="bloodCode" cssClass="error"/>
            <br><br>
            Knight Class:
                <form:select path="ownClass">
                    <form:option value="Assasyn" label="Assasyn"/>
                    <form:option value="Paladin" label="Paladin"/>
                    <form:option value="Archer" label="Archer"/>
                </form:select>
            <<input type="submit" value="Stworz">
        </form:form>

</body>
</html>
