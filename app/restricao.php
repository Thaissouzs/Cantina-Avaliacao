<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Restricoes</title>
    <link rel="stylesheet" href="visual/stylee.css">
</head>
<body>
  <div class="menu">
<div class="btnCardapio">
  <a id="cardapio">Cardapio</a>
  </div>
  <div class="btnRozidio">
  <a id="rodizio">Rodizio</a>
  </div>
  <div class="btnAvaliacao">
  <a id="avaliacao">Avaliação</a>
  </div>
  <div class="btnRestricoes">
  <a id="restricoes">Restrições</a>
</div>
    </div>


<form id="form1">

<div class="tela">
    <h1>Restrições</h1>
    <p>Informe se você tiver alguma alergia ou restrição determinadas por especialista.</p>
    <hr>

    <label for="nome"><b>Nome</b></label>
    <input type="text" id="usuario" placeholder="Digite seu nome completo">
    <br>
    <input type="radio" name="turma" value="Informatica"/> Informatica
    <input type="radio" name="turma" value="Enfermagem"/> Enfermagem
    <input type="radio" name="turma" value="Guia"/> Guia<br>
    <br>
    <input type="radio" name="serie" value="1º ano"/> 1º ano
    <input type="radio" name="serie" value="2º ano"/> 2º ano
    <input type="radio" name="serie" value="3º ano"/> 3º ano<br>
    <br>

    <label for="Restricao">Informe sua Restrição</label>
    
    <textarea id="campoTexto" placeholder="Informe suas Restrições ou alergias" style="height:200px"></textarea>
    <div class="botao">
      <button id="btnEnviar">Enviar</button>
    </div>
</div>
</form> 

<script src="js/script.js"></script>

<script>

   $("button").click(() => {
     if($("#usuario").val() == ""){
     alert("É necessário preencher todos os campos de informação.");
    }else if($("#campoTexto").val()== ""){
        alert("Não é possivel cadastrar sua restrição, pois você não prencheu todas as informações corretamente.");
    }else{
      alert("Suas informações foram cadastradas com sucesso!");
    }
});
        </script>


       <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

      <script src="js/script.js"></script>
</body>
</html>