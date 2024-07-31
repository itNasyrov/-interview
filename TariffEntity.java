@Data
@Entity
@Table(name = "tariffs")
public class TariffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String default;

    @Column
    private String desc;

    @Column
    private int count;

    @Column
    private Long productTypeId;

}

@Repository
public interface TariffRepository extends JpaRepository<TariffEntity, Integer> {

    /**
     * Получить список продуктов по типу
     *
     * @param productTypeId - идентификатор типа
     * @return список продуктов
     */
    List<ProductEntity> findAllByProductType(Long productTypeId);

}