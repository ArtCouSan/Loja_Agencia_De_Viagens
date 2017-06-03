<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css" />
        <link type="text/css"  href="./bootstrap/css/bootstrap.min.css" rel="stylesheet" />
        <link type="text/css"  href="./bootstrap/css/particular.css" rel="stylesheet" />
        <script src="./bootstrap/js/event.js" type="text/javascript" ></script>
        <title>Editar Hotel</title>
    </head>
    <body>
        <c:import url="./cabecalho.jsp"/>
        <div class="panel-body">
            <form name="editah" action="EditarHotel" method="post" class="form-horizontal">
                <input type="hidden" name="identificacao" value="${hoteis.getId_hotel()}"/>
                <div class="form-group ">
                    <c:if test="${erroNome_hotel}">
                        <div class="erro">O nome é obrigatório</div>
                    </c:if>
                    <label for="example-text-input" class="control-label col-md-4">Nome do Hotel:</label>
                    <div class="controls col-md-5">
                        <input class="form-control" name="nome_hotel" value="${hoteis.getNome()}" type="text" id="example-text-input" required> 
                    </div>
                </div>
                <div class="form-group">
                    <c:if test="${erroData_entrada}">
                        <div class="erro">Digite o nome do hotel</div>
                    </c:if>
                    <label for="example-date-input" class="control-label col-md-4">Data de entrada:</label>
                    <div class="controls col-md-5">
                        <input class="form-control" name="data_entrada" value="${hoteis.getData_entrada()}" type="date" id="example-date-input" required>
                    </div>
                </div>
                <div class="form-group">
                    <c:if test="${erroData_saida}">
                        <div class="erro">Digite o nome do hotel</div>
                    </c:if>
                    <label for="example-date-input" class="control-label col-md-4">Data de saida:</label>
                    <div class="controls col-md-5">
                        <input class="form-control" name="data_saida" value="${hoteis.getData_saida()}" type="date" id="example-date-input" required>
                    </div>
                </div>
                <div class="form-group">
                    <c:if test="${erroQuantidade_quartos}">
                        <div class="erro">Quantidade de quartos é obrigatório</div>
                    </c:if>
                    <label for="example-number-input" class="control-label col-md-4">Quantidade de Quartos:</label>
                    <div class="controls col-md-5">
                        <input class="form-control" type="number" name="quantidade_quartos" value="${hoteis.getQuantidade_quartos()}" id="example-number-input" required>
                    </div>
                </div>
                <div class="form-group">
                    <c:if test="${erroQuantidade_hospedes}">
                        <div class="erro">Quantidade de hospedes é obrigatório</div>
                    </c:if>
                    <label for="example-number-input" class="control-label col-md-4">Quantidade de Hospedes:</label>
                    <div class="controls col-md-5">
                        <input class="form-control" type="number" name="quantidade_hospedes" value="${hoteis.getQuantidade_hospedes()}" id="example-number-input" required>
                    </div>
                </div>
                <div class="form-group">
                    <c:if test="${erroPreco}">
                        <div class="erro">O preco é obrigatorio</div>
                    </c:if>
                    <label for="example-number-input" class="control-label col-md-4">Preco:</label>
                    <div class="controls col-md-5">
                        <input class="form-control" type="number" name="preco" value="${hoteis.getPreco()}" id="example-number-input" required>
                    </div>
                </div>
                    
                <div class="col-md-12 text-center">
                    <button type="submit" class="btn btn-primary botao_g"><span class="">Alterar</span></button>
                </div>
            </form>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="./bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>
