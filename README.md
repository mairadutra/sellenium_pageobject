# sellenium_pageobject

 A proposta do padrão Page Object é de criar um objeto para cada pagina web, e utilizando a boa e velha orientação a objetos, encapsular em cada classe os atributos e métodos, como campos e ações de cada pagina. 

Dessa forma, se por exemplo fossemos testar uma página de login, teríamos a PageObjectLogin contendo os métodos e atributos da pagina e uma LoginTest, onde escreveriamos os métodos para testa-la. Mais informações em: https://github.com/SeleniumHQ/selenium/wiki/PageObjects

Neste projeto, temos uma Page que abriga os médotos e atributos da página "www.google.com.br" e uma página de Teste onde é feito o teste de efetuar uma busca por "selenium".
