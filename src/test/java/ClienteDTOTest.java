import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteDTOTest {

    @Test
    public void deve_converter_cliente_para_clienteDTO_cocatenando_o_nome_e_sobrenome_no_atributo_nome() {
        ClienteDTO clienteDTO = ClienteDTO.from(new Cliente("Iago", "Teles", "iago@test.com"));

        assertEquals("Iago Teles", clienteDTO.nome(),
                "O nome de DTO deve ser uma concatenação de Nome e Sobrenome da classe Cliente.");
    }

    @Test
    public void o_campo_username_deve_ser_a_combinacao_da_primeira_letra_do_primero_nome_com_o_sobrenome() {
        ClienteDTO clienteDTO = ClienteDTO.from(new Cliente("Iago", "Teles",
                "iago@test.com"));

        assertEquals("iteles", clienteDTO.username(),
                "Username inválido, deve ser a combinação da primeira letra do primeiro nome com o sobrenome.");
    }

}
