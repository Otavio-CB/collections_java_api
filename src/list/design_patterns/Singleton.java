package list.design_patterns;

public class Singleton {
    private static Singleton instance;
    
    // Construtor privado para evitar a criação de instâncias diretas
    private Singleton() {
        // Inicialize aqui
    }
    
    // Método para obter a única instância da classe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Métodos adicionais da classe
    public void doSomething() {
        System.out.println("Fazendo alguma coisa...");
    }
    
    public static void main(String[] args) {
        // Testando o Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println("singleton1 e singleton2 são a mesma instância? " + (singleton1 == singleton2));
        
        singleton1.doSomething();
        singleton2.doSomething();
    }
}
