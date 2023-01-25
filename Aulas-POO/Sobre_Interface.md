# Interface:
*Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar  **todos** os comportamentos que a interface disponibiliza. Os métodos da interface são sempre **abstract.***
```Java
	interface A{
		void metodoX();//Não contem corpo por ser abstract
	}
	class B implements A{//A palavra implementes indica o uso da interface em Java
		@override
		void metodoX(){
			...//Aqui o método será especializado
		}
	}
```
