<%@page   contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.admin.users.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <form method="POST" action="admin.restaurant">
            <input type="hidden" name="command" value="adm_get_users">
            <input type="submit" name="lang" value="en_EN" />
            <input type="submit" name="lang" value="ru_RU" />
        </form>
        <form method="POST" action="admin.restaurant">
            <input type="hidden" name="command" value="adm_main_page">
            <input type="submit" name="submit" value="<spring:message code="view.button.main" />" />
        </form>
        <h1><spring:message code="view.jsp.admin.users.header" /></h1>
        <table border="1">  
            <tr>
                <td>
                    <spring:message code="view.entity.user.id" />
                </td>
                <td>
                    <spring:message code="view.entity.user.login" />
                </td>
                <td>
                    <spring:message code="view.entity.user.name" />
                </td>
                <td>
                    <spring:message code="view.entity.user.access" />
                </td>
                <td>
                    
                </td>
                <td>
                    
                </td>
            </tr>
            <c:forEach  items="${users}" var="user" >
            <tr>
                <form method="POST" action="admin.restaurant">
                    <td> 
                        ${user.id}
                    </td>
                    <td> 
                        ${user.login}         
                    </td>
                    <td> 
                        ${user.name}         
                    </td>
                    <td> 
                        <input type="edit" name="access" value="${user.access}"/>  
                    </td>
                    <td>
                        <input type="hidden" name="command" value="adm_update_users">
                        <input type="hidden" name="id" value="${user.id}">
                        <input type="submit" name="submit" value="<spring:message code="view.button.accept" />">
                    </td> 
                </form>
                <form method="POST" action="admin.restaurant">
                    <td>
                        <input type="hidden" name="command" value="adm_del_user">
                        <input type="hidden" name="id" value="${user.id}">
                        <input type="submit" name="submit" value="<spring:message code="view.button.delete" />">
                    </td>
                </form>
            </tr>
            </c:forEach>  
        </table>
    </body>
</html>
