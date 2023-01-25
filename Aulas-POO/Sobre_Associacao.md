# Associação:
Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos.

## Associação estrutural
- Composição: Quando um objeto que está associado a outro existe somente para uso naquele objeto. Exemplo: Uma classe Nó que so irá existir para uso dentro de um classe Arvore. Ou o objeto endereço que só existe dentro do Objeto pessoa.

- Agregação: Quando um objeto que está associado à outro pode existir fora dessa associação, exemplo: O objeto Aluno pode existir fora do objeto Disciplina.

>Nota: No código não existe essa identificação, são basicamente objetos dentro de outro objeto. Porém há essa diferenciação para ajudar o desenvolvedor entender as relações dos objetos. 

## Associação comportamental: 
Quando a presença de um objeto dentro de outro afeta o comportamento deste, exemplo:
```csharp
	void finalizarCompra(){
		//finaliza normalmente
	}
	void finalizarCompra(Objeto cupom){
		//Finaliza com alguma promoção/ desconto.
	}
```
[<- Herança](Sobre_Heranca)                                                                                                                          [Interface ->](Sobre_Interface)