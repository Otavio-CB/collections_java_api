package list.design_patterns;

// Subsistema com várias classes
class SubsistemaA {
    public void operacaoA() {
        System.out.println("Operação A do Subsistema A");
    }
}

class SubsistemaB {
    public void operacaoB() {
        System.out.println("Operação B do Subsistema B");
    }
}

class SubsistemaC {
    public void operacaoC() {
        System.out.println("Operação C do Subsistema C");
    }
}

// Facade que simplifica o acesso ao subsistema
class Facade {
    private SubsistemaA subsistemaA;
    private SubsistemaB subsistemaB;
    private SubsistemaC subsistemaC;
    
    public Facade() {
        subsistemaA = new SubsistemaA();
        subsistemaB = new SubsistemaB();
        subsistemaC = new SubsistemaC();
    }
    
    public void operacaoSimples() {
        System.out.println("Operação Simples usando a Facade:");
        subsistemaA.operacaoA();
        subsistemaB.operacaoB();
        subsistemaC.operacaoC();
    }
}

public class FacadeExample {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operacaoSimples();
    }
}

