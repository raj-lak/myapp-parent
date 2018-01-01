<%@ taglib uri="http://myapp/tags" prefix="myapp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor='wheat'>
  <div align='center' style="width=500px; margin: auto; border: 3px solid #73AD21;">
    <hr>
    Param passing and custom annotation: <br> Reached the jsp: ${result}
    <hr>
    Taglib: <br>
    <myapp:mytag param1="aaa" />
    <hr>
    File Tag: <br>
    <myapp:filetag param1="wwww" />
    <hr>
    JSP Custom Function: <br>
    <c:if test="${myapp:isEven(4)}">
        4 is even <br>
    </c:if>
    <c:if test="${not myapp:isEven(3)}">
        3 is not even
     </c:if>
    <hr>
 
<form:form name="books" method="POST" commandName="command">
  <input type=submit name="init" value="Init Data"/>
</form:form>

    <hr>
    Create Query: <br>
    <c:if test="${not empty bookList}">
      <table border=1>
        <tr>
          <td>BookId</td>
          <td>Title</td>
        </tr>
        <c:forEach items="${bookList}" var="book">
          <tr>
            <td>${book.bookId}</td>
            <td>${book.title}</td>
          </tr>
        </c:forEach>
      </table>
    </c:if>
    
        <hr>
    Named Query: <br>
    <c:if test="${not empty namedQueryList}">
      <table border=1>
        <tr>
          <td>BookId</td>
          <td>Title</td>
        </tr>
        <c:forEach items="${namedQueryList}" var="book">
          <tr>
            <td>${book.bookId}</td>
            <td>${book.title}</td>
          </tr>
        </c:forEach>
      </table>
    </c:if>
    
    
  </div>
</body>
</html>