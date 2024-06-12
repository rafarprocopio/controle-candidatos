public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        analisarCandidato(1850.0);
        analisarCandidato(2300.00);
        analisarCandidato(2000.0);

    }
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0
        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual]; 
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;         
        }
    }

    private static double valorPretendido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valorPretendido'");
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");            
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");            
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

}