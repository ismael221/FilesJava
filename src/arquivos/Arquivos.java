
package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Arquivos {

    public static void main(String[] args) {
        
        //Criar Arquivo
        
         try{
            File obj = new File("c://java/arquivo.txt");
            if(obj.createNewFile()){
                System.out.println("Arquivo criado: "+ obj.getName());
            }else{
                System.out.println("Arquivo já existe.");
            }
        }catch(IOException e){
            System.out.println("Ocorreu um erro. "+e.getMessage());
        }
       
        //Ler arquivo
        
            try {
                  File obj = new File("C://java//arquivo.txt");
                  Scanner Reader = new Scanner(obj);
                  while (Reader.hasNextLine()) {
                      String data = Reader.nextLine();
                      System.out.println(data);
                  }
                  Reader.close();
              }
              catch (FileNotFoundException e) {
                  System.out.println("Ocorreu algum erro.");
              }
        
        //Gravar arquivo
        
              try {
                  FileWriter Writer = new FileWriter("C://java//arquivo.txt");
                  Writer.write("Gravando dados no arquivo!");
                  Writer.close();
                  System.out.println("Sucesso ao gravar no arquivo.");
              }
              catch (IOException e) {
                  System.out.println("Ocorreu algum erro.");
              }
          }
        
        //Excluir arquivo
        
         File obj = new File("C://java/arquivo.txt");
              if(obj.delete()){
                  System.out.println("Excluido o arquivo : " + obj.getName());
              }else {
                  System.out.println("Falha ao excluir o arquivo");
              }
            
    }

    

