<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Список документов</title>
</head>
<body>

<h3>Все Документы:</h3>(<a href="add.jsp">добавить</a>)
<ol>
    <c:forEach items="${message}" var="mes">
        <li>
                ${mes.predm}
            <a href="add.jsp?edit=${mes.idmes}">редактировать</a> | <a href="delete.jsp?id=${mes.idmes}">удалить</a>
        </li>
    </c:forEach>
</ol>

</body>
</html>