@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteDTO {
    @JsonProperty("idCliente")
    private Long id_cliente;

    @NotBlank(message = "Nombre Invalido")
    @JsonProperty("nombreCliente")
    private String nombreCliente;

    @Email(message = "Email Invalido")
    @JsonProperty("email")
    private String email;

    @NotBlank(message = "Telefono Invalido")
    @JsonProperty("telefono")
    private String telefono;
}