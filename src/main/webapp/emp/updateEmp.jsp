<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangte
  Date: 2019/10/30
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>update Emp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css" />
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
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                update Emp info:
            </h1>
            <form action="${pageContext.request.contextPath}/emp/update?dept_id=${requestScope.emp.dept_id}" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            id
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" name="id" readonly value="${requestScope.emp.id}">
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            name:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name" value="${requestScope.emp.name}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            salary:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="salary" value="${requestScope.emp.salary}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            age:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="age" value="${requestScope.emp.age}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            bir:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="bir" value="${requestScope.emp.bir}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            请选择部门:(处理默认值选中)
                        </td>
                        <td valign="middle" align="left">
                            <select style="width:178px;" name="dept_id">
                                <option>请选择</option>
                                <c:forEach items="${requestScope.deptlist}" var="dept">
                                    <option>请选择</option>
                                    <c:if test="${dept.id eq emp.dept_id}">
                                        <option value="${dept.id}" selected>${dept.name}</option>
                                    </c:if>
                                   <c:if test="${dept.id ne emp.dept_id}">
                                       <option value="${dept.id}">${dept.name}</option>
                                   </c:if>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="Confirm" />
                </p>
            </form>
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

