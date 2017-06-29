# BasicSelectQueryGenerator

Problema: O Banco de dados do usuário continha muitas tabelas e nem sempre as tabelas tinham uma ligação entre elas.

Solução Ótima: Reestruturar hierarquia de tabelas do banco de dados do usuário.

Solução Desenvolvida: Lógica com o intuito de permitir a geração de queries SQL contendo cláusulas joins complexas para utilização no banco de dados do usuário.

Funcionamento: Através da view da aplicação, eram populados objetos ParametroSelect específicos. Estes objetos eram passados para a lógica GeraSelect. GeraSelect retornava uma String contendo a query desejada. A query era executada no banco e o resultado era exibido na tela.

Problem: The User Database contained many tables and tables were not always linked to each other.

Optimum Solution: Restructure user table tables hierarchy.

Developed Solution: Logic in order to allow the generation of SQL queries containing complex joins clauses for use in the user database.

Operation: Through the view of the application, specific ParametroSelect objects were populated. These objects were passed to the GeraSelect logic. GeraSelect returned a String containing the desired query. The query was executed in the database and the result was displayed on the screen.