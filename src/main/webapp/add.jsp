<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление | Редактирование</title>
</head>
<body>

<form action="add.jsp" method="post">
    <label for="predm">Предмет Поручения:
        <input type="text" id="predm" value="${message.predm}" name="predm" />
    </label>  <br />
    <label for="text">Текст поручения:
        <input type="text" id="text" value="${message.text}" name="text" />
    </label>  <br />

    <input type="hidden" name="id" value="${message.id}" />
    <input type="submit" value="Сохранить" />
</form>

</body>
</html>