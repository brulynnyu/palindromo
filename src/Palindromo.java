import java.util.stream.IntStream;

public class Palindromo {

        public boolean verifyPalindromo(String frase) {
            String fraseFiltrada = frase.replaceAll("[\\W]", "").toUpperCase().replace(" ", "");
            return IntStream.range(0, fraseFiltrada.length() / 2)
                    .noneMatch(i -> fraseFiltrada.charAt(i) != fraseFiltrada.charAt(fraseFiltrada.length() - i - 1));
        }
    }    
