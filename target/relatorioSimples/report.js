$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "line": 1,
  "name": ": Consulta",
  "description": "",
  "id": ":-consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2053876900,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Consultar Petisco",
  "description": "",
  "id": ":-consulta;consultar-petisco",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que acesso a Cobasi",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquiso por \"Petisco\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "exibe a expressao \"Petisco - Cobasi\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoACobasi()"
});
formatter.result({
  "duration": 5494276800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Petisco",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 6719964400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Petisco - Cobasi",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressaoNoTituloDaGuia(String)"
});
formatter.result({
  "duration": 7652200,
  "status": "passed"
});
formatter.after({
  "duration": 771059000,
  "status": "passed"
});
});