package kreis.aula;

public class FoneHash {
    public static int hashPhoneNumber(String phoneNumber) {
        String dddString = phoneNumber.substring(0, 2);
        String numberString = phoneNumber.substring(2);

        int ddd = Integer.parseInt(dddString);
        long number = Long.parseLong(numberString);

        int hashedValue = (ddd + (int) (number % 89)) % 89; 
        int arrayIndex = 11 + hashedValue;

        return arrayIndex;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "551182335675"; // Exemplo de número de telefone
        int hashedIndex1 = hashPhoneNumber(phoneNumber1);
        System.out.println("Número de telefone: " + phoneNumber1);
        System.out.println("Índice hash: " + hashedIndex1);

    }
}