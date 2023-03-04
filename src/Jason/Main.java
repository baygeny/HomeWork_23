package Jason;

import java.io.IOException;

public class Main {
          public static void main(String[] args) throws IOException {
              GsonParser.parseJson("https://api.monobank.ua/bank/currency");
        }
}
