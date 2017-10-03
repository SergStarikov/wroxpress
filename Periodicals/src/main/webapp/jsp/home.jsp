
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String imageURL=application.getInitParameter("imageURL");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="centered">

    <jsp:include page="header.jsp" flush="true" />
    <br />
    <jsp:include page="leftColumn.jsp" flush="true" />
    <span class="label">Featured Books</span>
    <table>
        <tr>
            <td>
                <img src="<%=imageURL%>/116.png" /></td>
            <td><img src="<%=imageURL%>/231.gif" /></td>
            <td><img src="<%=imageURL%>/311.png" /></td>
            <td><img src="<%=imageURL%>/9900.png" /></td>
            <td><img src="<%=imageURL%>/11457.gif" /></td>
        </tr>
        <tr>
            <td><img src="<%=imageURL%>/74320.png" /></td>
            <td><img src="<%=imageURL%>/91700.png" /></td>
            <td><img src="<%=imageURL%>/92004.png" /></td>
            <td><img src="<%=imageURL%>/96183.png" /></td>
            <td><img src="<%=imageURL%>/98566.gif" /></td>
        </tr>
    </table>
</div>
</body>
</html>
