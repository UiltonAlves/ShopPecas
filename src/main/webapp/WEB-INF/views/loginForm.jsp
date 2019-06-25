<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<tags:pageTemplate titulo="Faça seu login.">
	<section id="index-section" class="container middle">
		<h1>Login da Casa do Código</h1>
		
		<form:form servletRelativeAction="/login" method="POST">
				<div class="form-group">
					<label>E-mail</label> 
					<input name="username" type="text" Class="form-control" />
				</div>
	
				<div class="form-group">
					<label>Senha</label> 
					<input type="password" name="password"	Class="form-control" />
				</div>
	
				<button type="submit" class="btn btn-primary">Logar</button>

		</form:form>
	</section>
</tags:pageTemplate>