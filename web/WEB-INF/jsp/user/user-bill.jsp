<%@page   contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.user.bill.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <a href="?command=usr_get_bill&lang=en_EN">en</a> | <a href="?command=usr_get_bill&lang=ru_RU">ru</a>
        <form method="POST" action="user.restaurant">
            <input type="hidden" name="command" value="usr_get_bill">
            <input type="hidden" name="id" value="${bill.id}">
            <input type="submit" name="lang" value="en_EN" />
            <input type="submit" name="lang" value="ru_RU" />
        </form>
        <form method="POST" action="user.restaurant">
            <input type="hidden" name="command" value="usr_main_page">
            <input type="submit" name="submit" value="<spring:message code="view.button.main" />" />
        </form>
        <h1><spring:message code="view.jsp.user.bill.header" /></h1>
        <table border="1">
            <tr>
                <td>
                    <spring:message code="view.entity.bill.id" />:
                </td>
                <td>
                    ${bill.id}
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.bill.info" />:
                </td>
                <td>
                    ${bill.info}
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="view.entity.bill.price" />:
                </td>
                <td>
                    ${bill.price}
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <form method="POST" action="user.restaurant">
                        <input type="hidden" name="command" value="usr_pay_bill">
                        <input type="hidden" name="id" value="${bill.id}">
                        <input type="submit" name="submit" value="<spring:message code="view.button.pay" />">
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
