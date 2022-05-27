/**
 * Найти ошибки в классах, предложить улучшения
 *
 * myService - java core;
 * TariffEntity - Hibernate;
 * TariffRepository - JPA.
 */

@Component
public class myService {

    String name;

    public void add(String content) {

        if (content.length() > 100) {
            content = content.substring(0, 100 - 3) + "...";
        }

        if (content.equals("П50"))

            content.replaceAll(".", ",");

            delete(content);
    }

    private int delete(String content) {

        int res;

        List<String> items = Arrays.asList(content.split("\\s*,\\s*"));

        items.stream().filter(s -> s.equals(0) ? true : s.equals("add") ? false : true).collect(Collectors.toList());

        res = items.count();
        res =+ 1;

        return res;
    }
}



@Data
@Entity
@Table(name = "tariffs")
public class TariffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String name;

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
