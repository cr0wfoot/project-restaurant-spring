<%@page   contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.user.make.order.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <form method="POST" action="user.restaurant">
            <input type="hidden" name="command" value="usr_make_order">
            <input type="submit" name="lang" value="en_EN" />
            <input type="submit" name="lang" value="ru_RU" />
        </form>
        <form method="POST" action="user.restaurant">
            <input type="hidden" name="command" value="usr_main_page">
            <input type="submit" name="submit" value="<spring:message code="view.button.main" />" />
        </form>
        <h1><spring:message code="view.jsp.user.make.order.header" /></h1>
        <form method="POST" action="user.restaurant">
            <table border="1">
                <tr>
                    <td colspan="6">
                        <spring:message code="view.entity.ingredient.header" />
                    </td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <spring:message code="view.entity.ingredient.name" />
                    </td>
                    <td>
                        <spring:message code="view.entity.ingredient.consist" />
                    </td>
                    <td>
                        <spring:message code="view.entity.ingredient.calorie" />
                    </td>
                    <td>
                        <spring:message code="view.entity.ingredient.weight" />
                    </td>
                    <td>
                        <spring:message code="view.entity.ingredient.price" />
                    </td>
                </tr>
                <c:forEach  items="${ingredients}" var="ingredient" >
                <tr>                
                    <td>
                        <input type="checkbox" name="ingredients" value="${ingredient.id}" />
                    </td>
                    <td> 
                        ${ingredient.name}         
                    </td>
                    <td> 
                        ${ingredient.consist}         
                    </td>
                    <td> 
                        ${ingredient.calorie}         
                    </td>
                    <td> 
                        ${ingredient.weight}         
                    </td>
                    <td> 
                        ${ingredient.price}         
                    </td>
                </tr>
                </c:forEach>
            </table>
            <input type="hidden" name="command" value="usr_insert_order">
            <input type="submit" name="submit" value="<spring:message code="view.button.insert" />">
        </form>
    </body>
</html>
