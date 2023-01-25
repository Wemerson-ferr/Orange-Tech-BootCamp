# O que é herança:
É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.
<img src="https://miro.medium.com/max/640/0*wrxNDC9_W8juLLyl.webp" alt="MarineGEO circle logo" style="margin: auto; display: block; "/>
Acima está descrito um exemplo de classe simples, tipo presente na linguagem Java. Lembrando que Java não suporta herança multipla.

## Upcast e Downcast
- _**Upcasting**_ é fazer um objeto se passar por um objeto que seja um supertipo dele. Ele sempre funcionará já que todo objeto é completamente compatível com um tipo do qual ele foi derivado. Como sempre pode ser realizado, é possível fazer implicitamente, ou seja, o compilador faz por você quando for necessário.

- _**Downcasting**_ é quando o objeto se passa como se fosse um subtipo dele. Não há garantias que funcione (pode lançar uma `ClassCastException`, o que obviamente é um erro de programação) e pode haver necessidade de conversões. O compilador só aceita se ele puder provar que o objeto se encaixará perfeitamente e seja de fato aquele objeto. Por isso deve ser explicitado pelo programador quando deseja essa ação. A coerção ocorre em tempo de execução.
<img src="https://www.scaler.com/topics/images/upcasting-and-downcasting-in-java-thumbnail.webp" alt="Upcasting and DownCasting" style="width: 300; height: 300px; margin: auto; display: block; "/>
```csharp
Child a = new Parent();//Upcasting: transforma filho na mãe
```

```csharp
Parent b = (Parent)new Child();//Downcasting: mãe no filho
```
>__Lembrando que este downcasting pode gerar erros__

## Polimorfismo e sobrescrita:
- Polimorfismo: É a capacidade de um metodo ou objeto se passar pelo seu parente, usando de informações herdadas, como metodos genericos. Quando não há a sobrescrita pode ocorrer o polimorfismo "bruto" onde o método de interesse virá da classe mãe
<img src="https://uploaddeimagens.com.br/images/004/310/352/full/Classe_Animal.png?1674568764" alt="MarineGEO circle logo" style="margin: auto; display: block; width: 300px; heigth: 300px"/>
Obseve que as classes filhas modificam o metodo setFala() de acordo com a nescessidade de cada um. Este tipo de polimorfismo é de sobrescrita.

- Sobrescrita: Por sua vez a sobrescrita diz basicamente um tipo de polimorfismo onde o método herdado muda somente seu comportamento, ou seja, sua estrutura continua a mesma (assinatura, parâmetros, retorno), por exemplo, a Classe Gato herdar o método setFala e modifica-lo a sua necessidade.  Usamos a notação @override para indicar a sobrescrita de métodos.
```csharp
@Override setFala(){
this.fala = "Miau"
}
```
[[0]]                                                                                                                                      [[Sobre_Associacao|Associação ->]]
