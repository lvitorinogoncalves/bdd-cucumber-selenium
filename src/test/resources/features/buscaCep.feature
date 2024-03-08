#language: pt
@selenium
Funcionalidade: Busca de CEP

  Cenário: Buscar CEP pelo Logradouro
    Dado Que eu navegue para o site do correios
    Quando eu informar o estado de 'SC', localidade 'Criciuma', bairro 'Vila Rica'
    E clicar no botao Buscar
    Então devera existir um logradouro chamado 'Rua Manoel Jovino Patrício'

#  Cenário: Buscar CEP pelo Logradouro
##    Dado Que eu navegue para o site do correios
##    Quando eu informar o estado de 'DF', localidade 'Criciuma', bairro 'Vila Rica'
##    E clicar no botao Buscar
##    Então devera existir um logradouro chamado 'Rua Manoel Jovino'