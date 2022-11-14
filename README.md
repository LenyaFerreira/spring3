1. A questão 1 se refere a uma API REST com os endpoints:
• POST - /api/states
• GET - /api/states
• GET - /api/states/{id}
• PUT - /api/states/{id}
• DELETE - /api/states/{id}
A tabela possui o formato:
{
"id": "1",
"nome": "Rio Grande do Norte",
"regiao": "Nordeste",
"populacao": 3409000,
"capital": "Natal",
"area": 52.797
}
com o ID sendo gerado automaticamente. O usuário pode realizar operações de inserção (não definindo o ID), obtenção dos dados gerais, a partir do ID ou filtrando por região, atualização do título dos itens a partir do ID e exclusão de itens a partir do ID.
