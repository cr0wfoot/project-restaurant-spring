<%@page   contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.registration.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <a href="?lang=en_EN">en</a> | <a href="?lang=ru_RU">ru</a>
        <h1>
            <spring:message code="view.jsp.registration.header" />
        </h1>
        <form:form method="POST" action="registration.restaurant" modelAttribute="user">
            <table border="1">
                <tr>
                    <td>
                        <spring:message code="view.entity.user.login" />
                    </td>
                    <td>
                        <form:input path="login" type="edit" name="login" />
                        <form:errors path="login" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <spring:message code="view.entity.user.password" />
                    </td>
                    <td>
                        <form:input path="password" type="password" name="password" />
                        <form:errors path="password" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <spring:message code="view.entity.user.name" />
                    </td>
                    <td>
                        <form:input path="name" type="edit" name="name" />
                        <form:errors path="name" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="hidden" name="command" value="register" />
                        <input type="submit" name="submit" value="<spring:message code="view.button.enter" />"/>
                    </td>
                </tr>        
            </table>
        </form:form>
    </body>
</html>
