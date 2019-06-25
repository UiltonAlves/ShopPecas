<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/" var="contextPath" />

<header id="layout-header">
    <div class="clearfix container">
        <div id="header-content">
            <nav id="main-nav">
            <ul>
                    <li>
                        <a href="${contextPath}logout" rel="nofollow">
                            <fmt:message	key="menu.sair"/>
                        </a>
                    </li>
				</ul>
            </nav>
        </div>
    </div>
</header>
<nav class="categories-nav">
    <ul class="container">
        <li class="category">
      	  <a href="#">
       		 <fmt:message	key="navegacao.categoria.home"/>
       	  </a>
        </li>        
    </ul>
</nav>