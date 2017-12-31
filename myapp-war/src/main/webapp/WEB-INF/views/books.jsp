<%@ taglib uri="http://myapp/tags" prefix="myapp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

reached the jsp: ${result}
<br>
<myapp:mytag param1="aaa"/>
<br> 
<myapp:filetag param1="wwww" /> 
<br>
  <c:if test="${myapp:isEven(4)}">
        4 is even
 </c:if> 
 
  <c:if test="${myapp:isEven(3)}">
        3 is not even
 </c:if> 