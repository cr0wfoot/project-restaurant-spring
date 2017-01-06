<%@page   contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.user.index.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <form method="POST" action="user.restaurant">
            <input type="hidden" name="command" value="usr_main_page">
            <input type="submit" name="lang" value="en_EN" />
            <input type="submit" name="lang" value="ru_RU" />
        </form>
        <table border="1">
            <tr>
                <td colspan="2">
                    <spring:message code="view.jsp.user.index.header" />
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.user.name" />
                </td>
                <td>
                    ${user.name}
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.user.login" />
                </td>
                <td>
                    ${user.login}
                </td>
            </tr>
        </table>
        <table border="1">
            <tr>
                <td colspan="3">
                    <spring:message code="view.entity.bill.header" />
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.bill.id" />
                </td>
                <td>
                    <spring:message code="view.entity.bill.price" />
                </td>
                <td>
                    
                </td>
            </tr>
            <c:forEach  items="${bills}" var="bill" >
            <tr>
                <td>
                    ${bill.id}
                </td>
                <td>
                    ${bill.price}
                </td>
                <td>
                    <form method="POST" action="user.restaurant">
                        <input type="hidden" name="command" value="usr_get_bill">
                        <input type="hidden" name="id" value="${bill.id}">
                        <input type="submit" name="submit" value="<spring:message code="view.button.more" />">
                    </form> 
                </td>
            </tr>
            </c:forEach>
        </table>
        <table border="1">
            <tr>
                <td colspan="3">
                    <spring:message code="view.entity.order.header" />
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.order.id" />
                </td>
                <td>
                    <spring:message code="view.entity.order.time" />
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
                    ${order.time}
                </td>
                <td>
                    <form method="POST" action="user.restaurant">
                        <input type="hidden" name="command" value="usr_get_order">
                        <input type="hidden" name="id" value="${order.id}">
                        <input type="submit" name="submit" value="<spring:message code="view.button.more" />">
                    </form> 
                </td>
            </tr>
            </c:forEach>
        </table>
        <form method="POST" action="user.restaurant">
             <input type="hidden" name="command" value="usr_make_order">
             <input type="submit" name="submit" value="<spring:message code="view.button.make.order" />">
        </form>                    
    </body>
</html>
