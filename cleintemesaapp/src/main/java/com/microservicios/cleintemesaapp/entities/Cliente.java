@Entity
@Table(name = "CLIENTES")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", unique = true, nullable = false)
    private Long id_cliente;

    @Column(name = "nombre_cliente")
    private String nombre_cliente;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "telefono")
    private String telefono;
}