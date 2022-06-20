
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Avaliacao</title>
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="visual/avaliacao.css">
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

<div class="tela" style="padding-bottom: 140px; padding-left: 40px;padding-top: 30px;">
<br>
<h1>Avaliação</h1><br>
<label for="nome"><b>Nome</b></label><br>
<input type="text" id="nome" placeholder="Digite seu nome" name="nome" required>
<br>
<p>Nos avalie de acordo com as estrelas</p><br>

    <form id="form1" method="$_GET" enctype="multipart/form-data">
        <div class="estrelas">
            <input type="radio" id="vazio" name="estrela" value="" checked>

            <label for="estrela_um"><i class="fa"></i></label>
            <input type="radio" id="estrela_um" name="estrela" value="1" >

            
            <label for="estrela_dois"><i class="fa"></i></label>
            <input type="radio" id="estrela_dois" name="estrela" value="2" >

            
            <label for="estrela_tres"><i class="fa"></i></label>
            <input type="radio" id="estrela_tres" name="estrela" value="3" >

            
            <label for="estrela_quatro"><i class="fa"></i></label>
            <input type="radio" id="estrela_quatro" name="estrela" value="4" >

            
            <label for="estrela_cinco"><i class="fa"></i></label>
            <input type="radio" id="estrela_cinco" name="estrela" value="5" ><br><br>

            <h1>Sugestões</h1>
            <br>

            <textarea id="sugestoes" placeholder="Deixe suas sugestões ou comentarios!" style="height:200px"></textarea>
            <div class="botao">
            <button id="btnEnviar">Enviar</button>
    </div>

        </div>
    </form>
</div>
  
       
       
       <script>
          $("button").click(() => {
     if($("#nome").val() == ""){
     alert("É necessário preencher todos os campos de informações.");
    }else{
      alert("Obrigado pelo seu feedbeck! :)");
    }
});
        </script>


    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="js/script.js"></script>

</body>
</html>