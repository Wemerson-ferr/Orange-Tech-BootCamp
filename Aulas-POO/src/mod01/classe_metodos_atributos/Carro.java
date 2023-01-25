package mod01.classe_metodos_atributos;
/**
 * <h1>Classe carro</h1>
 * <p>Esta classe irá criar um objeto do tipo carro, que será usado no exercicio</p>
 * <h2>Atributos:</h2>
 * <ul>
 *  <li>Cor</li>
*   <li>Marca</li>
*   <li>Capacidade do tanque</li>
 * </ul>
 * <h2>Metodos:</h2>
 * 
 * 
 */

public class Carro {//Este é o inicio da classe carro
    String cor; //Atributos -> São "variáveis", porém representam informações do objeto
    String marca; //Por padrão, atributos geralmente não são inicializados.
    int capacidadeTanque; //Seu tipo deve ser bem escolhido e especifico

    Carro(){//Metodo responsavel por criar o objeto, quando SEM parametros é opcional seu uso
        this("Desconhecida","Desconhecida", 0);//Opcional, para nao iniciar vazio
    }
    Carro(String cor, String marca, int capacidadeTanque){//Construtor com parametros
        this.cor = cor;
        this.marca = marca;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String novaCor){//Metodo que devine uma nova cor ao objeto já criado
        this.cor = novaCor;
    }
    String getCor(){
        return this.cor;
    }

    void setMarca(String novaMarca){
        this.marca = novaMarca;
    }
    String getMarca(){
        return this.marca;
    }

    void setCapacidadeTanque(int novaCapacidadeTanque){
        this.capacidadeTanque = novaCapacidadeTanque;
    }
    int getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    /**
     * 
     * @param precoPorLitro
     * @return Total para encher o tanque
     */
    Double encherTanque(Double precoPorLitro){
        return getCapacidadeTanque()*precoPorLitro;
    }
}
