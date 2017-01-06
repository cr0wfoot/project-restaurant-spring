<%@page   contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ct"     uri="/WEB-INF/tlds/TLDlibrary.tld"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <spring:message code="view.jsp.error.title" />
        </title>
    </head>
    <body>
        <ct:DateToday format="dd.MM.yyyy"/>
        <table border="1">
            <tr>
                <td>
                    <spring:message code="view.jsp.error.header" />
                </td>
            </tr>
            <tr>
                <td>
                    ${message}
                </td>
            </tr>
        </table>      
    </body>
</html>
