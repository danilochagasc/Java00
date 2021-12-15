import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

class Pessoa {
        private String nome;
        private int altura;
        private int data;
        
        public Pessoa(String _nome, int _altura, int _data) {
            this.nome = _nome;
            this.altura = _altura;
            this.data = _data;
        }
        public Pessoa() {
        }
        public String getNome(){
    
            return nome;
        }
        public int getAltura(){
      
            return altura;
        }
        public int getData(){
          
            return data;
        }
        public int CalculaData(){
            return 2021-data;
        }
    }

public class  Q1 {
    
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("/home/k/Área de Trabalho/Java/Arquivo.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader b = new BufferedReader(ainput);
        String nome= b.readLine();
        String line=b.readLine();
        String line2=b.readLine();
        int altura = Integer.parseInt(line);
        int data= Integer.parseInt(line2);
        Pessoa pessoa = new Pessoa(nome,altura,data); 
        System.out.printf("Nome:");
        System.out.println(pessoa.getNome());
        System.out.printf("Altura:");
        System.out.println(pessoa.getAltura());
        System.out.printf("Idade:");
        System.out.println(pessoa.CalculaData());
    }
}