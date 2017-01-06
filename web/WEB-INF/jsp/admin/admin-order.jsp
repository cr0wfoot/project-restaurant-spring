<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.admin.order.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <form method="POST" action="admin.restaurant">
            <input type="hidden" name="command" value="adm_get_order">
            <input type="hidden" name="id" value="${order.id}">
            <input type="submit" name="lang" value="en_EN" />
            <input type="submit" name="lang" value="ru_RU" />
        </form>
        <form method="POST" action="admin.restaurant">
            <input type="hidden" name="command" value="adm_main_page">
            <input type="submit" name="submit" value="<spring:message code="view.button.main" />" />
        </form>
        <h1><spring:message code="view.jsp.admin.order.header" /></h1>
        <table border="1">
            <tr>
                <td>
                    <spring:message code="view.entity.order.id" />
                </td>
                <td>
                    ${order.id}
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.order.time" />
                </td>
                <td>
                    ${order.time}
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.order.user" />
                </td>
                <td>
                    ${order.userId}
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.order.ingredients" />
                </td>
                <td>
                    <table border="1">
                        <tr>
                            <td>
                                <spring:message code="view.entity.ingredient.name" />
                            </td>
                            <td>
                                <spring:message code="view.entity.ingredient.price" />
                            </td>
                        </tr>
                        <c:forEach  items="${order.ingredients}" var="ingredient" >
                        <tr>
                            <td> 
                                ${ingredient.name}         
                            </td>
                            <td> 
                                ${ingredient.price}         
                            </td>               
                        </tr>
                        </c:forEach>
                    </table>
                </td>
            </tr>
        </table>  
        <form method="POST" action="admin.restaurant">
            <input type="hidden" name="command" value="adm_accept_order">
            <input type="hidden" name="id" value="${order.id}">
            <input type="submit" name="submit" value="<spring:message code="view.button.accept" />">
        </form>
    </body>
</html>
