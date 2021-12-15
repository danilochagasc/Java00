import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;




class Estacionamento {
    private String modelo;
    private String placa;
    private int entrada;
    private int saida;
    
    public Estacionamento(String _modelo, String _placa, int _entrada, int _saida) {
        this.modelo = _modelo;
        this.placa = _placa;
        this.entrada = _entrada;
        this.saida = _saida;
    }
    public String getNome(){

        return modelo ;
    }
    public String getPlaca(){
  
        return placa;
    }
    public int getEntrada(){
        return entrada;
    }
    public int getSaida(){
        return saida;
    }
    public int CalculaValor(){
        float valor;
        valor = entrada - saida;
        return (int) (valor * 150);
    }
}

public class Q3 {
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("/home/k/Área de Trabalho/Java/Arquivo.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader b = new BufferedReader(ainput);
        String modelo=b.readLine();
        String placa=b.readLine();
        String line=b.readLine();
        String line2=b.readLine();
        int entrada = Integer.parseInt(line);
        int saida = Integer.parseInt(line2);
        Estacionamento estacionamento = new Estacionamento(modelo,placa,entrada,saida); 
        System.out.printf("Modelo:");
        System.out.println(estacionamento.getNome());
        System.out.printf("Placa:");
        System.out.println(estacionamento.getPlaca());
        System.out.printf("Entrada:");
        System.out.println(estacionamento.getEntrada());
        System.out.printf("Saida:");
        System.out.println(estacionamento.getSaida());
        System.out.printf("Valor pago:");
        System.out.println(estacionamento.CalculaValor()/100);
    }
}