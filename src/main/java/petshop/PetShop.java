package petshop;

import java.util.*;

public class PetShop {


    static void main() {
        /*
        String nome = "Mel";
        String especie = "Cachorro";
        double peso = 8.5;

        System.out.printf("=== FICHA DO PET ===\nNome: %s\nEspécie: %s\nPeso: %.1f\n", nome, especie, peso);
        */
        /*Pet pet = new Pet();
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o nome do seu animal: ");
       pet.nome = sc.nextLine();

        System.out.println("Informe a espécie do seu animal:");
        pet.especie = sc.nextLine();


        System.out.println("Informe o peso do seu animal:");
        pet.peso = sc.nextDouble();

        /*if (pet.peso < 10){
            pet.porte= "Pequeno";
        } else if (pet.peso >=10 && pet.peso <25) {
            pet.porte = "Médio";
            
        }else {
            pet.porte = "Grande";
        }*/

       /* pet.porte = pet.definirPorte(); // método que foi criado na classe pet para evitar o uso de if e else aqui

        System.out.println("=== FICHA DO PET ===");
        System.out.printf("Nome: %s\nEspécie: %s\nPeso: %.1f\nPorte: %s", pet.nome, pet.especie, pet.peso, pet.porte);




        Pet[] petCadastrados = new Pet[5];
        petCadastrados[0] = pet; // guarda o pet do código acima
        System.out.println("--- PETS CADASTRADOS ---");
        System.out.printf("Nome: %s\nEspécie: %s\nPeso: %.1f\nPorte: %s", pet.nome, pet.especie, pet.peso, pet.porte);
        */


// criando um menu:
        Scanner sc = new Scanner(System.in);
        Pet[] petCadastrados = new Pet[5];
        int opcao = -1;
        int total = 0;
        ArrayDeque<String> filaBanho = new ArrayDeque<>();


        while (opcao != 0) { // enquanto a opção for diferente de 0 repete isso:

            System.out.println("\n--- MENU ---"); // essa parte do menu é a que aparece na tela para escolher:
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Listar Pets"); // caso queira vê os pets ja cadastrados
            System.out.println("3 - Buscar Pet pelo nome");
            System.out.println("4 - Mostrar espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo da fila");
            System.out.println("7 - Executar serviços");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {// depois do menu o switch decide o que fazer com a opção ecolhida
                    case 1: // cód para cadastrar o pet

                        System.out.println("Informe o nome do seu animal:");
                        String nome = sc.nextLine();

                        System.out.println("Informe a espécie do seu animal:");
                        String especie = sc.nextLine();
                        Pet pet;

                        if (especie.equalsIgnoreCase("cachorro")) {
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("gato")) {
                            pet = new Gato();
                        } else {
                            pet = new Pet();
                        }
                        pet.nome= nome;
                        pet.especie = especie;

                        System.out.println("Informe o peso do seu animal:");
                        pet.peso = sc.nextDouble();
                        sc.nextLine();

                        pet.porte = pet.definirPorte();

                        System.out.println("Pet cadastrado com sucesso!");

                        petCadastrados[total] = pet; // para guardar
                        total++; // vai somando

                        System.out.println("Agora existem " + total + " pets cadastrados.");

                        mostrarFicha(pet);

                        System.out.println("----------------");

                        mostrarFicha(pet, "=== FICHA DO PET ===");

                        break;

                    case 2:
                        System.out.println("\n--- PETS CADASTRADOS ---");
                        for (int i = 0; i < total; i++) {
                            System.out.printf("Nome: %s\n", petCadastrados[i].nome);
                            System.out.printf("Espécie: %s\n", petCadastrados[i].especie);
                            System.out.printf("Peso: %.1f kg\n", petCadastrados[i].peso);
                            System.out.printf("Porte: %s\n", petCadastrados[i].porte);

                            petCadastrados[i].emitirSom();
                            System.out.println();

                        }
                        break;

                    case 3:
                        System.out.println("Qual nome você procura? ");
                        String buscar = sc.nextLine();

                        boolean achou = false;
                        for (int i = 0; i < total; i++) {
                            if (petCadastrados[i].nome.equalsIgnoreCase(buscar)) {
                                System.out.printf("Encontrado: %s %s- %.1f kg  - Porte %s\n", petCadastrados[i].nome, petCadastrados[i].especie, petCadastrados[i].peso, petCadastrados[i].porte);
                                achou = true;
                            }
                        }
                        if (!achou) {
                            System.out.println("Pet não encontrado!");
                        }
                        break;

                    case 4:
                        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");

                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(petCadastrados[i].especie);
                        }

                        for (String item : especies) {
                            System.out.println("- " + item);
                        }

                        // mostra quantas espécies diferentes existem
                        System.out.println("Total de espécies diferentes: " + especies.size());


                        break;

                    case 5:

                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = sc.nextLine();

                        filaBanho.add(nomeFila);

                        System.out.println(nomeFila + " entrou na fila.");
                        System.out.println("Fila agora: " + filaBanho);

                        break;

                    case 6:
                        if (filaBanho.isEmpty()) {
                            System.out.println("Não há pets na fila.");
                        } else {

                            String proximo = filaBanho.peek();

                            System.out.println("Próximo da fila: " + proximo);

                            filaBanho.poll();

                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + filaBanho);
                        }

                        break;

                    case 7:
                        System.out.print("Nome do pet: ");
                        String nomePet = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();
                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico servico : servicos) {
                            servico.executar(nomePet);
                        }

                        System.out.println();

                        break;

                    case 0:
                        System.out.println("Você optou por sair.");
                        break;

                    default:
                        System.out.println("Opção inválida!");


                }

            } catch (InputMismatchException ime) {
                System.out.println("Digite apenas números!");
                sc.nextLine();


            }
        }

    }

    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    static void mostrarFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }
}
