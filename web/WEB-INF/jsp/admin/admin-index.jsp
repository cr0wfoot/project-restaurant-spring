<%@page   contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.admin.index.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <form method="POST" action="admin.restaurant">
            <input type="hidden" name="command" value="adm_main_page">
            <input type="submit" name="lang" value="en_EN" />
            <input type="submit" name="lang" value="ru_RU" />
        </form>
        <h1><spring:message code="view.jsp.admin.index.header" /></h1>
        <table border="1">
            <tr>
                <td colaspan="3">
                    <spring:message code="view.entity.order.header" />
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.order.id" />
                </td>
                <td>
                    <spring:message code="view.entity.order.user" />
                </td>
                <td>
                    
                </td>
            </tr>
            <c:forEach  items="${orders}" var="order" >
            <tr>
                <td> 
                    ${order.id}         
                </td>
                <td> 
                    ${order.userId}         
                </td>
                <td>
                    <form method="POST" action="admin.restaurant">
                        <input type="hidden" name="command" value="adm_get_order">
                        <input type="hidden" name="id" value="${order.id}">
                        <input type="submit" name="submit" value="<spring:message code="view.button.more" />">
                    </form> 
                </td>
            </tr>
            </c:forEach>
        </table>
        <form method="POST" action="admin.restaurant">
             <input type="hidden" name="command" value="adm_get_users">
             <input type="submit" name="submit" value="<spring:message code="view.button.users" />">
        </form>
    </body>
</html>
