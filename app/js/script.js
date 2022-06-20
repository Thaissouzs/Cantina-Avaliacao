function abrirTela(url){
    $.ajax({
        url: url,
        success: (e) => {
            $(".container").children().hide();
            $(".container").html(e);
        }
    })
}

$('#form1').submit(function(e){
    e.preventDefault();
});

$("#rodizio").click(()=>{
    abrirTela("rodizio.php");
})
$("#cardapio").click(()=>{
    abrirTela("cardapio.php");
})
$("#restricoes").click(()=>{
    abrirTela("restricao.php");
})
$("#avaliacao").click(()=>{
    abrirTela("avaliacao.php");
})
