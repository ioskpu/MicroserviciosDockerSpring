@Entity
@Table(name = "mesas")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa", unique = true, nullable = false)
    private Long id_mesa;

    @Column(name = "numero_mesa", unique = true)
    private String numeroMesa;

    @Column(name = "capacidad")
    private integer capacidad;

    @Column(name = "estado")
    private String estado;
}