
public record ClienteDTO (String nome, String email, String username) {

    public static ClienteDTO from(Cliente cliente) {
        return new ClienteDTO(cliente.nome() + " " + cliente.sobrenome(), cliente.email(),
                (cliente.nome().substring(0, 1) + cliente.sobrenome()).toLowerCase());
    }
}
