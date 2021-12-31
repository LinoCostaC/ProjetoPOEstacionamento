
package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaUtilizador implements Serializable{
     HashMap<String, Utilizador> repositorio;
        
        public ListaUtilizador() {
        this.repositorio = new HashMap<>();
        }

   
 //erro se nao existir ao remover
    public class UtilizadorNaoExistenteException extends Exception {
        public UtilizadorNaoExistenteException() { }
        public UtilizadorNaoExistenteException(String message) {
            super(message);
        }        
    }
    //erro ao criar se houver duplicado
    public class UtilizadorDuplicadoException extends Exception {
        public UtilizadorDuplicadoException() { }
        public UtilizadorDuplicadoException(String message) {
            super(message);
        }        
    }
    //adiciona um user
    public void addUser(Utilizador utilizador) {
        if (utilizador == null) {
           throw new NullPointerException("O valor utilizador não pode ser nulo");
       }
        if (repositorio.containsKey(utilizador.getUsername())){
            System.err.println("Ja existe esse utilizador");}
        else{
            repositorio.put(utilizador.getUsername(), utilizador);
        }
    }
     //remove um user
    public void removeUser(Utilizador utilizador) {
        if (utilizador == null) {
           throw new NullPointerException("O valor utilizador não pode ser nulo");
       }
        if (repositorio.containsKey(utilizador.getUsername())){
            repositorio.remove(utilizador.getUsername());}
        else{
            System.err.println("Utilizador não existe");
        }
    }
    public ArrayList getSeguranca(){
           
       ArrayList<String> ListaSeguranca = new ArrayList();
        for (Utilizador user : repositorio.values()){
          if(user instanceof Seguranca) {
              ListaSeguranca.add((String) user.getnome());
          }
        }
        return ListaSeguranca;
   }
     //retorna uma lista de seguranca
    public ArrayList getSegurancas(){
           
       ArrayList<Seguranca> ListaSeguranca = new ArrayList();
        for (Utilizador user : repositorio.values()){
          if(user instanceof Seguranca) {
              ListaSeguranca.add((Seguranca) user);
          }
        }
        return ListaSeguranca;
   }
     public Utilizador getUser(String username) throws UtilizadorDuplicadoException {
        if (repositorio.containsKey(username)){
            return repositorio.get(username);
        }else{
            throw new UtilizadorDuplicadoException("O utilizador '%s' não existe na lista");
        } 
  }
      //verifica se existe um user no hashmap
  public boolean existeUser(String username) {
      return repositorio.containsKey(username);
  }
  
  //tamanho do hashmap
   public int size() {
        return repositorio.size();
    }
  
   //arraylist com todos os users
  public ArrayList<Utilizador> todos() {
        return new ArrayList<>(repositorio.values());
    }
   @Override
    public String toString() {
        return "Lista_Utilizadores{" + "repositorio=" + repositorio + '}';
    }
    
}

