import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


class Elevador {
    private int numero_pessoas;
    private int andar_atual; 
    private int total_andares;
    private int capacidade;
    public Elevador(){
        System.out.printf("O elevador chegou !");
    }
    public void Inicializar( int _capacidade, int _total_andares ){
        this.capacidade = _capacidade;
        this.total_andares = _total_andares;
        this.numero_pessoas = 0;
        this.andar_atual = 0;
    }
    public void Entra(){
        if(capacidade == numero_pessoas){
            System.out.printf("O elevador esta cheio !");
        }else{
          numero_pessoas++;
        }
    }
    public void Sai(){
        if(capacidade == 0){
            System.out.printf("O elevador esta cheio !");
        }else{
          numero_pessoas--;
        }
    }
    public void Sobe(){
        if(andar_atual == total_andares){
            System.out.printf("Ultimo andar !");
        }else{
          andar_atual++;
        }
    }
    public void Desce(){
        if(andar_atual == 0){
            System.out.printf("Esta no terreo !");
        }else{
            andar_atual--;
        }
    }
    public int getAndar(){
        return  andar_atual;
    }
    public int getTotal(){
        return total_andares;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public int getNumeroPessoas(){
        return numero_pessoas;
    }
}


public class Q2 {
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("/home/k/Área de Trabalho/Java/Arquivo.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader b = new BufferedReader(ainput);
        String line=b.readLine();
        String line2=b.readLine();
        int andares = Integer.parseInt(line);
        int capacidade= Integer.parseInt(line2);
        Elevador elevador = new Elevador();
        elevador.Inicializar(capacidade,andares);
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Desce();
        elevador.Desce();
        elevador.Desce();
        elevador.Sai();
        elevador.Desce();
    }
}

