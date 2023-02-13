<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">	
	<meta charset="ISO-8859-1">
	<title>Cadastro de Usuário</title>
</head>
<body>
	<div class="container">
		<form action="/usuario/incluir" method="post">
			<h3>Cadastro de Usuário</h3>
		
			<div class="form-group">
				<label>Nome:</label> 	
				<input type="text" name="nome" value="Fabio ALmeida" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Senha:</label>
				<input type="password" name="senha" value="Fbdp123" class="form-control">
			</div>
			
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email" name="email" value="fabihoalmeida@gmail.com" class="form-control">
			</div>
						
			<div class="form-group">
				<label>Idade:</label> 	
				<input type="text" name="idade" value="32" class="form-control">
			</div>

			<div class="form-group">
				<label>Salário:</label> 	
				<input type="text" name="salario" value="999999" class="form-control">
			</div>

			<div class="form-group">
				<label>Função:</label>
			    <div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="caracteristicas" value="De" class="form-check-input" > Gerente
			      </label>
			    </div>
			    <div class="form-check">
			      <label class="form-check-label">
			        <input type="checkbox" name="caracteristicas" value="An" checked class="form-check-input"> Supervisor
			      </label>
			    </div>
			    <div class="form-check">
			      <label class="form-check-label">
		        		<input type="checkbox" name="caracteristicas" value="Da" class="form-check-input"> Encarregado
			      </label>
			    </div>
			</div>

			<div class="form-group">						
				<label>Alocação:</label>			
				<div class="form-check">
				  <label class="form-check-label">
				    <input type="radio" name="tipo" value="P" class="form-check-input" > Campo
				  </label>
				</div>			
				<div class="form-check">
				  <label class="form-check-label">
					<input type="radio" name="tipo" value="D" class="form-check-input"> Diretoria
				  </label>
				</div>			
				<div class="form-check">
				  <label class="form-check-label">
				    <input type="radio" name="tipo" value="A" checked class="form-check-input"> Administrativo
				  </label>
				</div>			
			</div>
			
			<div class="form-group">
				<label>Setor:</label>
				<select name="setor" class="form-control">
					<option value="1">Diretoria</option>
					<option value="2">Comercial</option>
					<option value="3" selected>Desenvolvimento</option>
				</select>
			</div>
			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>