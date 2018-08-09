<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product List</title>
</head>
<body>
    <div align="center">
        <table width="80%" border="1" style="border-collapse: collapse;">
            <tr>
                <th>No</th>
                <th>Title</th>
                <th>Content</th>
                <th>Description</th>
            </tr>
            <s:iterator value="listArticle" status="stat">
                <tr>
                    <td><s:property value="#stat.count" escape="false"/></td>
                    <td><s:property value="title" escape="false"/></td>
                    <td><s:property value="content" escape="false"/></td>
                    <td><s:property value="description" escape="false"/></td>
                </tr>
            </s:iterator>        
        </table>
    </div>
</body>
</html>