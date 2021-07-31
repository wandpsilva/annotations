package anotacoes;

import anotacoes.annotation.ValidaPessoa;
import anotacoes.model.Cliente;

import java.lang.reflect.Field;

/**
 * Exemplo de uso de reflection / annotation
 *
 * @author Wanderlucio P da Silva
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Anotacoes");
        cli.setCpf(12345678901L);
        cli.setPessoa("U"); //deve falhar

        try {
            Class<?> classe = cli.getClass();
            for (Field field : classe.getDeclaredFields()) {
                if (field.isAnnotationPresent(ValidaPessoa.class)) {
                    field.setAccessible(true);
                    if (!"F".equals(field.get(cli).toString())) {
                        System.out.println(ValidaPessoa.class.getMethod("message").getDefaultValue());
                    }
                }
            }
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchMethodException exception) {
            System.out.println("Erro: " + exception);
        }

    }
}
