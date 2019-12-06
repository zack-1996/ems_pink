<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangte
  Date: 2019/10/30
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Operation(删除部门员工一并删除)
                    </td>
                </tr>
                <c:forEach items="${requestScope.list}" var="dept">
                    <tr class="row1">
                        <td>
                            ${dept.id}
                        </td>
                        <td>
                            ${dept.name}
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/dept/delete?dept_id=${dept.id}">delete emp</a>&nbsp;<a href="${pageContext.request.contextPath}/dept/findOne">update emp</a>&nbsp;<a href="${pageContext.request.contextPath}/emp/findAll?dept_id=${dept.id}">show emps</a>
                        </td>
                    </tr>
                </c:forEach>

            </table>
            <p>
                <input type="button" class="button" value="Add Dept" onclick="location='dept/addDept.jsp'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
