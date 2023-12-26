@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MesaDTO {

    @JsonProperty("idMesa")
    private Long idMesa;

    @NotBlank(message = "Numero Mesa Invalido")
    @JsonProperty("numeroMesa")
    private String numeroMesa;

    @NotNull(message = "Capacidad Mesa Invalido")
    @JsonProperty("capacidad")
    private Integer capacidad;

    @NotBlank(message = "Estado Mesa Invalido")
    @JsonProperty("estado")
    private String estado;
}